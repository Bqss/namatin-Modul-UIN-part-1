package Bab2;
import java.util.*;
public class no4 {
    public static void main(String[] a) {
        Scanner m = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.print("Masukkan jumlah nilai adi : ");
        n1 = m.nextInt();
        System.out.print("Masukkan jumlah nilai budi : ");
        n2 = m.nextInt();
        System.out.print("Masukkan jumlah nilai caca : ");
        n3 = m.nextInt();
        System.out.print("Masukkan jumlah nilai deny : ");
        n4 = m.nextInt();
        int[] nilai = {n1, n2, n3, n4};
//        36-45 Nilai D
//        46-55 Nilai C
//        56-65 Nilai C+
//                66-75 Nilai B
//        76-85 Nilai B+
//                86-100 Nilai A
        String grade ="";

        for (int v = 0; v < nilai.length; v++) {
            if (nilai[v] >= 0 && nilai[v] <= 45) {
                grade ="D";

            }else if (nilai[v] >= 46 && nilai[v] <= 55){
                grade = "C";
            }else if(nilai[v] >= 56 && nilai[v] <= 65){
                grade ="C+";

            }else if(nilai[v] >= 66 && nilai[v] <= 75){
                grade = "B";

            }else if(nilai[v] >= 76 && nilai[v] <= 85){
                grade="B+";
            }else if(nilai[v] >= 86 && nilai[v] <= 100){
                grade="A";
            }
            System.out.println(grade);




        }

        int l;
        int max,min;
        max=0;
        min=1000000;

        for (int i=0 ; i < nilai.length ; i++){
            if (nilai[i] > max){
                max= nilai[i];
            }else if ( nilai[i] < min){
                min = nilai[i];
            }



        }
        System.out.printf("Nilai maksimal = %d \nNilai minimal = %d",max,min);
    }
}