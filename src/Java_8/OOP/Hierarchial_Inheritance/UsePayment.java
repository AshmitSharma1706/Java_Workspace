package Java_8.OOP.Hierarchial_Inheritance;

public class UsePayment {
    public static void main(String[] args) {
        CreditCardPayment cp=new CreditCardPayment("101", 50000,"123456789");
        cp.authorize();
        cp.processPayment();
        cp.sendReceipt();
        System.out.println("==============================");
        NetBankingPayment np=new NetBankingPayment("102", 23000,"user@gmail.com");
        np.setEmail("user@gmail.com");
        np.loginAndPay();
        np.processPayment();
        np.sendReceipt();
    }
}
