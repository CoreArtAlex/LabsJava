package Lab3;

public class Rook extends Piece{
    public Rook(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Moves Horizontally or vertically without space restriction," +
                " Forward or Backwards");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
