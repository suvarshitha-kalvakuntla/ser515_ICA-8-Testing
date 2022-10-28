package src;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//author - Suvarshitha kalvakuntla (skalvak1 )
public class urinals {
    public  String getString(){
        System.out.println("enter a string");
        return "";
    }

    public  Boolean goodString(String str){
        System.out.println("checks whether the input string has an error");
        return true;
    }

    public  int countUrinals(String str){
        System.out.println("count the number of free urinals");
        return 0;
    }

    public static void main(String[]args) throws IOException {
        System.out.println("added main method in urinals class");
        String inputStr;
        int validUrinals;
        urinals urinal = new urinals();
        inputStr = urinal.getString();
        validUrinals = urinal.countUrinals(inputStr);
        System.out.println("number of free urinals are" + "  " +validUrinals);

    }
}


