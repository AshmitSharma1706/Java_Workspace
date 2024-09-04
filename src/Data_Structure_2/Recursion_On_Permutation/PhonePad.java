package Data_Structure_2.Recursion_On_Permutation;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println();
        System.out.println(padList("","12"));
        System.out.println(padCount("","12"));
    }
    public static void pad(String process, String unProcess){
        if(unProcess.isEmpty()){
            System.out.print(process+" ");
            return;
        }
        int digit=unProcess.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char)('a' + i);
            pad(process+ch,unProcess.substring(1));
        }
    }
    public static List<String> padList(String process, String unProcess){
        if(unProcess.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(process);
            return list;
        }
        List<String> result=new ArrayList<>();
        int digit=unProcess.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char)('a' + i);
            result.addAll(padList(process+ch,unProcess.substring(1)));
        }
        return result;
    }

    public static int padCount(String process, String unProcess){
        if(unProcess.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=unProcess.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char)('a' + i);
            count += padCount(process+ch,unProcess.substring(1));
        }
        return count;
    }
}
