package Bab6;

public class BacaKonsol {
    public static void main(String[] args) {
        System.out.println("data 1 = ");
        int data1 = InputConsole.Converttoint();
        System.out.println("data 2 = ");
        double data2 = InputConsole.ConverttoDouble();
        double data3 = data1+data2;
        System.out.println("data 1 + data 2 = "+data3);
    }
}
