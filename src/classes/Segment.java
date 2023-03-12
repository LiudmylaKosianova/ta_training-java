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
public class Segment {
    Point start, end;

    public Segment(Point start, Point end) {
        if(start==end){
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    public double length(){
        return sqrt( pow((this.end.x - this.start.x),2) + pow((this.end.y - this.start.y),2));
    }
    public Point middle(){
        return new Point((this.start.x + this.end.x)/2, (this.start.y + this.end.y)/2);

    }

    public Point intersection(Segment another){
        int slopeAnother = (another.start.y - another.end.y) / (another.start.x - another.end.x);
        int slopeThis = (this.start.y - this.end.y)/(this.start.x - this.end.x);
        if(slopeThis==slopeAnother){
            return null;
        }

        int t = ( (this.start.x - another.start.x)*(another.start.y -another.end.y) - (this.start.y -another.start.y)*(another.start.x - another.end.x) )/ ((this.start.x - this.end.x)*(another.start.y - another.end.y) - (this.start.y - this.end.y)*(another.start.x - another.end.x));
        int u = ( (this.start.x - another.start.x)*(this.start.y - this.end.y) - (this.start.y - another.start.y)*(this.start.x - this.end.x) ) / ( (this.start.x - this.end.x)*(another.start.y - another.end.y) - (this.start.y - this.end.y)*(another.start.x - another.end.x) );

        //There will be an intersection if 0 ≤ t ≤ 1 and 0 ≤ u ≤ 1.

        int intersectionPointX, intersectionPointY;

        if (  ( (t>=0)&&(t<=1) ) && ( (u>=0)&&(u<=1) ) ){
             // calculate a Point
            intersectionPointX= this.start.x +t*(this.end.x - this.start.x);
            intersectionPointY = this.start.y + t*(this.end.y - this.start.y);
        } else{return null;}

        return new Point(intersectionPointX, intersectionPointY);
    }
}
