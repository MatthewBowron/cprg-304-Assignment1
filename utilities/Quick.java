package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Quick extends Sort {
    public void sort(Shape[] shapes, Comparator<? super Shape> comp){
        setCompare(comp);
        QuickSort(shapes, 0, shapes.length-1);
    }

    private void QuickSort(Shape[] shapes, int low, int high){
        if (low < high){
            shiftPivot(shapes, low, high);
            int i = low;

            for (int j = low; j < high; j++){
                if(compare(shapes[j], shapes[high]) > 0) {
                    swap(shapes, i, j);
                    i++;
                }
            }
            swap(shapes, i, high);

            QuickSort(shapes, low, i-1);
            QuickSort(shapes, i+1, high);
        }
    }
    private void shiftPivot(Shape[] shapes, int low, int high) {
        Shape l = shapes[low];
        int middle = (high+low)/2;
        Shape m = shapes[middle];
        Shape h = shapes[high];
        if ((compare(l, m) > 0 && compare(l, h) < 0) || (compare(l, m) < 0 && compare(l, h) > 0)) swap(shapes, low, high);
        if ((compare(m, l) > 0 && compare(m, h) < 0) || (compare(m, l) < 0 && compare(m, h) > 0)) swap(shapes, middle, high);
    }
}
