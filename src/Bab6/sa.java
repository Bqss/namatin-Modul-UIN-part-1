package Bab6;

import java.util.Scanner;

public class sa {


    public static void main(String [] args){
            try {
                int bil = 10;
                System.out.println(bil / 0);
            } catch (Exception e) {
                System.out.println("Pembagian tidak boleh nol");
            }

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dicari nilai faktorial nya !");
        int base = in.nextInt();
        sa n = new sa();
        n.getFaktorial(base);

    }

    public void getFaktorial(int i ) {
        int result = 1;
        if (i == 0 || i == 1) {
            result = 1;
        } else {
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
        }
        System.out.printf("%d ! = %d", i, result);
    }
}

