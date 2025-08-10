package Java_8.Lamdas;

public class Example1 {
    public static void main(String[] args) {
        Greetings g= new Greetings() {
            @Override
            public void greet() {
                System.out.println("Good Morning..!");
            }
        };
        g.greet();

        Greetings g2=()-> System.out.println("Good Evening..!");
        g2.greet();
    }
}
@FunctionalInterface
interface Greetings{
    void greet();
}
