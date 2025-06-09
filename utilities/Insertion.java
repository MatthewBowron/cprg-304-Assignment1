package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Insertion extends Sort {
    public void sort(Shape[] shapes, Comparator<? super Shape> comp){
        setCompare(comp);
        int n = shapes.length;

        for (int i = 1; i < n; i++) {
            Shape key = shapes[i];
            int j = i - 1;
            while (j >= 0 && compare(shapes[j], key) < 0) {
                shapes[j + 1] = shapes[j];
                j--;
            }
            shapes[j + 1] = key;
        }
    }
}
