package Bab3;

import javax.swing.*;

public class no5 {
    public static void main(String[] args) {
        int lim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan x sbg panjang alas dan tinggi :"));
        triagle(lim);
        System.out.print("\n");
        filppedtriangle(lim);

    }
    private static void triagle(int lim){
        for (int i =0 ; i< lim ; i++){
            for (int j = 0 ; j<lim;j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }
            }
            System.out.print("\n");
        }

    }
    private static void filppedtriangle(int lim){
        for (int i =0 ; i< lim ; i++){
            for (int j = 0 ; j<lim;j++){
                System.out.print("* ");
                if (i+j==lim-1){
                    break;
                }
            }
            System.out.print("\n");
        }

    }
}
