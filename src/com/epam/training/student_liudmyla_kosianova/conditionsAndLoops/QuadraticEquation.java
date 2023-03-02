package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;
import java.util.Scanner;


import static java.lang.Math.*;

/**
 * QuadraticEquation class and implement a program to solve quadratic equations.
 * For the given quadratic equation coefficients (ax² + bx + c = 0),
 * return one or two roots of the equation if there is any in the set of real numbers.
 * Input value is given via System.in. Output value must be printed to System.out.
 * Output format is:
 * "x₁ x₂" (two roots in any order separated by space) if there are two roots
 * "x" (just the value of the root) if there is the only root
 * "no roots" (just a string value "no roots") if there is no root
 * The "a" parameter is guaranteed to be not zero.
 */

public class QuadraticEquation {
    protected double a;
    protected double b;
    protected double c;
    //constructor
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Discriminant (){
        return (pow(b,2))-(4*a*c);
    }


    public double rootPlus(){
        return (-b + sqrt(this.Discriminant()))/(2*a);
    }
    public double rootMinus(){
        return (-b - sqrt(this.Discriminant()))/(2*a);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        QuadraticEquation rabbit = new QuadraticEquation(a,b,c);

        if(rabbit.Discriminant()<0){
            System.out.println("no roots");
        }else if(rabbit.Discriminant()==0){

            if(rabbit.rootPlus()%1 ==0){
                int answer = (int)rabbit.rootPlus();
                System.out.println(answer);
            }else{
                System.out.println(rabbit.rootPlus());
            }

        }else{

            if(rabbit.rootMinus()%1 == 0 && rabbit.rootPlus()!= 0){
                System.out.println((int)rabbit.rootMinus()+" "+rabbit.rootPlus());
            }else if(rabbit.rootMinus()%1 != 0 && rabbit.rootPlus()== 0){
                System.out.println(rabbit.rootMinus()+" "+(int)rabbit.rootPlus());
            }else if(rabbit.rootMinus()%1 == 0 && rabbit.rootPlus()== 0){
                System.out.println((int)rabbit.rootMinus()+" "+(int)rabbit.rootPlus());
            }else{
                System.out.println(rabbit.rootMinus()+" "+rabbit.rootPlus());
            }
        }
    }
}
