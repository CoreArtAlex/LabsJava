package Lab3;

public class Pawn extends Piece{

    boolean promoted;
    Piece newPiece;
    Object o;
    // String question;

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        promote(newPiece);
    }

    public void promote(Piece newPiece){
        this.promoted = true;
        this.newPiece = newPiece;
        // System.out.println("What piece would you like?:" + question);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return pawn.setWhite() == pawn.setWhite() && promoted == pawn.promoted
                && (!promoted || newPiece.getValue() == pawn.newPiece.getValue());
    }

    @Override
    public void move() {
        System.out.println("Moves Forward 1 space");
        System.out.println("Moves Forward 2 spaces on the First move of the game" +
                " if the space is clear in front of it");
        System.out.println("Attacks moving Diagonally Forward 1 space at a time");
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "promoted=" + promoted +
                ", newPiece=" + newPiece +
                '}';
    }

}
