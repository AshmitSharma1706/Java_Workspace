package Oops.Interface;

import Oops.Interface.MyClass;
import Oops.Interface.MyInterface3;

public class UseInterface {
    public static void main(String[] args) {
        MyInterface3 ref;

        ref=new MyClass();
        ref.show();
        ref.display();
    }
}
