package com.epam.training.student_liudmyla_kosianova.Arrays;

public class MatricesMultiplication {
    public int[][] multiplication(int[][]first, int[][]second){
        int[][]product = new int [first.length][second[0].length];
        int theSum = 0;
        int number = first.length;

        for(int i=0; i<number; i++){
            for(int yoyo = 0; yoyo<second.length;yoyo++) {
                for (int j = 0; j < number; j++) {
                    theSum = first[i][j] * second[j][i];
                }
                product[i][yoyo]=theSum;
            }

        }
        return product;
    }

    public void main(String[] args){
        int[][] first={{1, 2, 3},
                {4, 5, 6}};
        int[][] second = {{7 , 8},
            {9 , 10},
            {11, 12}};

        int[][] product = multiplication(first, second);


    }
}
