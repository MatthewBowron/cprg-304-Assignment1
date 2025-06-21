package utilities;

import shapes.Shape;

import java.util.Comparator;

public class Merge extends Sort {

    public void sort(Shape[] shapes, Comparator<? super Shape> comp) {
        setCompare(comp);
        if (shapes == null || shapes.length < 2) return;
        Shape[] tmp = new Shape[shapes.length];
        mSort(shapes, tmp, 0, shapes.length - 1);
    }

    private void mSort(Shape[] src, Shape[] tmp, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mSort(src, tmp, left, mid);
        mSort(src, tmp, mid + 1, right);
        merge(src, tmp, left, mid, right);
    }

    private void merge(Shape[] src, Shape[] tmp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (compare(src[i], src[j]) >= 0) {
                tmp[k++] = src[i++];
            } else {
                tmp[k++] = src[j++];
            }
        }
        while (i <= mid)  tmp[k++] = src[i++];
        while (j <= right) tmp[k++] = src[j++];

        for (int idx = left; idx <= right; idx++) {
            src[idx] = tmp[idx];
        }
    }
}
