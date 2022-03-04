package Lab3;

public class Knight extends Piece{
    public Knight(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Moves Like an L left or right (3 spaces forward,2 spaces lateral), " +
                "Forward or Backwards");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
