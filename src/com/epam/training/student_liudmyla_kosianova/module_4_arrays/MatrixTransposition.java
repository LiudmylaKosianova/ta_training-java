package com.epam.training.student_liudmyla_kosianova.module_4_arrays;

import java.util.Arrays;

public class MatrixTransposition {
    public static int[][] transpose(int[][] matrixx){
        int rows = matrixx.length;
        int columns = matrixx[0].length;
        int[][] transpose = new int [columns][rows];
        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[i].length; j++){
                transpose[j][i] = matrixx[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args){
        int[][] inputMa = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        int[][] check =    {
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8}
        };
        int [][] outputMa = MatrixTransposition.transpose(inputMa);

        System.out.println("This is inputMa:");
        for (int i = 0; i < inputMa.length; i++) {
            for (int j = 0; j < inputMa[i].length; j++) {
                System.out.print(String.format("%4s", inputMa[i][j]));
            }
            System.out.println();}

        System.out.println("This is outputMa:");
        for (int i = 0; i < outputMa.length; i++) {
            for (int j = 0; j < outputMa[i].length; j++) {
                System.out.print(String.format("%4s", outputMa[i][j]));
            }
            System.out.println();}
        System.out.println("This is check:");
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                System.out.print(String.format("%4s", check[i][j]));
            }
            System.out.println();}
        System.out.println("Does outputMa equals check? ");
        System.out.println(Arrays.deepEquals(outputMa,check));

    }

}
