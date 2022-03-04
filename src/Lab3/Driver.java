package Lab3;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<String> pieces = new ArrayList<>();

        pieces.add("Bishop");
        pieces.add("King");
        pieces.add("Knight");
        pieces.add("Pawn");
        pieces.add("Queen");
        pieces.add("Rook");

        System.out.println(pieces);

        for (int i = 0; i < 6; i++){
            // I'm not quite sure how to iterate this expression
        }

        Piece p1 = new Pawn(1, true, true,new Queen(9,true));
        Piece p2 = new Pawn(1, true, false, null);
        Piece p3 = new Pawn(1, false, false, null);
        Piece p4 = new Pawn(1, false, true, new Queen(9,false));
        Piece p5 = new Pawn(1, true, true, new Knight(2,true));

        p1.equals(p2);
        p1.equals(p4);
        p1.equals(p5);
        p2.equals(p3);
        p4.equals(p5);
    }
}
