package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Merge extends Sort {
    public void sort(Shape[] shapes, Comparator<? super Shape> comp){
        setCompare(comp);

    }
}