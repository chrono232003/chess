package board;


import pieces.*;
import java.util.ArrayList;

//A helper class to set up the game and all of the pieces.
public class SetUp {

    private static Character WHITE_TEAM_PREFIX = 'W';
    private static Character BLACK_TEAM_PREFIX = 'B';

    Square[][] board = new Square[8][8];

    public Square[][] setInitialBoardPieces() {

        //fill the board with square values.
        for (int v = 0; v<8; v++) {
            for (int h = 0; h<8; h++) {
                board[h][v] = new Square(h, v);
                board[h][v].setPiece(new Piece());
            }
        }

        //set white pieces
        addPiece(new Rook(), 0,0, WHITE_TEAM_PREFIX, '1');
        addPiece(new Knight(), 1,0, WHITE_TEAM_PREFIX, '1');
        addPiece(new Bishop(), 2,0, WHITE_TEAM_PREFIX, '1');
        addPiece(new King(), 3,0, WHITE_TEAM_PREFIX, null);
        addPiece(new Queen(), 4,0, WHITE_TEAM_PREFIX, null);
        addPiece(new Bishop(), 5,0, WHITE_TEAM_PREFIX, '2');
        addPiece(new Knight(), 6,0, WHITE_TEAM_PREFIX, '2');
        addPiece(new Rook(), 7,0, WHITE_TEAM_PREFIX, '2');

        addPiece(new Pawn(), 0,1, WHITE_TEAM_PREFIX, '1');
        addPiece(new Pawn(), 1,1, WHITE_TEAM_PREFIX, '2');
        addPiece(new Pawn(), 2,1, WHITE_TEAM_PREFIX, '3');
        addPiece(new Pawn(), 3,1, WHITE_TEAM_PREFIX, '4');
        addPiece(new Pawn(), 4,1, WHITE_TEAM_PREFIX, '5');
        addPiece(new Pawn(), 5,1, WHITE_TEAM_PREFIX, '6');
        addPiece(new Pawn(), 6,1, WHITE_TEAM_PREFIX, '7');
        addPiece(new Pawn(), 7,1, WHITE_TEAM_PREFIX, '8');


        //set black pieces
        addPiece(new Rook(), 0,7, BLACK_TEAM_PREFIX,'1');
        addPiece(new Knight(), 1,7, BLACK_TEAM_PREFIX, '1');
        addPiece(new Bishop(), 2,7, BLACK_TEAM_PREFIX, '1');
        addPiece(new King(), 3,7, BLACK_TEAM_PREFIX, null);
        addPiece(new Queen(), 4,7, BLACK_TEAM_PREFIX, null);
        addPiece(new Bishop(), 5,7, BLACK_TEAM_PREFIX,'2');
        addPiece(new Knight(), 6,7, BLACK_TEAM_PREFIX,'2');
        addPiece(new Rook(), 7,7, BLACK_TEAM_PREFIX, '2');

        addPiece(new Pawn(), 0,6, BLACK_TEAM_PREFIX,'1');
        addPiece(new Pawn(), 1,6, BLACK_TEAM_PREFIX, '2');
        addPiece(new Pawn(), 2,6, BLACK_TEAM_PREFIX, '3');
        addPiece(new Pawn(), 3,6, BLACK_TEAM_PREFIX, '4');
        addPiece(new Pawn(), 4,6, BLACK_TEAM_PREFIX, '5');
        addPiece(new Pawn(), 5,6, BLACK_TEAM_PREFIX, '6');
        addPiece(new Pawn(), 6,6, BLACK_TEAM_PREFIX, '7');
        addPiece(new Pawn(), 7,6, BLACK_TEAM_PREFIX, '8');

        return board;
    }

     private void addPiece(Piece piece, int x, int y, Character team, Character number) {
        ArrayList<Integer> loc = new ArrayList<>();
        loc.add(x);
        loc.add(y);
        piece.setLocation(loc);
        piece.setName(team, number);
        board[x][y].setPiece(piece);
    }

}
