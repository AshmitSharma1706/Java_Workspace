package Oops.Static_Keyword.StaticDataMember.Assignment;

public class UseEmp {
    public static void main(String[] args) {
        Emp x=new Emp(21,"Ashmit");
        Emp y=new Emp(20,"Anubhav");
        Emp z=new Emp(19,"Bhavika");

        x.show();
        y.show();
        z.show();

        x.showNextId();
        y.showNextId();
        z.showNextId();
    }
}
