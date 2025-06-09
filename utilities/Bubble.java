package utilities;

import shapes.Shape;

public class Bubble extends Sort {

    public Bubble(char compareType) {
        super(compareType);
    }

    public void sort(Shape[] shapes) {
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
