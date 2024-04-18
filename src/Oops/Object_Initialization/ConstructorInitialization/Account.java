package Oops.Object_Initialization.ConstructorInitialization;

public class Account {
    private int accId;
    private String name;
    private double bal;
    public Account(){
        accId=1;//Initialising by constructor.
        name="Ashmit Sharma";//Initialising by constructor.
        bal=10000.00;//Initialising by constructor.
    }
    public void show(){
        System.out.println("Account Id is: "+accId);
        System.out.println("Name of Account holder: "+name);
        System.out.println("Balance is: "+bal);
    }
}
