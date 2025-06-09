package utilities;

import shapes.Shape;

import java.util.Comparator;

public class BaseAreaCompare implements Comparator<Shape>{
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.calcbaseArea(), o2.calcbaseArea());
    }
}
