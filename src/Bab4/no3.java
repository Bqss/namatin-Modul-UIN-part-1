package Bab4;

import javax.swing.*;
import java.util.Arrays;

public class no3 {

    public static void main(String[] args) {
        int [] array = getarray();

        getmaxmin(array);


        System.out.println("Rata - rata = "+getRata(array));

        int jumlahgnp = jumlahGenap(array);
        System.out.println("Jumlah dari element berindeks genap adalah : "+jumlahgnp);

        int jumlahgnjl = jumlahGanjil(array);
        System.out.println("Jumlah dari element berindeks ganjil adalah : "+jumlahgnjl);

        ganjilGnpcheck(jumlahgnjl,"Ganjil");
        ganjilGnpcheck(jumlahgnp,"Genap");

        urut(array);
        System.out.println("Array setelah diurutkan = "+Arrays.toString(array));


        }
    private static int[] getarray (){
        int im = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang array : "));
        int [] arrayangka1= new int[im];
        for (int i=0;i<im;i++){
            int element = Integer.parseInt(JOptionPane.showInputDialog("Masukkan element ke-"+(i+1)));
            arrayangka1[i]= element;
        }
        return arrayangka1;
    }
    private static void getmaxmin(int [] array){
        int max =0 ;
        for (int k : array){
            max = Math.max(k, max);
        }
        int indexmax = Arrays.binarySearch(array,max);
        System.out.println("Max = "+max +" Berada di indeks : "+indexmax);

        int min =100;
        for (int l : array){
            min = Math.min(min,l);
        }
        int indexmin = Arrays.binarySearch(array,min);
        System.out.println("Min = "+min +" Berada di indeks : "+indexmin);

        }
    private static double getRata(int []array){
        double jumlah = 0;
        for (double k : array){
            jumlah +=k;
        }
        return jumlah/array.length;
    }
    private static int jumlahGenap(int []array){
        int jumlah =0;
        for (int i=0 ; i<array.length; i+=2){
            jumlah += array[i];
        }
        return jumlah;
    }
    private static int jumlahGanjil(int []array){
        int jumlah =0;
        for (int i=1 ; i<array.length; i+=2){
            jumlah += array[i];
        }
        return jumlah;
    }
    private static void ganjilGnpcheck(int jmlh , String state){
        String getp;
        if (jmlh % 2 ==0){
            getp = " Genap";


        }else {
            getp = " Ganjil";
        }
        System.out.println("Jumlah dari element berindeks "+state+" bernilai"+getp);
    }
    private static void urut(int[]array){
        Arrays.sort(array);

    }

    }



