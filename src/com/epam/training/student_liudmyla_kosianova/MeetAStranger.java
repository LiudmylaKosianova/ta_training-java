package com.epam.training.student_liudmyla_kosianova;

import java.util.Scanner;

public class MeetAStranger {

    public static void main(String[] args) {
        //Write a program, which reads a String from System.in and prints "Hello, <input string>"
        Scanner rabbit = new Scanner(System.in);
        String rabbitTalks = rabbit.nextLine();
        System.out.println("Hello, " + rabbitTalks);
    }
}

