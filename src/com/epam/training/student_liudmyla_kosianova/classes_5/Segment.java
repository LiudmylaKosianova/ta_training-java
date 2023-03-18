package com.epam.training.student_liudmyla_kosianova.classes_5;

import static java.lang.Math.*;
import static java.lang.StrictMath.pow;

/**
 * Please, implement the following methods of class Segment:
 * Constructor with start and end points as parameters
 * Ensure that a created segment exists and is not degenerative which means that
 * the start and the end of the segment is not the same point.
 * If it is, use throw new IllegalArgumentException() to raise an error.
 * double length()
 * Return length of the segment.
 * Point middle()
 * Return a middle point of the segment.
 * Point intersection(Segment another)
 * Return a point of the intersection of the current segment and the given one.
 * Return null if there is no such point.
 * Return null if segments are collinear.
 * Please, note that intersection point must lay on both segments.
 */
public class Segment {

    public Point start = new Point(0, 0);
    public Point end = new Point(0, 0);

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY()==end.getY()) {
            throw new RuntimeException("not legal argument");
        }
        this.start = start;
        this.end = end;

    }

    public double length() {
        return sqrt(pow((this.end.getX() - this.start.getX()), 2) + pow((this.end.getY() - this.start.getY()), 2));

    }

    public Point middle() {
        double x = (this.start.getX() + this.end.getX()) / 2;
        double y = (this.start.getY() + this.end.getY()) / 2;
        return new Point(x, y);

    }

    Point intersection(Segment another) {
        //if the slopes are the same, they are parallel, or they are the same line
        double slopeAnother = (another.start.getY() - another.end.getY()) / (another.start.getX() - another.end.getX());
        double slopeThis = (this.start.getY() - this.end.getY()) / (this.start.getX() - this.end.getX());

        if (slopeThis == slopeAnother) {
            return null;
        }

        //calculate the intersection point
        double x1 = this.start.getX();
        double x2 = this.end.getX();
        double y1 = this.start.getY();
        double y2 = this.end.getY();

        double x3 = another.start.getX();
        double x4 = another.end.getX();
        double y3 = another.start.getY();
        double y4 = another.end.getY();


        double t = ( (x1 - x3)*(y3-y4) - (y1 - y3)*(x3 - x4) ) / ( (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4) );
        double u = ( (x1 - x3)*(y1-y2) - (y1 - y3)*(x1-x2) ) / ( (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4) );

        if ((t < 0 || t > 1) || (u < 0 || u > 1)) {
            return null;
        }

        double interX = x1 + t*(x2-x1);
        double interY = y1 + t*(y2-y1);


        return new Point(interX, interY);
    }


    public static void main(String[] args) {

        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println(length);

        Segment first = new Segment(new Point(0, 0), new Point(4, 4));
        Segment second = new Segment(new Point(2, 0), new Point(0, 2));
        Point intersection = first.intersection(second);

        System.out.println(intersection.getX());
        System.out.println(intersection.getY());

        Point redSofa = new Point (1.1, 1.1);
        Point greenSofa = new Point (1.1, 1.1);
        Segment endEqualsStart = new Segment(redSofa,greenSofa);
    }
}
