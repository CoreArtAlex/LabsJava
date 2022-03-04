package Lab3;

public class Queen extends Piece{
    public Queen(int value, boolean isWhite) {
        super(value, isWhite);
    }


    @Override
    public void move() {
        System.out.println("Moves in all directions without space restrictions");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
