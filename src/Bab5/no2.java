package Bab5;

import java.util.Arrays;

public class no2 {
    public static void main(String[] args) {
        String [][]data = {{"ABDUL","085646668991","Kediri"},
                          {"KUSNO","085646668992","Trenggalek"},
                          {"PONIRAN", "085646668999", "Bojonegoro"}};

        System.out.println("_________________________________________________________________");
        System.out.printf("| %-14s | %-17s | %-24s |\n","NAMA","ALAMAT","TELEPON");
        System.out.println("-----------------------------------------------------------------");
        String []data0 = data[0];
        String []data1 = data[1];
        String []data2 = data[2];
        System.out.printf("| %-14s | %-17s | %-24s |\n",data0[0],data0[1],data0[2]);
        System.out.printf("| %-14s | %-17s | %-24s |\n",data1[0],data1[1],data1[2]);
        System.out.printf("| %-14s | %-17s | %-24s |\n",data2[0],data2[1],data2[2]);


        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }
}
