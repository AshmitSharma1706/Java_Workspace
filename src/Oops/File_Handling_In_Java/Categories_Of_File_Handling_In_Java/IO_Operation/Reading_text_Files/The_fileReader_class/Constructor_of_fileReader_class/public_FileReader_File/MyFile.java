package Oops.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.IO_Operation.Reading_text_Files.The_fileReader_class.Constructor_of_fileReader_class.public_FileReader_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) {
        FileReader fr=null;
        try{
            fr=new FileReader("D:\\Java\\Java.txt");
            System.out.println("Is file Ready..?: "+fr.ready());
        }
        catch (FileNotFoundException fnf){
            System.out.println("File not found..! "+fnf.getMessage());
        }
        catch (IOException ex){
            System.out.println("Some error in checking file..!");
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
