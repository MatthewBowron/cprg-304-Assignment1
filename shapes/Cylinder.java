package shapes;

public class Cylinder extends Shape
{
    private double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double calcVolume() {
        return this.getHeight() * calcbaseArea();
    }

    public double calcbaseArea() {
        return Math.PI * radius * radius;
    }
}
