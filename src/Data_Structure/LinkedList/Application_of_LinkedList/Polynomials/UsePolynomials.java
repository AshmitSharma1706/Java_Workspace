package Data_Structure.LinkedList.Application_of_LinkedList.Polynomials;

public class UsePolynomials {
    public static void main(String[] args) {
        Polynomials first=new Polynomials();
        Polynomials second=new Polynomials();
        Polynomials third=new Polynomials();

        first.addAtLast(2,2);
        first.addAtLast(4,3);
        first.addAtLast(3,5);
        System.out.println("First Polynomial is...");
        first.printList();

        second.addAtLast(1,2);
        second.addAtLast(2,3);
        second.addAtLast(4,4);
        System.out.println("Second Polynomial is...");
        second.printList();

        third.addPolynomial(first,second);
        System.out.println("Added Polynomial is...");
        third.printList();
    }
}
