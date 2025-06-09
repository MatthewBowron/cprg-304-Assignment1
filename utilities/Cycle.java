package utilities;

import shapes.Shape;

import java.util.Comparator;


public class Cycle extends Sort{
    public void sort(Shape[] shapes, Comparator<? super Shape> comp){
        setCompare(comp);
        int n = shapes.length;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            Shape shape = shapes[cycleStart];

            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++)
                if (compare(shapes[i], shape) > 0)
                    pos++;

            if (pos == cycleStart)
                continue;

            while (compare(shape, shapes[pos]) == 0)
                pos++;

            Shape temp = shape;
            shape = shapes[pos];
            shapes[pos] = temp;


            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++)
                    if (compare(shapes[i], shape) > 0)
                        pos++;

                while (compare(shape, shapes[pos]) == 0)
                    pos++;

                temp = shape;
                shape = shapes[pos];
                shapes[pos] = temp;
            }
        }
    }
}
