package shapes;

public class PentagonalPrism extends Prism
{
    public PentagonalPrism(double height, double side) {
        super(height, side);
    }

    public double calcbaseArea() {
        double s = getSide();
        return (5 * Math.pow(s, 2) * Math.tan(Math.toRadians(54))) / 4;
    }
}
