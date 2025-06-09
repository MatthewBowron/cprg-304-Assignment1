package shapes;

public class Pyramid extends Shape
{
    private double side;

    public Pyramid(double height, double side) {
        super(height);
        this.side = side;
    }
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    public double calcVolume() {
        return 0;
    }

    public double calcbaseArea() {
        return 0;
    }
}
