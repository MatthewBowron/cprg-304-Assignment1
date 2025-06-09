package shapes;

public class Cone extends Shape
{
    private double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double calcVolume() {
        return 0;
    }

    public double calcbaseArea() {
        return 0;
    }
}
