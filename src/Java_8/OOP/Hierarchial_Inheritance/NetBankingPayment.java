package Java_8.OOP.Hierarchial_Inheritance;

public class NetBankingPayment extends Payment {
    private String email;

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
