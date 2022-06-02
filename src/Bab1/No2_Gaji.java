package Bab1;
import java.util.Scanner;
public class No2_Gaji {
    public static void main(String[]args){
        int gaji , pajak , gajibersih;
        Scanner a= new Scanner(System.in);
        System.out.print("masukkan besar gaji kotor anda : ");
        gaji= a.nextInt();
        System.out.print("masukkan pajak : ");
        pajak = a.nextInt();
        gajibersih = gaji-pajak;
        System.out.println("Gaji bersih anda = "+gajibersih);


    }
}
