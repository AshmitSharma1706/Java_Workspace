package Java_8.OOP.Hierarchial_Inheritance;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String transactionId,double amount,String cardNumber){
        super(transactionId,amount);
        this.cardNumber=cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void authorize(){
        System.out.println("Authorizing card number:"+cardNumber);
    }
}
