package Bab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No2 {
    public static void main(String[]a){
        int in1=0;
        int in2=0;
        int in3=0;
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("masukkan angka pertama :");
        try {
            in1=Integer.parseInt(b.readLine());

        }catch (IOException m){
            m.printStackTrace();
        }
        System.out.print("masukkan angka kedua :");
        try {
            in2=Integer.parseInt(b.readLine());
        }catch (IOException m){
            m.printStackTrace();
        }
        System.out.print("Masukkan angka ketiga :");
        try {
            in3=Integer.parseInt(b.readLine());

        }catch (IOException m){
            m.printStackTrace();
        }
        int in[]= {in1,in2,in3};
        int max=0;
        int min=1000;

        for (int v=0 ; v < in.length ; v++){
            if (in[v] > max){
                max= in[v];
            }else if ( in[v] < min){
                min = in[v];
            }

        }
        System.out.printf("NIlai maksimum = %d \n Nilai minimum = %d ",max,min);


    }
}
