package Bab8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class no1 extends JFrame {
    JButton btn1 = new JButton("Klik 1,2,3,4");
    JLabel lb1 = new JLabel("Maka ukuran frame akan bebrubah");

    public no1(){
        super("Ini adalah key action pada keyboard");
        setSize(400,200);
        setLocation(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void initcomponents(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(btn1);
        getContentPane().add(lb1);
        setVisible(true);
    }
    public void act(){
        btn1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
              if (e.getKeyChar()== KeyEvent.VK_1){
                  setSize(300,500);
              } else if (e.getKeyChar()==KeyEvent.VK_2){
                    setSize(200, 100);
              } else if (e.getKeyChar()==KeyEvent.VK_3){
                  setSize(100,10);
              }else if (e.getKeyChar()==KeyEvent.VK_4){
                  setSize(900,200);
              }

            }
        });
    }

    public static void main(String[] args) {
        no1 m = new no1();
        m.initcomponents();
        m.act();
    }
}
