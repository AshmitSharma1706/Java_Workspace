package Oop.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.IO_Operation.Writing_text_files.The_FileWriter_class.Method_of_Writer_class.public_void_Write_flush;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw=new FileWriter("D:\\Java\\Java3.txt");
            Scanner kb=new Scanner(System.in);
            System.out.println("What is your name..? ");
            String name= kb.nextLine();
            System.out.println("What is your address..? ");
            String add= kb.nextLine();
            fw.write(name);
            fw.write("\n");
            fw.write(add);
        }
        catch(IOException ie){
            System.out.println("Error");
        }
        finally {
            if(fw!=null){
                try{
                    fw.flush();
                    System.out.println("File saved successfully.");
                    fw.close();
                    System.out.println("File closed Successfully.");
                }
                catch (IOException ex){
                    System.out.println("Error while closing file..!");
                }
            }
        }
    }
}
