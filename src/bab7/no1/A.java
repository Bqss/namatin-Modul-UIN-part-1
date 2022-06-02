package bab7.no1;

import javax.swing.*;
import java.awt.*;

public class A extends JFrame {
    JButton cb1 = new JButton("Pilih A");
    JButton cb2 = new JButton("Pilih B");

    A(){
        setTitle("Program GUI pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    void Objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.GRAY);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }

    public static void main(String[] args) {
        A m = new A();
        m.Objek();
    }
}
