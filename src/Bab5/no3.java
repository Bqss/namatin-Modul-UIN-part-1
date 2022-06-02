package Bab5;

import javax.swing.*;
import java.util.Arrays;

public class no3 {
    public static void main(String[] args) {
        int [][] matrix1 = {{2,9},
                            {1,5}};
        int [][] matrix2 = {{5,17},
                            {10,4}};
        getindex(matrix1,matrix2);
        System.out.println("Matrix 1 :\n"+Arrays.toString(matrix1[0])+"\n"+Arrays.toString(matrix1[1]));
        System.out.println("Matrix 2 :\n"+Arrays.toString(matrix2[0])+"\n"+Arrays.toString(matrix2[1]));
        int [][]rs = tambahmtrx(matrix1,matrix2);
        System.out.println("Matrix setelah dijumlahkan :\n"+Arrays.toString(rs[0])+"\n"+Arrays.toString(rs[1]));

    }
    private static void getindex(int [][]matrix1,int[][]matrix2) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang ingin anda cari :"));
        int opt1 = Integer.parseInt(JOptionPane.showInputDialog("Di matrix ke-berapa anda ingin mencari angka " + angka + " ?"));
        int a = 0, b = 0;

        switch (opt1) {
            case 1 -> {
                for (int k = 0; k < matrix1.length; k++) {
                    for (int l = 0; l < matrix1[0].length; l++) {
                        if (matrix1[k][l] == angka) {
                            b += 1;
                        }

                    }
                }
                String[] index = new String[b];
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[0].length; j++) {
                        if (matrix1[i][j] == angka) {
                            index[a] = String.format("%d,%d", i, j);
                            a++;
                        }
                    }
                }
                System.out.println("angka " + angka + " Pada matrix 1 berada pada index " + Arrays.toString(index));
            }
            case 2 -> {
                for (int k = 0; k < matrix2.length; k++) {
                    for (int l = 0; l < matrix2[0].length; l++) {
                        if (matrix2[k][l] == angka) {
                            b += 1;
                        }

                    }
                }
                    String[] index2 = new String[b];
                    for (int i = 0; i < matrix2.length; i++) {
                        for (int j = 0; j < matrix2[0].length; j++) {
                            if (matrix2[i][j] == angka) {
                                index2[a] = String.format("%d,%d", i, j);
                                a++;
                            }
                        }
                    }
                    System.out.println("angka " + angka + " Pada matrix 1 berada pada index " + Arrays.toString(index2));
                }
            default -> JOptionPane.showMessageDialog(null, "Input salah !!");

            }

        }
    private static int [][] tambahmtrx(int [][]matrix1,int[][]matrix2){
        int [][] hasil = new int[matrix1.length][matrix1[0].length];
        for (int i =0 ; i< matrix1.length;i++){
            for ( int j =0 ; j<matrix2.length;j++){
                hasil[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return hasil;
    }
}

