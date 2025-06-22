package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Selection extends Sort {
    public void sort(Shape[] shapes, Comparator<? super Shape> comp){
        setCompare(comp);

        int n = shapes.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (compare(shapes[j], shapes[minIndex]) > 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Shape temp = shapes[i];
                shapes[i] = shapes[minIndex];
                shapes[minIndex] = temp;
            }
        }
    }
}