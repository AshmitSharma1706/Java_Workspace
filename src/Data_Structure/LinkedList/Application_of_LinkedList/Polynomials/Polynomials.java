package Data_Structure.LinkedList.Application_of_LinkedList.Polynomials;

public class Polynomials {
    private Node head;
    public void addAtLast(int coefficient, int exponent){
        Node p=new Node(coefficient,exponent);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty..!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getCoefficient()+"x"+temp.getExponent()+"+");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public void addPolynomial(Polynomials p1, Polynomials p2){
        if(p1.head==null && p2.head==null){
            System.out.println("Both list are empty, cannot be added..!");
            return;
        }
        Node f=p1.head;
        Node s=p2.head;
        Node temp=null, p=null;
        while(f!=null && s!=null){
            p=new Node();
            if(head==null){
                head=p;
            }
            else {
                temp.setNext(p);
            }
            temp=p;
            if(f.getExponent()<s.getExponent()){
                p.setCoefficient(f.getCoefficient());
                p.setExponent(f.getExponent());
                f=f.getNext();
            }
            else if(f.getExponent()>s.getExponent()){
                p.setCoefficient(s.getCoefficient());
                p.setExponent(s.getExponent());
                s=s.getNext();
            }
            else {
                p.setCoefficient(f.getCoefficient()+s.getCoefficient());
                p.setExponent(f.getExponent());
                f=f.getNext();
                s=s.getNext();
            }
        }
        Node q=null;
        if(f!=null){
            q=f;
        }
        else {
            q=s;
        }
        while(q!=null){
            p=new Node(q.getCoefficient(),q.getExponent());
            if (head==null){
                head=p;
            }
            else {
                temp.setNext(p);
            }
            temp=p;
            q=q.getNext();
        }

    }
}
