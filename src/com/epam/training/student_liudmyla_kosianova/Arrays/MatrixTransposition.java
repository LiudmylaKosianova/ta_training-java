package com.epam.training.student_liudmyla_kosianova.Arrays;

public class MatrixTransposition {
    public int[][] transpose(int[][] matrixx){
        int rows = matrixx.length;
        int columns = matrixx[0].length;
        int[][] transpose = new int [rows][columns];
        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[i].length; j++){
                transpose[j][i] = matrixx[i][j];
            }
        }
        return transpose;
    }
}
