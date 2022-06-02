package Bab4;

import javax.swing.*;
import java.util.Arrays;


public class No2 {
    public static void main(String[] args) {

        int opsibil=Integer.parseInt(JOptionPane.showInputDialog("Masukkaan opsi untuk array \n1. bilangan bulat\n2. bilangan prima\n"));
        int liminitial= Integer.parseInt(JOptionPane.showInputDialog("Bilangan tersebut dimulai dari ?.."));
        int limend= Integer.parseInt(JOptionPane.showInputDialog("Bilangan tersebut diakhiri ?.."));
        int [] angka1;
        int [] prima;
        int b =3;
        String c=Integer.toBinaryString(b);
        System.out.println(c);
        switch(opsibil){
            case 1:
               angka1 = arraybulat(liminitial,limend);
               JOptionPane.showMessageDialog(null,"Bilangan anda adalah "+ Arrays.toString(angka1));
            case 2:
                prima= prima(liminitial,limend);
                JOptionPane.showMessageDialog(null,"Bilangan anda adalah "+ Arrays.toString(prima));
        }

        int opsi2= Integer.parseInt( JOptionPane.showInputDialog("menu apa yg ingin anda jalankan?\n1.mencari nilai max\n2.mencari nilai minimum/3.mencari rata rata \n4.mengganti nilai pada index tertentu\n" +
                "5.keluar dari program"));
        switch (opsi2){
            case 1:
        }

    }
    private static int [] arraybulat(int init ,int end){
        int [] angka1= new int[end-init+1];//2 , 5
        int j=0;
        for (int i = init ; i <=end;i++){
            angka1[j]=i;
            j++;
                if (end-j==1){
                    break;
            }
        }
        return angka1;
    }
    private static int[] prima(int init , int end){
        int k=0;
        int [] faktor ={2,3,4,5,6,7,8,9,10};
        int [] prima =new int[10];

        for (int i=init;i<=end;i++){
            System.out.println(i+"\n========================");
            int r=0;
            for (int j : faktor){
                if ( (i % j != 0) || (i==j) ){
                    r++;
                }
            }
            if (r == faktor.length){
                System.out.println(faktor.length);
                prima[k]=i;
                System.out.println(Arrays.toString(prima));
                k++;
            }
        }
        return prima;
        }


    }


