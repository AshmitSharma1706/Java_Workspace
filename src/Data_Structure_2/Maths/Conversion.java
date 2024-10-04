package Data_Structure_2.Maths;

public class Conversion {
    public static void main(String[] args) {
        int num=9;
        System.out.println(Integer.toBinaryString(num));
        String answer=binary(num);
        System.out.println(answer);

        int binary=1001;
        int decimal=decimal(binary);
        System.out.println(decimal);

        System.out.println(celsius(96));
        System.out.println(fahrenheit(36));

        System.out.println(stringToInt("123"));
    }
    public static String binary(int num){
        StringBuilder binary=new StringBuilder();
        int x=num;
        while (x>0){
            int rem=x % 2;
            x=x/2;
            binary.append(rem);
        }
        return binary.reverse().toString();
    }
    public static int decimal(int num){
        int x=num;
        int decimal=0, i=0;
        while (x>0){
            int rem=x % 10;
            x=x/10;
            decimal=decimal + (rem * (int)Math.pow(2,i++));
        }
        return decimal;
    }
    public static double celsius(int f){
        double result= (f-32) * (float)5/9;
        result=Math.round(result);
        return result;
    }
    public static double fahrenheit(int c){
        double result= (float)(c*9)/5 +32;
        result=Math.round(result);
        return result;
    }
    public static int stringToInt(String str){
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            num=num*10 + (int)(ch-48);
        }
        return num;
    }
}
