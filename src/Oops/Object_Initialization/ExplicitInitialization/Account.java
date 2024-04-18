package Oops.Object_Initialization.ExplicitInitialization;

public class Account {
    private int accId=1;//Explicitly initialising 'accId'
    private String name="Ashmit Sharma";//Explicitly initialising 'name'
    private double bal=10000.00;//Explicitly initialising 'bal'(balance)
    public void show(){
        System.out.println("Account Id is: "+accId);
        System.out.println("Name of Account holder: "+name);
        System.out.println("Balance is: "+bal);
    }
}
