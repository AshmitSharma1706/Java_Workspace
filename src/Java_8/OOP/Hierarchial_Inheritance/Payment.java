package Java_8.OOP.Hierarchial_Inheritance;

public class Payment {
    private final String transactionId;
    private final double amount;

    public Payment(String transactionId,double amount){
        this.transactionId=transactionId;
        this.amount=amount;
    }
    public  void processPayment(){
        System.out.println("Processing payment of Rs:"+amount+" for transaction:"+transactionId);
    }
    public void sendReceipt(){
        System.out.println("Sending receipt for transaction:"+transactionId);
    }
}
