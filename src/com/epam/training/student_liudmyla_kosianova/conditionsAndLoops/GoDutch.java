package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;

/**
 * Consider a company of friends visiting a restaurant.
 * They decided to equally split the bill.
 *
 * Friends decided to add 10 percent of the bill total amount as tips.
 * Then they cover the total payment in equal parts.
 *
 * Write a program that reads a bill total amount and a number of friends,
 * and then prints part to pay.
 *
 * Consider some details:
 *
 * Program must read data from System.in.
 * Bill total amount cannot be negative.
 * If input value is negative, the program stops, printing: Bill total amount cannot be negative.
 * Number of friends cannot be negative or zero. I
 * f input value is, then the program stops, printing: Number of friends cannot be negative or zero.
 * Bill total amount, number of friends and part to pay are integers.
 */
public class GoDutch {
    protected int friends;
    protected int bill;

    public GoDutch(int friends, int bill){
        this.bill = bill;
        this.friends = friends;
    }

    public int getBillWithTips(){
        return ( (bill*10)/100 ) + bill;
    }

    public int getEachFriendPay(){
        return this.getBillWithTips()/friends;
    }


}
