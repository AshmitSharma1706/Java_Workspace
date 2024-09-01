package Data_Structure_2.Recursion_On_String;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        subSequence3("","abc");
        System.out.println(subSequence4("","abc"));
    }
    public static void subSequence(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        subSequence(p+ch,s.substring(1));
        subSequence(p,s.substring(1));
    }
    public static List<String> subSequence2(String p, String s){
        if(s.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=s.charAt(0);
        List<String> left = subSequence2(p+ch,s.substring(1));
        List<String> right = subSequence2(p,s.substring(1));
        left.addAll(right);
        return left;
    }
    public static void subSequence3(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        subSequence3(p+ch,s.substring(1));
        subSequence3(p,s.substring(1));
        subSequence3(p+(ch+0),s.substring(1));
    }
    public static List<String> subSequence4(String p, String s){
        if(s.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=s.charAt(0);
        List<String> first = subSequence4(p+ch,s.substring(1));
        List<String> second = subSequence4(p,s.substring(1));
        List<String> third = subSequence4(p+(ch+0),s.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
