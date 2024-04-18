package Oops.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.IO_Operation.Reading_text_Files.The_BufferedReader_class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr = new FileReader("D:\\Java\\Java.txt");
            BufferedReader br=new BufferedReader(fr);
            String str;
            int count=0;
            while((str=br.readLine())!=null){
                System.out.println(str);
                count+=str.length();
            }
            System.out.println("Total character read: "+count);
        }
        catch (FileNotFoundException fnf){
            System.out.println("cannot open the file..! "+fnf.getMessage());
        }
        catch (IOException ex){
            System.out.println("Error while reading file");
        }
        finally {
            if(fr!=null){
                try{
                    fr.close();
                    System.out.println("File closed successfully.");
                }
                catch (IOException ex){
                    System.out.println("Error while closing file..!");
                }
            }
        }
    }
}
