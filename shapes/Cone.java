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
        return (1.0 / 3.0) * calcbaseArea() * getHeight();
    }

    public double calcbaseArea() {
        return Math.PI * radius * radius;
    }
}
