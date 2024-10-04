package Practical_Sessions.String_Handling;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        remove("programing");
        remove2("programing");
        remove3("programing");
    }
    public static void remove(String str){
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int index=str.indexOf(ch,i+1);
            if(index==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void remove2(String str){
        StringBuilder sb= new StringBuilder();
        boolean isRepeated;
        char [] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            isRepeated=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    isRepeated=true;
                    break;
                }
            }
            if(!isRepeated){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
    public static void remove3(String str){
        StringBuilder sb= new StringBuilder();
        Set<Character> charSet=new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        for(char c: charSet){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
