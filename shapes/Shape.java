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
    public String toString() {
        return String.format("%s: height=%.3f, base=%.3f, volume=%.3f",
            this.getClass().getSimpleName(),
            getHeight(),
            calcbaseArea(),
            calcVolume());
    }    
    
}
