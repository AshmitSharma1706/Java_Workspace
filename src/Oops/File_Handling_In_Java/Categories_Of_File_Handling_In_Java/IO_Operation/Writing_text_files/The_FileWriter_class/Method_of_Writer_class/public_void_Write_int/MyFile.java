package Oops.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.IO_Operation.Writing_text_files.The_FileWriter_class.Method_of_Writer_class.public_void_Write_int;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw=new FileWriter("D:\\Java\\Java4.txt");
            fw.write('A');
        }
        catch(IOException ie){
            System.out.println("Error");
        }
        finally {
            if(fw!=null){
                try{
                    fw.close();
                    System.out.println("File closed successfully.");
                }
                catch (IOException ex){
                    System.out.println("Error while closing file..!");
                }
            }
        }
    }
}
