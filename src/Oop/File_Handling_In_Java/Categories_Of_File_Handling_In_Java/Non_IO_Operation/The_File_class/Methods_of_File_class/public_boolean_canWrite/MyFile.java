package Oop.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.Non_IO_Operation.The_File_class.Methods_of_File_class.public_boolean_canWrite;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File f=new File("D:\\Java\\Java.txt");
        if(f.canWrite()){
            System.out.println(f.getName()+" allows writing");
        }
        else {
            System.out.println(f.getName() + " not allows writing");
        }
    }
}
