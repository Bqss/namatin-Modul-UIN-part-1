package Bab5;

import javax.swing.*;
import java.util.Arrays;

public class no1 {
    public static void main(String[] args) {
        int[][] data2 = {{4, 6, 4, 2, 8, 4, 2, 10},
                {4, 6, 4, 2, 8, 4, 2, 10}};
        cetakarray(data2);
        System.out.println("Rata rata =" + getRata(data2));
        getIndex(data2);
        jmlh(data2);
    }

    private static void cetakarray(int[][] data2) {
        System.out.println("******** Use for loop ********* ");
        for (int a = 0; a < data2.length; a++) {
            for (int b = 0; b < data2[0].length; b++) {
                System.out.print(data2[a][b] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("******** Use while ********* ");
        int i = 0;
        while (i < data2.length) {
            int j = 0;
            while (j < data2[0].length) {
                System.out.print(data2[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("******** Use do while ********* ");
        int k = 0;
        do {
            int l = 0;

            do {
                System.out.print(data2[k][l] + " ");
                l++;
            } while (l < data2[0].length);
            k++;
            System.out.println();
        } while (k < data2.length);
    }

    private static int getRata(int[][] array) {
        int rata, tot = 0, jmlh = 0;
        for (int a = 0; a < array.length; a++) {
            jmlh += array[a].length;
            for (int b = 0; b < array[0].length; b++) {
                tot += array[a][b];
            }
        }
        rata = tot / jmlh;
        return rata;
    }

    private static void getIndex(int[][] array) {
        int elem = Integer.parseInt(JOptionPane.showInputDialog("Masukkan sebuah element array yang ingin anda cari "));
        int n = 0;
        for (int g = 0; g < array.length; g++) {
            for (int h = 0; h < array[0].length; h++) {
                if (array[g][h] == elem) {
                    n += 1;
                }
            }
        }
            int[] listindex = new int[n];
            int[] listindexy = new int[n];
            String[]combine = new String[n];

            int m = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] == elem) {
                        listindex[m] = i;
                        listindexy[m]=j;
                        combine [m]=String.format("%d,%d",i,j);
                        m++;
                    }
                }

            }
            System.out.println("Angka " + elem + " Berada pada indeks " + Arrays.toString(combine));
            changeelement(array,listindex,listindexy,elem);

        }
    private static void changeelement(int [][]array,int[]indxx,int[]indexy,int elem){

        int angka = Integer.parseInt(JOptionPane.showInputDialog("Dengan angka berapa anda ingin mengganti angka "+elem));

        for ( int k : indxx){
            for (int l : indexy){
                array[k][l]=angka;
            }
        }
        System.out.println("Array setelah di revisi :\n"+Arrays.deepToString(array));


    }
    private static void jmlh(int [][]data){
        int jumlahgnjl=0 , jumlahgnp =0 ;
        for (int i =0 ; i < data.length ; i++){
            for (int k =1 ; k< data[0].length ;k+=2 ){
                jumlahgnjl+= data[i][k];
            }
            for (int j =0; j < data[0].length;j+=2){
                jumlahgnp += data [i][j];

            }

        }
        System.out.println("Jumlah dari element ber-index ganjil adalah "+jumlahgnjl);
        System.out.println("Jumlah dari element ber-index genap adalah "+jumlahgnp);
    }
    }

