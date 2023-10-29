public class Piece {
    private int x;
    private int y;
    private String color;
    private String name;

    public Piece(String color, String name) {
        this.color = color;
        this.name = name;
        this.x = -1;
        this.y = -1;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Piece Information: [Name: " + name + ", Color: " + color + ", X Coordinate: " + getX() + ", Y Coordinate: " + getY() + "]";
    }

}
