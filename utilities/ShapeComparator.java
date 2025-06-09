package utilities;
import shapes.Shape;

import java.util.Comparator;

public class ShapeComparator{

    public static int compareByBase (Shape o1, Shape o2) {
        double left = o1.calcbaseArea();
        double right = o2.calcbaseArea();

        if ( left > right ) return 1;
        else if ( left < right ) return -1;
        else return 0;
    }

    public static int compareByVolume (Shape o1, Shape o2) {
        double left = o1.calcVolume();
        double right = o2.calcVolume();

        if ( left > right ) return 1;
        else if ( left < right ) return -1;
        else return 0;
    }
}
