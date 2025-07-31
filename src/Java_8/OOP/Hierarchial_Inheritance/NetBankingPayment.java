package Java_8.OOP.Hierarchial_Inheritance;

public class NetBankingPayment extends Payment {
    private String email;

    public NetBankingPayment(String transactionId,double amount, String email){
        super(transactionId,amount);
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void loginAndPay(){
        System.out.println("Logging in to "+email+" for net banking");
    }

}
