package Java_8.Lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Player> players=Arrays.asList(new Player(4,"Ashmit",23)
                ,new Player(1,"Anubahv",22)
                ,new Player(3,"Bhavika",24)
                ,new Player(2,"Anchal",21));

        Comparator<Player> c=(p1,p2)->p1.getRanking()-p2.getRanking();
        System.out.println(players);
        Collections.sort(players,c);
        System.out.println(players);
    }
}

class Player{
    public int ranking;
    public String name;
    public int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player -> " + "ranking=" + ranking + ", name='" + name + ", age=" + age;
    }
}

