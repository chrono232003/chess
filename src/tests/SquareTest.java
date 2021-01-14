package tests;

import board.Square;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testSetDisplayLocation() {
        Square square = new Square(1,2);
        square.setDisplayLocation();
        assert square.getDisplayLocation().trim().equals("bc");
    }
}
