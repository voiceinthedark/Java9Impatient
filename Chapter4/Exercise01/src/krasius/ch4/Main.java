/**
 * Define a class Point with a constructor public Point(double x, double y) and
 * accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 * public LabeledPoint(String label, double x, double y) and an accessor method
 * getLabel
 */
package krasius.ch4;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        LabeledPoint labeledPoint = new LabeledPoint("A", 1,2);
        System.out.println(labeledPoint.getLabel() + " at: X=" + labeledPoint.getX() +
                " Y=" + labeledPoint.getY());

        /**
         * For exercise 2
         */
        LabeledPoint point2 = new LabeledPoint("B", 2, 4);
        /*Different reference points but same values, should pass point equality
         */
        LabeledPoint point3 = new LabeledPoint("A", 1, 2);

        //should pass
        System.out.println(Objects.equals(labeledPoint, point3));
        //should pass
        System.out.println(labeledPoint.equals(point3));

    }
}
