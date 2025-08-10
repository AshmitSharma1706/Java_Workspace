package Java_8.Lamdas;

public class Example5 {
    public static void main(String[] args) {
        DiceRoller d=()->(int)(Math.random()*6)+1;
        System.out.println(d.rollDice());
    }
}

@FunctionalInterface
interface DiceRoller{
    int rollDice();
}

