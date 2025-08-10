package Java_8.Lamdas;

public class Example3 {
    public static void main(String[] args) {
        StringProcessor sp1=s->s.toUpperCase();
        System.out.println(sp1.process("ashmit"));

        StringProcessor sp2=s -> new StringBuilder(s).reverse().toString();
        System.out.println(sp2.process("ashmit"));
    }
}

@FunctionalInterface
interface StringProcessor{
    String process(String s);
}