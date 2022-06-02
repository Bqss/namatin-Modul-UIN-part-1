package Bab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputConsole {

    public static String input (){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String val = "";
        try {
            val = in.readLine();
        }catch ( IOException ex){
            System.out.println("ex");
        }
        return val;

    }
    public static int Converttoint(){

        return Integer.parseInt(input());
    }
    public static Double ConverttoDouble(){
        return Double.parseDouble(input());
    }
}