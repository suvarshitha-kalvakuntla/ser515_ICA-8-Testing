package src;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

//author - Suvarshitha kalvakuntla (skalvak1 )
public class urinals {
    public static int numberOfOuputFiles = 0;
    public  String getString() throws IOException {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String str = scanner.nextLine();

    return str;
    }

    public boolean inputFromFile(urinals u, StringBuilder outputResult) throws IOException {

        return false;

    }

    public  Boolean goodString(String str){
        //System.out.println("checks whether the input string has an error");
        if(str.length() <1 || str.length() >20 )
            return false;
        char ch;
        for(int i=0;i<(str.length()-1);i++){

            ch=str.charAt(i);
            if(ch != '1' && ch!= '0')
                return false;
            if(ch == '1' && str.charAt(i + 1) == '1')
                return false;

        }
        return true;
    }

    public  int countUrinals(String str){
        //System.out.println("count the number of free urinals");
        return 0;
    }




    public static void main(String[] args) throws IOException {
        String inputStr;
        int validUrinals;
        urinals urinal = new urinals();
        System.out.println("enter 0 for file input , 1 for terminal input");
        String t = urinal.getString();
        StringBuilder stringBuilder = new StringBuilder("");
        if(t.compareTo("0")==0) {

            urinal.inputFromFile(urinal, stringBuilder);
            //System.out.println(urinal.ResultFile(stringBuilder.toString(), urinal.generateNewOutputFile()));
        }
        else{
            inputStr = urinal.getString();
            validUrinals = urinal.countUrinals(inputStr);
            System.out.println(validUrinals);

        }







    }
}


