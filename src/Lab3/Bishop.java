package Lab3;

public class Bishop extends Piece{

    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Moves Diagonally with no space restriction Forward or Backward");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
