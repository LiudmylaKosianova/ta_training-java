package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scan = new Scanner(System.in);
        int friends = scan.nextInt();
        int pieces = scan.nextInt();
        int count = 1;

        while((pieces*count)%friends!=0){
            count++;
        }
        System.out.println(count);
    }

}
