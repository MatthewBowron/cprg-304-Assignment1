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

    public double calcbaseArea() {
        return Math.pow(side, 2);
    }

    public double calcVolume() {
        return (1.0 / 3.0) * calcbaseArea() * getHeight();
    }
}
