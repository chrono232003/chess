package tests;

import board.SetUp;
import board.Square;
import org.junit.Test;

public class SetUpTest {

    SetUp boardSetup;

    @Test
    public void testSetup() {
        boardSetup = new SetUp();
        Square[][] board = boardSetup.setInitialBoardPieces();

        assert board[0][0].getPiece().getClass().getName().equals("pieces.Rook");
        assert board[0][0].getPiece().getName().trim().equals("RW1");

        assert board[4][0].getPiece().getClass().getName().equals("pieces.Queen");
        assert board[4][0].getPiece().getName().trim().equals("Q-W");

        assert !board[4][3].hasPiece();
        assert board[4][3].getDisplayLocation().trim().equals("ed");


        assert board[0][6].getPiece().getClass().getName().equals("pieces.Pawn");
        assert board[0][6].getPiece().getName().trim().equals("PB1");

        assert board[1][7].getPiece().getClass().getName().equals("pieces.Knight");
        assert board[6][7].getPiece().getName().trim().equals("NB2");
    }
}
