package Oops.Static_Keyword.StaticMethod;

public class UseEmp2 {
    public static void main(String[] args) {
        Emp2 x=new Emp2(21,"Ashmit");
        Emp2 y=new Emp2(20,"Anubhav");
        Emp2 z=new Emp2(19,"Bhavika");

        x.show();
        y.show();
        z.show();

        Emp2.showNextId();

        {
            System.out.println("Internship Begins...!");

            Emp2 i = new Emp2(20, "Anchal");
            Emp2 j = new Emp2(20, "Harsh");

            i.show();
            j.show();

            Emp2.showNextId();

            System.out.println("Internship Ends...!");

            i = j = null;
            System.gc();
            System.runFinalization();
        }
        Emp2.showNextId();
    }
}
