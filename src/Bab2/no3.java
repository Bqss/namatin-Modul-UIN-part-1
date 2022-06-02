package Bab2;
import javax.swing.*;
public class no3 {
    public static void main(String[]a){
        double totalpenjualan,uangjasa = 0,komisi=0;
        double totalpendapatan=0;
        totalpenjualan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan total penjualan dalam sehari "));
        if (totalpenjualan==2000000){
            uangjasa=1000000;
            komisi = 0.1 * totalpenjualan;

        }else if (totalpenjualan>=2000000 && totalpenjualan<=5000000){
            uangjasa= 200000;
            komisi=0.15*totalpenjualan;

        }else if(totalpenjualan>5000000){
            uangjasa=300000;
            komisi=0.2*totalpenjualan;
        }
        totalpendapatan =(int) (uangjasa+komisi);
        JOptionPane.showMessageDialog(null,"total pendapatan = "+totalpendapatan);





    }
}
