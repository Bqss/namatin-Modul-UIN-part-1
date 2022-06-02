package Bab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cobaact extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JTextArea txnama = new JTextArea(10,10);
    JButton copy = new JButton("Copy");

    public cobaact(){
        super("Coba act dari button");
        setSize(400,300);
        setLocation(200,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
    public void  components(){
        nama.append("Nama kamu siapa");
        getContentPane().add(nama);
        getContentPane().add(copy);
        getContentPane().add(txnama);
        txnama.setBackground(Color.lightGray);
        setVisible(true);
    }
    public void act(){
        copy.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
               txnama.append(nama.getSelectedText());
            }
        });
    }

    public static void main(String[] args) {
        cobaact m = new cobaact();
        m.components();
        m.act();
    }
}
