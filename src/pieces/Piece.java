package pieces;

import java.util.ArrayList;

public class Piece {

    private Character piecePrefix;

    private String name;
    private Character team;
    private ArrayList<Integer> location = new ArrayList<>();

    private ArrayList<ArrayList<Integer>> possibleMoves = new ArrayList<>();

    public Piece() {}

    public Piece(Character piecePrefix) {
        this.piecePrefix = piecePrefix;
    }

    public ArrayList<Integer> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(Character team, Character number) {
        this.team = team;
        if (number == null) {
            this.name = " " + piecePrefix +"-"+ team + " ";
        } else {
            this.name = " " + piecePrefix + team + number + " ";
        }
    }

    public ArrayList<ArrayList<Integer>> getPossibleMoves() {
        return possibleMoves;
    }

    public void setPossibleMoves(ArrayList<ArrayList<Integer>> possibleMoves) {
        this.possibleMoves = possibleMoves;
    }

    public Character getTeam() {
        return team;
    }

    public Character getPiecePrefix() {
        return piecePrefix;
    }

    public void setPiecePrefix(Character piecePrefix) {
        this.piecePrefix = piecePrefix;
    }


    //helper methods
    void createMovesList() {}

}
