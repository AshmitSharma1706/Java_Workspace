package Oops.Polymorphism;

public class UseLanguage {
    public static void main(String[] args) {
        Language l;
        l=new Hindi();
        l.greeting();

        l=new English();
        l.greeting();

        l=new French();
        l.greeting();
    }
}
