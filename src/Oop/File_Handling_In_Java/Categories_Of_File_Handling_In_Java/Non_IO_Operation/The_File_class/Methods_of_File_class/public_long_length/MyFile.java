package Oop.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.Non_IO_Operation.The_File_class.Methods_of_File_class.public_long_length;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File f=new File("D:\\Java\\Java.txt");
        System.out.println(f.getName()+" is of "+f.length()+" bytes.");
    }
}
