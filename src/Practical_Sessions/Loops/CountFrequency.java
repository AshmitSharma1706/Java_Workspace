package Practical_Sessions.Loops;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        getCharCount("test");
    }
    public static void getCharCount(String str){
        Map<Character,Integer> charMap=new HashMap<>();
        char [] arr=str.toCharArray();
        for (char c: arr){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else {
                charMap.put(c,1);
            }
        }
        System.out.println(str+":"+charMap);
    }
}
