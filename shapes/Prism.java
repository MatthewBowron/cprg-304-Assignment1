package shapes;

public abstract class Prism extends Shape {
    double side;

    public double calcVolume(){
        return calcbaseArea() * this.getHeight();
    }

    public Prism(double height, double side) {
        super(height);
        this.side = side;
    }
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }
}
