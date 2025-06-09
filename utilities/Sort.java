package utilities;

import shapes.Shape;

import java.util.Comparator;

public abstract class Sort {
    private Comparator<? super Shape> comp;
    protected void setCompare(Comparator<? super Shape> comp){ this.comp = comp; }


    public abstract void sort(Shape[] shapes, Comparator<? super Shape> comp);
    public void sort(Shape[] shapes){
        sort(shapes, null);
    }

    protected int compare(Shape s1, Shape s2){
        if(comp == null)
            return s1.compareTo(s2);
        return comp.compare(s1, s2);
    }
    protected static void swap(Shape[] shapes, int a, int b){
        if(a != b) {
            Shape temp = shapes[a];
            shapes[a] = shapes[b];
            shapes[b] = temp;
        }
    }
}
