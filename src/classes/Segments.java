package classes;
import java.awt.*;
import static java.lang.Math.*;

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
public class Segments {
    Point start, end;

    public Segments(Point start, Point end) {

        this.start = start;
        this.end = end;
    }

    public double length(){
        double length = sqrt( pow((this.end.x - this.start.x),2) + pow((this.end.y - this.start.y),2));
        return length;
    }
    public Point middle(){
        Point middle = new Point((this.start.x + this.end.x)/2, (this.start.y + this.end.y)/2);
        return middle;
    }
}
