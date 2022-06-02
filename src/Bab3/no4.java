package Bab3;

import javax.swing.*;


public class no4 {

    private static String[]  penentuganjilgenap(int [] input){
        String [] hasilpenentu = new String[input.length];
        for (int i= 0 ; i<input.length;i++){
            if (input[i] % 2 == 0){
                hasilpenentu[i]="Genap";
            }else {
                hasilpenentu[i]="Ganjil";
            }

          }for (int j=0 ;j<input.length;j++){
            System.out.printf("%d merupakan bilangan %s\n",input[j],hasilpenentu[j]);
        }
        return hasilpenentu;


    }

    private static void Jumlahbil(int[]array,String[]array2){
        int [] ganjil = new int[array.length];
        int [] genap = new int[array.length];
        int k=0; int l=0;
        for (int i =0 ; i< array2.length;i++ ){
            if (array2[i].equals("Genap")){
                genap[k]=array[i];
                k++;
            }else {
                ganjil[l]=array[i];
                l++;
            }

        }
        int hsilgnp=0;
        for (int j : genap) {
            hsilgnp += j;
        }
        System.out.println("Hasil dari penjumlahan bilangan yg genap adalah "+hsilgnp);
        int hasilgnjl=0;
        for (int m : ganjil){
            hasilgnjl+=m;
        }
        System.out.println("Hasil dari penjumlahan bilangan yg ganjil adalah "+hasilgnjl);

    }

    public static void main(String[] args) {

        int lim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan berapa jumlah angka yang mau anda masukkan :"));
        int[]in=new int[lim];

        for (int i =0 ; i<lim;i++){
            in[i] = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka ke-"+(i+1)));
        }

        String [] genapganjil =penentuganjilgenap(in);
        Jumlahbil(in,genapganjil);


    }
}
