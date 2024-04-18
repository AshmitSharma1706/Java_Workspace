package Oops.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.IO_Operation.Reading_text_Files.The_fileReader_class.Methods_of_reader_class.public_void_close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr = new FileReader("D:\\Java\\Java.txt");
            int ch;
            int count=0;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
                ++count;
            }
            System.out.println("\nTotal character read: "+count);
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
