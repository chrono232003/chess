package utils;

import board.Square;
import pieces.Piece;
import java.util.ArrayList;
import java.util.Arrays;

public class BoardUtils {

    public static Square findSquareByDisplayName(Square[][] board, String displayName) {
        ArrayList<Character> letterArr = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h'));
        return board[letterArr.indexOf(displayName.charAt(0))][letterArr.indexOf(displayName.charAt(1))];
    }

    public static boolean checkIfNewLocationIsValid(Piece piece, ArrayList<Integer> oldLoc, ArrayList<Integer> newLoc) {


        ArrayList<ArrayList<Integer>> possibleMoves = piece.getPossibleMoves();

        //if the piece does not have a move list, let the move be valid, for now.
        if (!possibleMoves.isEmpty()) {

            ArrayList<Integer> moveCoords = getMoveCoords(oldLoc, newLoc);

            //check to see if the move coords are in the list of valid moves for the piece.
            Boolean validMove = false;
            for (ArrayList<Integer> move : possibleMoves) {
                if (move.equals(moveCoords)) {
                    validMove = true;
                }
            }
            return validMove;
        }

        //move list not found
        return true;
    }

    private static ArrayList<Integer> getMoveCoords(ArrayList<Integer> oldLoc, ArrayList<Integer> newLoc) {
        ArrayList<Integer> moveCoords = new ArrayList<>();
        moveCoords.add(newLoc.get(0) - oldLoc.get(0));
        moveCoords.add(newLoc.get(1) - oldLoc.get(1));

        return moveCoords;
    }
}
