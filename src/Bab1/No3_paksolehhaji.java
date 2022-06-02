package Bab1;

public class No3_paksolehhaji {
    public static void main(String[]args){
        double total,sudahdibayar,waktu;
        total=50000000;
        sudahdibayar=10000000;
        waktu = 2*12;

        int cicilan=(int)(total-sudahdibayar)/(int)waktu;
        System.out.println("Jadi total cicilan minimal yang harus dibayar adalah = "+cicilan + " rupiah /bulan");

    }
}
