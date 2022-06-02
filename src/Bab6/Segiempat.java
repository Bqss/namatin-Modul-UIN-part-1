package Bab6;

public class Segiempat {

    public void printint(int panjang , int lebar){

        double luas;
        double Keliling;
        luas = panjang*lebar;
        Keliling = 2*(panjang+lebar);
        System.out.println("***************************************************");
        System.out.println("Panjang persegi panjang = " +panjang);
        System.out.println("Lebar persegi panjang = "+lebar);
        System.out.println("Luas persegi panjang = "+luas);
        System.out.println("keliling persegi panjang = "+Keliling);
    }

    public static void main(String[] args) {
        Segiempat n =  new Segiempat();
        n.printint(10,20);
    }
}
