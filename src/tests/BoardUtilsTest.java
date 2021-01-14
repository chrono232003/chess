package tests;

import org.junit.Test;
import pieces.King;
import pieces.Piece;
import utils.BoardUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardUtilsTest {
    @Test
    public void testCheckIfNewLocationIsValid() {
        Piece piece = new King();
        ArrayList<Integer> oldLoc = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> newLoc = new ArrayList<>(Arrays.asList(1,3));
        boolean validMove = BoardUtils.checkIfNewLocationIsValid(piece, oldLoc, newLoc);
        assert validMove;
    }

    //@Test
//    public void testGetMoveCoords() {
//        ArrayList<Integer> oldLoc = new ArrayList<>(Arrays.asList(8,0));
//        ArrayList<Integer> newLoc = new ArrayList<>(Arrays.asList(0,8));
//
//        ArrayList<Integer> coords = BoardUtils.getMoveCoords(oldLoc, newLoc);
//
//        ArrayList<Integer> newCoordsCheck = new ArrayList<>();
//        newCoordsCheck.add(oldLoc.get(0) + coords.get(0));
//        newCoordsCheck.add(oldLoc.get(1) + coords.get(1));
//
//        System.out.println(newCoordsCheck);
//        System.out.println(newLoc);
//        assert newCoordsCheck.equals(newLoc);
//    }

}
