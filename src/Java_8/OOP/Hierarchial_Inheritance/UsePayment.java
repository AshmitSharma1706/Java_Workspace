package Java_8.OOP.Hierarchial_Inheritance;

public class UsePayment {
    public static void main(String[] args) {
        CreditCardPayment cp=new CreditCardPayment();
        cp.setCardNumber("123456789");
        cp.authorize();
        cp.setPaymentDetails("101", 50000);
        cp.processPayment();
        cp.sendReceipt();
        System.out.println("==============================");
        NetBankingPayment np=new NetBankingPayment();
        np.setEmail("user@gmail.com");
        np.loginAndPay();
        np.setPaymentDetails("102", 23000);
        np.processPayment();
        np.sendReceipt();
    }
}
