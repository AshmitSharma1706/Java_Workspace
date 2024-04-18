package Oops.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class Derived extends Base {
    private int j;
    public Derived(int i, int j){
        super(i);
        this.j=j;
        System.out.println("Constructor called of Derived class...! "+j);
    }
}
