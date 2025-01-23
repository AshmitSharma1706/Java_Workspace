package Java_8.OOP.Simple_Inheritance;

public class UseSphere {
    public static void main(String[] args) {
        Sphere s1=new Sphere();
        s1.setRadius(10);
        Sphere s2=new Sphere();
        s2.setRadius(7);

        System.out.println(s1.volume(s1.getRadius()));
        System.out.println(s2.volume(s2.getRadius()));
    }
}
