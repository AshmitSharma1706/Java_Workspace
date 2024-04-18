package Oops.File_Handling_In_Java.Categories_Of_File_Handling_In_Java.Non_IO_Operation.The_File_class.Methods_of_File_class.public_String_list;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        File f=new File("D:");
        String [] arr=f.list();
        System.out.println("Total number of Directories: "+arr.length);
        for(String x:arr){
            System.out.println(x);
        }
    }
}
