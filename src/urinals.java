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
    public boolean checkFileExists(File file){
        return false;
    }

    public boolean inputFromFile(urinals u, StringBuilder outputResult) throws IOException {
        File file = new File("src/urinal.dat");
        checkFileExists(file);
        FileReader fileReader = new FileReader(file);
        if(fileReader == null) {
            System.err.println("Error in reading dat file");
            return false;

        }
        Scanner scanner = new Scanner(fileReader);
        String str;
        while(scanner.hasNextLine()) {
            str = scanner.nextLine();
            if(str.compareTo("-1")==0)
                break;
            int countOfurinals = u.countUrinals(str);
            outputResult.append(countOfurinals+"\n");

        }

        return true;

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
        int pos=0;
        int flag=0;
        if(!goodString(str))
            return -1;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='0'){
                flag+=1;
            }else{

                if(flag>1){
                    flag-=1;
                    if(flag%2=='0')
                        pos=pos+flag/2;
                    else
                        pos=pos+1+(flag-1)/2;

                }
                flag=-1;

            }

        }
        if(flag>0) {

            if (flag % 2 == '0')
                pos = pos + flag / 2;
            else
                pos = pos + 1 + (flag - 1) / 2;
        }

        return pos;


    }
    public boolean ResultFile(String stringBuilder, File file){
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder);
            writer.close();
            numberOfOuputFiles++;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }
    public File generateNewOutputFile(){
        String path = "rule"+numberOfOuputFiles+".txt";
        if(numberOfOuputFiles == 0) {
            path = "rule.txt";
        }
        File file = new File(path);
        while(file.exists()) {
            numberOfOuputFiles++;
            return generateNewOutputFile();
        }
        return file;
    }




    public static void main(String[] args) throws IOException {
        String inputStr;
        int validUrinals;
        urinals urinal = new urinals();
        System.out.println("enter 0 for file input , 1 for keyboard input");
        String t = urinal.getString();
        StringBuilder stringBuilder = new StringBuilder("");
        if(t.compareTo("0")==0) {

            urinal.inputFromFile(urinal, stringBuilder);
            System.out.println(urinal.ResultFile(stringBuilder.toString(), urinal.generateNewOutputFile()));
        }
        else{
            inputStr = urinal.getString();
            validUrinals = urinal.countUrinals(inputStr);
            System.out.println(validUrinals);

        }







    }
}


