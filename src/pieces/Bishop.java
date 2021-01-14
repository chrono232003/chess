package pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class Bishop extends Piece {
    public Bishop() {
        super('B');
        createMovesList();
    }

    @Override
    void createMovesList() {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        moves.add(new ArrayList<>(Arrays.asList(-1,1)));
        moves.add(new ArrayList<>(Arrays.asList(-2,2)));
        moves.add(new ArrayList<>(Arrays.asList(-3,3)));
        moves.add(new ArrayList<>(Arrays.asList(-4,4)));
        moves.add(new ArrayList<>(Arrays.asList(-5,5)));

        moves.add(new ArrayList<>(Arrays.asList(-1,-1)));
        moves.add(new ArrayList<>(Arrays.asList(-2,-2)));
        moves.add(new ArrayList<>(Arrays.asList(-3,-3)));
        moves.add(new ArrayList<>(Arrays.asList(-4,-4)));
        moves.add(new ArrayList<>(Arrays.asList(-5,-5)));

        moves.add(new ArrayList<>(Arrays.asList(1,-1)));
        moves.add(new ArrayList<>(Arrays.asList(2,-2)));
        moves.add(new ArrayList<>(Arrays.asList(3,-3)));
        moves.add(new ArrayList<>(Arrays.asList(4,-4)));
        moves.add(new ArrayList<>(Arrays.asList(5,-5)));

        moves.add(new ArrayList<>(Arrays.asList(1,1)));
        moves.add(new ArrayList<>(Arrays.asList(2,2)));
        moves.add(new ArrayList<>(Arrays.asList(3,3)));
        moves.add(new ArrayList<>(Arrays.asList(4,4)));
        moves.add(new ArrayList<>(Arrays.asList(5,5)));

        super.setPossibleMoves(moves);
    }


}
