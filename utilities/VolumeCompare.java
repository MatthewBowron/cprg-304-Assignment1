package utilities;

import shapes.Shape;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.calcVolume(), o2.calcVolume());
    }
}
