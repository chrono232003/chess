package board;

import pieces.*;
import utils.BoardUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Board{

    //console colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private Square[][] board;

    private ArrayList<Piece> capturedPieces = new ArrayList<>();

    public Board() {
        SetUp boardSetup = new SetUp();
        board = boardSetup.setInitialBoardPieces();
        displayBoard();
    }

    public void displayBoard() {
        //display the names in each respective square.
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {

                //check if the square has a piece in it. If so display the piece name, otherwise the square name.
                String squareDisplay = (board[j][i].getPiece().getName() != null) ? board[j][i].getPiece().getName() : board[j][i].displayLocation;

                //add colors!!
                //System.out.println(squareDisplay.charAt(squareDisplay.length()-1));
                if (squareDisplay.contains("W")) {
                    System.out.print(ANSI_WHITE + squareDisplay + ANSI_RESET);
                } else if (squareDisplay.contains("B")) {
                    System.out.print(ANSI_BLUE + squareDisplay + ANSI_RESET);
                } else {
                    System.out.print(ANSI_GREEN + squareDisplay + ANSI_RESET);
                }
            }
            System.out.println("\n\n");
        }

        //display captured pieces.
        System.out.println("Captured Pieces:");
        for (Piece piece : capturedPieces) {
            System.out.print(piece.getName());
        }
        System.out.println("\n\n");
    }


    public void movePiece(String pieceToMoveName, String newLoc) {
        System.out.println("piece to move: " +  pieceToMoveName);
        System.out.println("newLoc: " +  newLoc);

        //find orig location by piece name
        boolean pieceFound = false;
        for (int v = 0; v<8; v++) {
            for (int h = 0; h < 8; h++) {
                if (board[h][v].getPiece().getName() != null) {
                    if (pieceToMoveName.trim().equals(board[h][v].getPiece().getName().trim())) {
                        //we found the piece! now find the location by the square it is in.
                        pieceFound = true;

                        ArrayList<Integer> origLoc = board[h][v].getLocation();

                        //get the piece
                        Piece pieceToMoveObj = board[h][v].getPiece();

                        //get new location square
                        Square newLocSquare = BoardUtils.findSquareByDisplayName(board, newLoc);

                        //check to see if the move is valid. Number of spaces, pieces inbetween target etc.
                        boolean validMove = BoardUtils.checkIfNewLocationIsValid(pieceToMoveObj, origLoc, newLocSquare.getLocation());

                        if (validMove) {
                        //check if new square has a piece on it. If so, if it is the opponent, take out, otherwise throw error.
                        if (newLocSquare.hasPiece()) {
                            if (newLocSquare.getPiece().getTeam() != null) {
                                //check team. if same team as piece moving in, throw an error.
                                if (pieceToMoveName.contains(newLocSquare.getPiece().getTeam().toString())) {
                                    //same team, throw an error.
                                    displayBoard();
                                    System.out.println("Cannot move on square with own player.");
                                    return;
                                } else {
                                    //different team, remove the existing piece in the new square and put into captured array.
                                    capturedPieces.add(newLocSquare.getPiece());

                                }
                            }
                        }

                        //move the piece to the new location.
                        newLocSquare.setPiece(pieceToMoveObj);

                        //remove the piece from this location
                        board[h][v].setPiece(new Piece());

                        displayBoard();
                        return;
                        } else {
                            displayBoard();
                            System.out.println("This move is not valid, try another move.");
                            return;
                        }
                    }
                }
            }
        }
        displayBoard();
        if (!pieceFound) {
            System.out.println("Could not find piece typed, try again.");
        }

    }

    public Square[][] getBoard() {
        return board;
    }

    public ArrayList<Piece> getCapturedPieces() {
        return capturedPieces;
    }

    public void setCapturedPieces(ArrayList<Piece> capturedPieces) {
        this.capturedPieces = capturedPieces;
    }
}
