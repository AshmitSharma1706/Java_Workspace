package Oop.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.Non_IO_Operation.The_File_class.Methods_of_File_class.public_boolean_mkdir;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File f=new File("D:\\Java\\Java3.txt");
        System.out.println("Is the new file created..!: "+f.mkdir());
        System.out.println("Name of the new file created: "+f.getName());
        System.out.println(f.getName()+" is present..? "+f.exists());
    }
}
