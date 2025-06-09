package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Bubble extends Sort {
    public void sort(Shape[] shapes, Comparator<? super Shape> comp) {
        setCompare(comp);
        int n = shapes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(shapes[j], shapes[j + 1]) < 0) {
                    swap(shapes, j, j + 1);
                }
            }
        }
    }
}
