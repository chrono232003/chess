package pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends Piece {

    public Knight() {
        super('N');
        createMovesList();
    }

    @Override
    void createMovesList() {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        moves.add(new ArrayList<>(Arrays.asList(2,1)));
        moves.add(new ArrayList<>(Arrays.asList(2,-1)));
        moves.add(new ArrayList<>(Arrays.asList(1,2)));
        moves.add(new ArrayList<>(Arrays.asList(1,-2)));
        moves.add(new ArrayList<>(Arrays.asList(-2,1)));
        moves.add(new ArrayList<>(Arrays.asList(-2,-1)));
        moves.add(new ArrayList<>(Arrays.asList(-1,2)));
        moves.add(new ArrayList<>(Arrays.asList(-1,-2)));
        super.setPossibleMoves(moves);
    }
}
