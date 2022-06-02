package bab7;

import javax.swing.*;
import java.awt.*;

public class no3 extends JFrame {
    JButton satu,dua,tiga,empat,lima,enam,tuju,delapan,sembilan,nol,C,samadengan,plus,minus,divide,multi;
    JTextArea ta1;

    no3(){
        super("Calculator");

        satu = new JButton("1");
        dua = new JButton("2");
        tiga = new JButton("3");
        empat = new JButton("4");
        lima = new JButton("5");
        enam = new JButton("6");
        tuju = new JButton("7");
        delapan = new JButton("8");
        sembilan = new JButton("9");
        nol = new JButton("0");
        samadengan = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        C = new JButton("C");
        divide = new JButton("/");
        multi = new JButton("*");
        ta1 = new JTextArea();

        setSize(250,300);
        setLocation(400,400);
        setBackground(Color.white);
        setLayout(null);

    }

    public void initComponents(){
        ta1.setBounds(10,10,210,30);
        satu.setBounds(10,50,45,30);
        satu.setBackground(Color.GRAY);
        satu.setForeground(Color.white);
        dua.setBounds(65,50,45,30);
        dua.setBackground(Color.GRAY);
        dua.setForeground(Color.white);
        tiga.setBounds(120,50,45,30);
        tiga.setBackground(Color.GRAY);
        tiga.setForeground(Color.white);
        plus.setBounds(175,50,45,30);
        plus.setBackground(Color.GRAY);
        plus.setForeground(Color.white);

        empat.setBounds(10,100,45,30);
        empat.setBackground(Color.GRAY);
        empat.setForeground(Color.white);
        lima.setBounds(65,100,45,30);
        lima.setBackground(Color.GRAY);
        lima.setForeground(Color.white);
        enam.setBounds(120,100,45,30);
        enam.setBackground(Color.GRAY);
        enam.setForeground(Color.white);
        minus.setBounds(175,100,45,30);
        minus.setBackground(Color.GRAY);
        minus.setForeground(Color.white);

        tuju.setBounds(10,150,45,30);
        tuju.setBackground(Color.GRAY);
        tuju.setForeground(Color.white);
        delapan.setBounds(65,150,45,30);
        delapan.setBackground(Color.GRAY);
        delapan.setForeground(Color.white);
        sembilan.setBounds(120,150,45,30);
        sembilan.setBackground(Color.GRAY);
        sembilan.setForeground(Color.white);
        multi.setBounds(175,150,45,30);
        multi.setBackground(Color.GRAY);
        multi.setForeground(Color.white);

        nol.setBounds(10,200,45,30);
        nol.setBackground(Color.GRAY);
        nol.setForeground(Color.white);
        C.setBounds(65,200,45,30);
        C.setBackground(Color.GRAY);
        C.setForeground(Color.white);
        samadengan.setBounds(120,200,45,30);
        samadengan.setBackground(Color.GRAY);
        samadengan.setForeground(Color.white);
        divide.setBounds(175,200,45,30);
        divide.setBackground(Color.GRAY);
        divide.setForeground(Color.white);

        getContentPane().add(satu);
        getContentPane().add(dua);
        getContentPane().add(tiga);
        getContentPane().add(ta1);
        getContentPane().add(plus);
        getContentPane().add(empat);
        getContentPane().add(lima);
        getContentPane().add(enam);
        getContentPane().add(minus);
        getContentPane().add(tuju);
        getContentPane().add(delapan);
        getContentPane().add(sembilan);
        getContentPane().add(multi);
        getContentPane().add(nol);
        getContentPane().add(C);
        getContentPane().add(divide);
        getContentPane().add(samadengan);


        setVisible(true);

    }

    public static void main(String[] args) {
        no3 m = new no3();
        m.initComponents();

    }

}