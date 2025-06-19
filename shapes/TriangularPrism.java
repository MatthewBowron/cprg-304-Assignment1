package shapes;

public class TriangularPrism extends Prism
{
    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    public double calcbaseArea() {
        double s = getSide();
        return (s * s * Math.sqrt(3)) / 4;
    }
}
