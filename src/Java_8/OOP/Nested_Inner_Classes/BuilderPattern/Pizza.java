package Java_8.OOP.Nested_Inner_Classes.BuilderPattern;

public class Pizza {
    private String size;
    private String crustType;

    private boolean cheese;
    private boolean olive;
    private boolean mushroom;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isOlive() {
        return olive;
    }

    public void setOlive(boolean olive) {
        this.olive = olive;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    @Override
    public String toString() {
        return "Pizza details -> " + "size=" + size + ", crustType=" + crustType +
                ", cheese=" + cheese + ", olive=" + olive + ", mushroom=" + mushroom;
    }

    private Pizza(PizzaBuilder pb) {
        this.size = pb.size;
        this.crustType = pb.crustType;
        this.cheese = pb.cheese;
        this.olive = pb.olive;
        this.mushroom = pb.mushroom;
    }

    public static class PizzaBuilder{
        private String size;
        private String crustType;

        private boolean cheese;
        private boolean olive;
        private boolean mushroom;

        public PizzaBuilder(String size, String crustType) {
            this.size = size;
            this.crustType = crustType;
        }

        public PizzaBuilder isCheese(boolean isCheese) {
            this.cheese=isCheese;
            return this;
        }

        public PizzaBuilder isOlive(boolean isOlive) {
            this.olive=isOlive;
            return this;
        }

        public PizzaBuilder isMushroom(boolean isMushroom) {
            this.mushroom=isMushroom;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
class MakePizza{
    public static void main(String[] args) {
        Pizza p=new Pizza.PizzaBuilder("Large","Thin Crust").isCheese(true)
                .isMushroom(true).build();
        System.out.println(p);

        Pizza p2=new Pizza.PizzaBuilder("Medium","Hand Tossed").isCheese(true)
                .isMushroom(true).isOlive(true).build();
        System.out.println(p2);
    }
}