package bab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fil extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnmaa = new JTextArea(10,10);

    fil(){
        super("INI ADALAH FORM");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void tampilan(){
        getContentPane().add(nama);
        nama.append("Nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(txnmaa);
        txnmaa.setBackground(Color.LIGHT_GRAY);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txnmaa.append(nama.getSelectedText());
            }
        });

        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        fil k = new fil();
        k.tampilan();
    }
}
