package Bab3;

import javax.swing.*;

public class no3 {
    public static void main(String[] args) {
        int in ;
        in = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka anda :"));
        if (in<1 || in>10){
            System.out.println("Invalid input");
        }else {
            switch (in) {
                case 1 -> JOptionPane.showMessageDialog(null,"Satu");
                case 2 -> JOptionPane.showMessageDialog(null,"Dua");
                case 3 -> JOptionPane.showMessageDialog(null,"Tiga");
                case 4 -> JOptionPane.showMessageDialog(null,"Empat");
                case 5 -> JOptionPane.showMessageDialog(null,"Lima");
                case 6 -> JOptionPane.showMessageDialog(null,"Enam");
                case 7 -> JOptionPane.showMessageDialog(null,"tujuh");
                case 8 -> JOptionPane.showMessageDialog(null,"Delapan");
                case 9 -> JOptionPane.showMessageDialog(null,"Sembilan");
                case 10 -> JOptionPane.showMessageDialog(null,"Sepuluh");
            }
        }

    }
}
