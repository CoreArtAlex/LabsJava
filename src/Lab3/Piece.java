package Lab3;

public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece (int value, boolean isWhite){
        this.value = value;
        this.isWhite = isWhite;
    }

    public boolean equals(){
        return (getValue() == getValue() && isWhite) == isWhite;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "Piece{" +
                "value=" + value +
                ", isWhite=" + isWhite +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean setWhite() {
        isWhite = true;
        return true;
    }
}
