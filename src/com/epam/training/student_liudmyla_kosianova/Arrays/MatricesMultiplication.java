package com.epam.training.student_liudmyla_kosianova.Arrays;

public class MatricesMultiplication {
    public static int[][] multiplication(int[][]first, int[][]second){
        int firstRow = first.length;
        int firstColumn = first[0].length;
        int secondRow = second.length;
        int secondColumn = second[0].length;

        int[][]product = new int [firstRow][secondColumn];
        int theSum = 0;


        for(int i=0; i<firstRow; i++){
            for(int yoyo = 0; yoyo<secondColumn; yoyo++) {
                for (int j = 0; j<secondRow; j++) {
                    theSum += first[i][j] * second[j][yoyo];
                }
                product[i][yoyo]=theSum;

                theSum=0;
            }

        }
        return product;
    }

    public static void main(String[] args){
        int[][] first={{0,1},{3, 5},{7,8}};
        int[][] second = {{1,2,3}, {4,5,6}};



        int[][] product = multiplication(first, second);

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(String.format("%4s", product[i][j]));
            }
            System.out.println();}


    }
}
