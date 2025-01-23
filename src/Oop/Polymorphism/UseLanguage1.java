package Oop.Polymorphism;

public class UseLanguage1 {
    public static void main(String[] args) {
        Language1 l;
        l=new Hindi1();
        l.greeting();

        l=new English1();
        l.greeting();

        l=new French1();
        l.greeting();
    }
}
