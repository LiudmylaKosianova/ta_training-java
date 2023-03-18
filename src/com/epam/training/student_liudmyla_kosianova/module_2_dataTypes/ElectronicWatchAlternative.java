package com.epam.training.student_liudmyla_kosianova.module_2_dataTypes;
import java.util.Scanner;

public class ElectronicWatchAlternative {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        String hr = Integer.toString(seconds/3600);
        if(seconds/3600 == 24){
            hr = "0";
        }

        String min = Integer.toString( (seconds%3600)/60 );
        if( ((seconds%3600)/60) < 10 ){
            min = String.format("%02d", (seconds%3600)/60 );
        }
        String sec = Integer.toString ( (seconds%3600)%60 );
        if( ((seconds%3600)%60) < 10 ){
            sec = String.format("%02d",(seconds%3600)%60 );
        }

        System.out.println( hr+":"+min+":"+sec );

    }

}
