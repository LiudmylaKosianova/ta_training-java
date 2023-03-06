package com.epam.training.student_liudmyla_kosianova.Arrays;

public class MatricesMultiplication {
    public static int[][] multiplication(int[][]first, int[][]second){
        int[][]product = new int [first.length][second[0].length];
        int theSum = 0;
        int number = first.length;

        for(int i=0; i<first.length; i++){
            for(int yoyo = 0; yoyo<second[i].length;yoyo++) {
                for (int j = 0; j < second.length; j++) {
                    theSum += first[i][j] * second[j][yoyo];
                    System.out.println("first is:"+first[i][j]+" second is:"+second[j][i]);
                    System.out.println("theSum is:"+theSum);
                }
                product[i][yoyo]=theSum;
                System.out.println("i is:"+i+" yoyo is:"+yoyo);
                theSum=0;
            }

        }
        return product;
    }

    public static void main(String[] args){
        int[][] first={{1, 2, 3},
                {4, 5, 6}};
        int[][] second = {{7 , 8},
            {9 , 10},
            {11, 12}};

        int[][] product = multiplication(first, second);

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(String.format("%4s", product[i][j]));
            }
            System.out.println();}


    }
}
