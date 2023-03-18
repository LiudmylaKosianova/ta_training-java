package com.epam.training.student_liudmyla_kosianova.module_3_conditionsAndLoops;

import java.util.Scanner;

/**
 * Consider a snail travels up a tree a feet each day.
 * Then snail slides down b feet each night. Height of the tree is h feet.
 * Write a program that prints number of days for the snail to reach the top
 * of the tree.
 *
 * Program reads a, b, h line by line. Input values are guaranteed to be positive integers.
 *
 * If the snail cannot reach the top of the tree, print the message Impossible.
 */

public class Snail {

    protected String message;

    public Snail(){
    }

    public int daysToTop(int up, int down, int height){
        if(up==down){
            return 1;
        }
        return ((height-up)/(up-down))+1;
    }
    public void setMessage(int up, int down, int height){
        if(up<height && (up==down || up<down)){
            this.message = "Impossible";
        }else{
            this.message = Integer.toString(this.daysToTop(up, down, height));
        }
    }
    public String getMessage(){
        return this.message;
    }
    public static void main(String[] args){

        Snail dino = new Snail();
        Scanner scan = new Scanner(System.in);

        int up = scan.nextInt();
        int down = scan.nextInt();
        int height = scan.nextInt();

        dino.setMessage(up, down, height);
        System.out.println(dino.getMessage());

    }


}
