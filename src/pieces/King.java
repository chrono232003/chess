package pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class King extends Piece {

    public King() {
        super('K');
        createMovesList();
    }

    @Override
    void createMovesList() {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        moves.add(new ArrayList<>(Arrays.asList(1,1)));
        moves.add(new ArrayList<>(Arrays.asList(1,-1)));
        moves.add(new ArrayList<>(Arrays.asList(1,0)));
        moves.add(new ArrayList<>(Arrays.asList(-1,1)));
        moves.add(new ArrayList<>(Arrays.asList(-1,-1)));
        moves.add(new ArrayList<>(Arrays.asList(-1,0)));
        moves.add(new ArrayList<>(Arrays.asList(0,1)));
        moves.add(new ArrayList<>(Arrays.asList(0,-1)));
        super.setPossibleMoves(moves);
    }
}
