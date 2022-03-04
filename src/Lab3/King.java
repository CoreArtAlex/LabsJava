package Lab3;

public class King extends Piece{

    public King(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Moves One square at a Time on any direction");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
