package Bab3;

public class no2 {
    public static void main(String[]a){
        //a
        System.out.println("A\n===============================");
        int angka,pangkat1,angka1,pangkat2;
        angka=4;pangkat1=3;angka1=5;pangkat2=2;
        int resulta=pangkat(angka,pangkat1)+pangkat(angka1,pangkat2);
        System.out.printf("Hasil %d^%d + %d^%d adalah = %d\n",angka,pangkat1,angka1,pangkat2,resulta);

        //b
        System.out.println("B\n==============================");
        int faktorial1=5;int faktorial2=4;
        int result2= faktorial(faktorial1)+faktorial(faktorial2);
        System.out.printf("Hasil %d! + %d! = %d",faktorial1,faktorial2,result2);

        //c
        System.out.println("C\n==============================");
        int number=4;int pangkat4=2;int pangkat5=1;
        int number2=5;
        int result3=(pangkat(number,pangkat4)+pangkat(number2,pangkat5))/number2+pangkat(number,pangkat4);
        System.out.printf("Hasil dari ( %1$d^%3$d + %2$d^%4$d ) / %2$d + %1$d^%3$d = %5$d",number,number2,pangkat4,pangkat5,result3);

    }
    private static int pangkat(int base ,int pangkat){
        int hasil= base;

        for (int i=1;i<pangkat;i++){
            hasil *= base;
        }
        return hasil;
    }
    private static int faktorial (int base ){
        int basis= base;
        for (int i=base-1;i>0;i--){

            basis=basis*i;

        }return basis;
    }
}
