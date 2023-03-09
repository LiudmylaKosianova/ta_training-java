package classes;

import java.awt.*;

public class Line {
    int k,b;
//y = k * x + b. Line constructor takes k and b
    public Line (int k, int b){
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line line2){
        if (this.k == line2.k){
            return null;
        }
        Point intercept = new Point();
        int denominator = (this.k*-1) - (line2.k*-1);
        intercept.x = ((-1* line2.b) - (-1*this.b))/denominator;
        intercept.y = ((this.b* line2.k) - (line2.b*this.k))/denominator;
        return intercept;
    }

    public static void main(String[] args) {
        Line line1 = new Line(1,1);
        Line line2 = new Line(-1,3);

        System.out.println(line1.intersection(line2)); // (1;2)
    }
}
