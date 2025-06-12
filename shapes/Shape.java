package shapes;

public abstract class Shape implements Comparable<Shape>{
    private double height;

    public abstract double calcVolume();
    public abstract double calcbaseArea();

    public Shape(double height) { this.height = height; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int compareTo(Shape s){
        return Double.compare(this.getHeight(), s.getHeight());
    }
}
