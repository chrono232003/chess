package pieces;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen() {
        super('Q');
    }

    //change
    @Override
    void createMovesList() {
//        ArrayList<String> moves = new ArrayList<>();
//        moves.add("2,1");
//        moves.add("2,-1");
//        moves.add("1,2");
//        moves.add("1,-2");
//        moves.add("-2,1");
//        moves.add("-2,-1");
//        moves.add("-1,2");
//        moves.add("-1,-2");
//        super.setPossibleMoves(moves);
    }
}
