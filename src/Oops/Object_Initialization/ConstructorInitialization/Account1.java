package Oops.Object_Initialization.ConstructorInitialization;

public class Account1 {
    private int accId;
    private String name;
    private double bal;
    public Account1(int i,String n,double b){    //Initialising by Parameterised constructor
        accId=i;   //Initialising by Parameterised constructor
        name=n;    //Initialising by Parameterised constructor
        bal=b;     //Initialising by Parameterised constructor
    }
    public void show(){
        System.out.println("Account Id is: "+accId);
        System.out.println("Account holder name is: "+name);
        System.out.println("Your balance is: "+bal);
    }
}
