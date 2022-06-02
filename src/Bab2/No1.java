package Bab2;
import java.io.*;
public class No1 {
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
        System.out.printf("Nilai-nilai yang dimasukkan adalah = %d , %d , %d ",in1,in2,in3);
    }
}
