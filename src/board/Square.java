package board;

import pieces.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class Square {

    Piece piece;

    private ArrayList<Integer> location = new ArrayList<>();

    String displayLocation;

    public Square(int x, int y) {
        location.add(x);
        location.add(y);
        setDisplayLocation();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean hasPiece() {
        return this.piece.getName() != null;
    }

    public String getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation() {
        ArrayList<Character> letterArr = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h'));

        if (!location.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            builder.append(letterArr.get(location.get(0)));
            builder.append(letterArr.get(location.get(1)));
            displayLocation = "  " + builder.toString() + " ";
        }
    }

    public ArrayList<Integer> getLocation() {
        return location;
    }
}
