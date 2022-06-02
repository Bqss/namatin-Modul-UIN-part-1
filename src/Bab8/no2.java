package Bab8;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class no2 extends JFrame {
    JButton satu,dua,tiga,empat,lima,enam,tuju,delapan,sembilan,nol,C,samadengan,plus,minus,divide,multi;
    JTextArea ta1;

    no2(){
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
        setLayout(null);

    }

    public void initComponents(){
        ta1.setBounds(10,10,210,30);
        satu.setBounds(10,50,45,30);

        dua.setBounds(65,50,45,30);

        tiga.setBounds(120,50,45,30);

        plus.setBounds(175,50,45,30);


        empat.setBounds(10,100,45,30);

        lima.setBounds(65,100,45,30);

        enam.setBounds(120,100,45,30);

        minus.setBounds(175,100,45,30);


        tuju.setBounds(10,150,45,30);

        delapan.setBounds(65,150,45,30);

        sembilan.setBounds(120,150,45,30);

        multi.setBounds(175,150,45,30);


        nol.setBounds(10,200,45,30);

        C.setBounds(65,200,45,30);

        samadengan.setBounds(120,200,45,30);

        divide.setBounds(175,200,45,30);


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
    public void act(){
        satu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               ta1.append("1");
            }
        });
        dua.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("2");
            }
        });
        tiga.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("3");
            }
        });
        empat.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("4");
            }
        });
        lima.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("5");
            }
        });
        enam.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("6");
            }
        });
        tuju.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("7");
            }
        });
        delapan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("8");
            }
        });
        sembilan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("9");
            }
        });
        nol.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("0");
            }
        });
        C.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.setText("");
            }
        });
        divide.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("/");
            }
        });
        multi.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("*");
            }
        });
        plus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("+");
            }
        });
        minus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ta1.append("-");
            }
        });
        samadengan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fnumber = Integer.parseInt(String.valueOf(ta1.getText().charAt(0)));
                int snumber = Integer.parseInt(String.valueOf(ta1.getText().charAt(2)));
                int hasil=0;

                char op = ta1.getText().charAt(1);
                switch (op){
                    case '+':
                        hasil = fnumber+snumber;
                        break;
                    case '-':
                        hasil = fnumber-snumber;
                        break;
                    case '*':
                        hasil = fnumber*snumber;
                        break;
                    case '/':
                        try {
                            hasil = fnumber/snumber;

                        }catch (Exception l){
                            ta1.setText("");
                            ta1.append("Tidak terdefinisi");
                        }
                        break;

                }

                ta1.setText("");
                ta1.append(String.valueOf(hasil));

            }
        });
    }

    public static void main(String[] args) {
        no2 m = new no2();
        m.initComponents();
        m.act();

    }

}
