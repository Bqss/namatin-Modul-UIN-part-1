package Bab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1 {
    public static int getInp(){
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        String in ="";
        try {
            in = m.readLine();
        }catch (IOException e){
            System.out.println(e);
        }

        return Integer.parseInt(in);
    }

    public static double getTabungvol(int i , int k){
        int r = i/2;
        return Math.PI * Math.pow(r,2) *k ;
    }
    public static double getKerucutvol(int diam , int tinggi){
        int r = diam/2;
        return (double) 1/3*Math.PI*Math.pow(r,2)*tinggi;
    }
    public static double getVolbola(int diamet ){
        int r = diamet/2;
        return (double) 4/3*Math.PI*Math.pow(r,3);
    }

    public static void main(String[] args){
        System.out.print("Masukan diameter : ");
        int diameter = getInp();
        System.out.print("Masukkan tiggi : ");
        int tinggi = getInp();
        System.out.println("Volume Tabung = "+getTabungvol(diameter,tinggi));
        System.out.println("Volume Kerucut = "+getKerucutvol(diameter,tinggi));
        System.out.println("Volume Bola = "+getVolbola(diameter));
    }
}
