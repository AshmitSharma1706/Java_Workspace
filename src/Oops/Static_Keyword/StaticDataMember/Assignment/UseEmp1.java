package Oops.Static_Keyword.StaticDataMember.Assignment;

public class UseEmp1 {
    public static void main(String[] args) {
        Emp1 x=new Emp1(21,"Ashmit");
        Emp1 y=new Emp1(20,"Anubhav");
        Emp1 z=new Emp1(19,"Bhavika");

        x.show();
        y.show();
        z.show();

        x.showNextId();
        y.showNextId();
        z.showNextId();
        {
            System.out.println("Internship Begins...!");

            Emp1 i = new Emp1(20, "Anchal");
            Emp1 j = new Emp1(20, "Harsh");

            i.show();
            j.show();

            i.showNextId();
            j.showNextId();

            System.out.println("Internship Ends...!");

            i = j = null;
            System.gc();
            System.runFinalization();
        }
        x.showNextId();
    }
}
