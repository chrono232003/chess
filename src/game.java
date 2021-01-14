import board.Board;

import java.util.Scanner;

public class game {

    public static void main(String[] args) {
      Board board = new Board();

     //game loop
        int game = 0;
        while (game==0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What piece would you like to move?");
            String pieceToMoveName = scanner.nextLine();
            System.out.println("Where would you like to move ('ac', 'bf' etc)?");
            String newLoc = scanner.nextLine();
            board.movePiece(pieceToMoveName, newLoc);
        }

    }

}

