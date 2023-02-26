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
    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void convertFromSeconds(int inputSeconds){
        this.hours = inputSeconds/3600;
        this.minutes = (inputSeconds%3600)/60;
        this.seconds = (inputSeconds%3600)%60;
    }
    public String getTime(){
        String mi = Integer.toString(this.minutes);
        if(this.minutes<10){
            mi = String.format("%02d",this.minutes);
        }
        String se = Integer.toString(this.seconds);
        if(this.seconds<10){
            se = String.format("%02d",this.seconds);
        }
        String ho = Integer.toString(this.hours);
        if(this.hours == 24){
            ho = "0";
        }
        return ho+":"+mi+":"+se;
        //Output format is h:mm:ss (possible values: [0:00:00; 23:59:59])
    }
}
