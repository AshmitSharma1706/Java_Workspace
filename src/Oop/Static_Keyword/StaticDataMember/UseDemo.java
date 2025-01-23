package Oop.Static_Keyword.StaticDataMember;

public class UseDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();

        d1.a=10;
        d2.a=20;
        d3.a=30;

        System.out.println("d1.a is: "+d1.a);
        System.out.println("d2.a is: "+d2.a);
        System.out.println("d3.a is: "+d3.a);

        Demo.b=10;
        Demo.b=20;
        Demo.b=30;

        System.out.println("d1.b is: "+Demo.b);
        System.out.println("d2.b is: "+Demo.b);
        System.out.println("d3.b is: "+Demo.b);

    }
}
