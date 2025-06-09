package utilities;

import shapes.Shape;

public abstract class Sort {
    private char compType;
    public void setCompType(char compareType){ this.compType = compareType; }
    public Sort(char compareType) {
        setCompType(compareType);
    }

    public abstract void sort(Shape[] shapes);

    protected int compare(Shape s1, Shape s2){
        if (compType == 'h')
            return s1.compareTo(s2);
        if (compType == 'b')
            return ShapeComaprator.compareByBase(s1, s2);
        if (compType == 'v')
            return ShapeComaprator.compareByVolume(s1, s2);
        throw new IllegalArgumentException("compType not valid (must be h, b, or v");
    }
    protected static void swap(Shape[] shapes, int a, int b){
        if(a != b) {
            Shape temp = shapes[a];
            shapes[a] = shapes[b];
            shapes[b] = temp;
        }
    }
}
