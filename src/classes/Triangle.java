package classes;
import static java.lang.Math.*;

/**
 * Please, implement methods of class Triangle: *
 * Constructor, which has three points as parameters.
 * Consider these points as vertices of the triangle.
 * Ensure that the created triangle exists, and it is not degenerative.
 * If it is, use throw new IllegalArgumentException() to raise an error.
 * double area()
 * Return the area of the triangle.
 * Point centroid()
 * Return the centroid of the triangle.
 */
public class Triangle {
    Point a,b,c;
    //constructor
    public Triangle(Point a, Point b, Point c){
        if(!triangle(a,b,c)){
            throw new IllegalArgumentException("I can't construct this triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean triangle (Point a, Point b, Point c){
        double length_ab = new Segment(a,b).length();
        double length_bc = new Segment(b,c).length();
        double length_ca = new Segment(c,a).length();
        return length_ab + length_bc > length_ca;
    }

    double area(Triangle triangle){
        double aSide = new Segment(a,b).length();
        double bSide = new Segment(b,c).length();
        double cSide = new Segment(c,a).length();

        double semiP = (aSide+bSide+cSide)/2;
        return sqrt(semiP* (semiP-aSide)*(semiP-bSide)*(semiP-cSide));

    }

    Point centroid(Triangle triangle){
        double centroidX = ( triangle.a.getX() + triangle.b.getX() + triangle.c.getX() ) / 3;
        double centroidY = ( triangle.a.getY() + triangle.b.getY() + triangle.c.getY() ) / 3;

        return new Point(centroidX,centroidY);
    }

    public static void main (String[] args){
        new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));
    }


}
