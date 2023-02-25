package com.epam.training.student_liudmyla_kosianova.dataType;
import java.util.Scanner;

/**
 * The program must print an electronic watch screen output for a given value of seconds
 * since midnight.
 *  Input value is given via System.in. Output value must be printed to System.out
 *  It is guaranteed, that input number is non-negative.
 *  Output format is h:mm:ss (possible values: [0:00:00; 23:59:59]).
 */

public class ElectronicWatch {
    protected int hours;
    protected int minutes;
    protected int seconds;
    public ElectronicWatch(){
        this.hours =0;
        this.minutes=0;
        this.seconds=0;
    }
    public void convertFromSeconds(int inputSeconds){
        this.hours = inputSeconds/3600;
        this.minutes = (inputSeconds%3600)/60;
        this.seconds = (inputSeconds%3600)%60;
    }
    public String getTime(){
        String mi = Integer.toString(this.minutes);
        if(this.minutes<10){
            mi = String.format("%01d",this.minutes);
        }
        String se = Integer.toString(this.seconds);
        if(this.seconds<10){
            se = String.format("%01d",this.seconds);
        }
        return this.hours+":"+mi+":"+se;
        //Output format is h:mm:ss (possible values: [0:00:00; 23:59:59])
    }
}
