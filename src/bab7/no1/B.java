package bab7.no1;

import javax.swing.*;
import java.awt.*;

public class B extends JFrame {
    Checkbox cb1 = new Checkbox("Pilih A");
    Checkbox cb2 =  new Checkbox("Pilih B");
    Checkbox cb3 = new Checkbox("Pilih C");

    B(){
        super("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void Objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }

    public static void main(String[] args) {
        B m = new B();
        m.Objek();
    }
}
