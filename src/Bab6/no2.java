package Bab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2 {

    public static int sigma(int batas , int x){
        int y = 0 ;
        for (int i=1 ; i<=batas ; i ++){
            y+=(x+2*i);
        }
        return y;
    }
    public static int  getin(){
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        int n =0;
        try {
            n = Integer.parseInt(m.readLine());
        }catch (IOException e){
            System.out.println(e);
        }
     return n;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nilai n : ");
        int lim = getin();
        System.out.print("Masukkan nilai x : ");
        int x= getin();

        System.out.println("Hasil sigma i-n (x+2i) adalah "+ sigma(lim,x));
    }
}
