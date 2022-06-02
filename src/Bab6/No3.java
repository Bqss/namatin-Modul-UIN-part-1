package Bab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

    public static int getInput(){
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int in = 0 ;
        try {
            in = Integer.parseInt(n.readLine());
        }catch (IOException as){
            System.out.println(as);
        }
        return in;
    }

    public static double getLuaspersegi(int panjang , int lebar){

        return panjang*lebar;
    }
    public static double getLuasSegitiga(int alas , int tinggi){
        return (double) 1/2 * alas * tinggi;
    }
    public static double getLuasLingkaran(int diameter){
        return 3.14*Math.pow((double) 1/2*diameter,2);
    }

    public static void main(String[] args) {

        System.out.print("Menu mana yang akan anda pilih ?\n1.Program meghitung luas persegi panjang\n2.Program menghitung luas" +
                " segitiga\n3.Program menghitung luas ligkaran\n");
        int chose = getInput();

        switch (chose){
            case 1:
                System.out.print("Masukkan nilai panjang persegi panjang : ");
                int panjang = getInput();
                System.out.print("Masukkan nilai lebar persegi panjang : ");
                int lebar = getInput();
                System.out.println("Luas persegi panjang dengan panjang "+panjang +" Dan dengan lebar "+lebar+" Adalah : "+getLuaspersegi(panjang,lebar));

                break;

            case 2:
                System.out.print("Masukkan nilai panjang alas segitiga : ");
                int alas = getInput();
                System.out.print("Masukkan nilai tinggi segitiga : ");
                int tinggi = getInput();
                System.out.println("Luas segitiga dengan panjang alas "+alas+" Dan dengan tinggi "+tinggi+" Adalah : "+getLuasSegitiga(alas,tinggi));

                break;
            case 3:
                System.out.print("Masukkan nilai panjang diameter lingkaran : ");
                int diameter = getInput();
                System.out.println("Luas lingkaran dengan diameter "+diameter +" Adalah : "+getLuasLingkaran(diameter));

                break;
        }


    }
}
