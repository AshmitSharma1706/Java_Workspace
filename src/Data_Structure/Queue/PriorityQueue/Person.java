package Data_Structure.Queue.PriorityQueue;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name= " +name+" age= "+age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
    }
}
