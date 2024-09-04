package Data_Structure_2.Recursion_On_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println();
        System.out.println(permutationsList("","abc"));
        System.out.println(permutationsCount("","abc"));

    }
    public static void permutations(String process, String unProcess){
        if(unProcess.isEmpty()){
            System.out.print(process+" ");
            return;
        }
        char ch=unProcess.charAt(0);
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0, i);
            String second = process.substring(i, process.length());
            permutations(first+ch+second,unProcess.substring(1));
        }
    }
    public static List<String> permutationsList(String process, String unProcess){
        if(unProcess.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(process);
            return list;
        }
        char ch=unProcess.charAt(0);
        List<String> answer=new ArrayList<>();
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0, i);
            String second = process.substring(i, process.length());
            answer.addAll(permutationsList(first+ch+second,unProcess.substring(1)));
        }
        return answer;
    }
    public static int permutationsCount(String process, String unProcess){
        if(unProcess.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=unProcess.charAt(0);
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0, i);
            String second = process.substring(i, process.length());
            count += permutationsCount(first+ch+second,unProcess.substring(1));
        }
        return count;
    }
}
