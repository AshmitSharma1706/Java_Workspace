package Oops.String_Handling_In_Java.String.StringMethods.Overriding_equals_method_InOurClass;

public class UseBox {
    public static void main(String[] args) {
        Box b1=new Box(10,20,30);
        Box b2=new Box(10,20,30);
        b1.show();
        b2.show();
        if(b1.equals(b2)){
            System.out.println("Both boxes are same.");
        }
        else {
            System.out.println("Both boxes are different.");
        }
    }
}
