package Practice;

public class TcsXploreIPA4 {
    public static void main(String[] args) {

    }
    public static int findTotalPriceForGiveBrand(HeadSets []arr, String brand){
        int totalPrice=0;
        for (HeadSets h:arr){
            if(h.getBrand().equalsIgnoreCase(brand)){
                totalPrice+=h.getPrice();
            }
        }
        return totalPrice;
    }
    public static int findAvailableHeadsetWithSecondMinPrice(HeadSets []arr){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for (HeadSets h:arr){
            if(h.getPrice()<min) {
                secondMin = min;
                min = h.getPrice();
            }
        }
        return secondMin;
    }
}
class HeadSets{
    private String headSetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(boolean available, int price, String brand, String headSetName) {
        this.available = available;
        this.price = price;
        this.brand = brand;
        this.headSetName = headSetName;
    }

    public String getHeadSetName() {
        return headSetName;
    }

    public void setHeadSetName(String headSetName) {
        this.headSetName = headSetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "HeadSets Details -> " + "headSetName='" + headSetName + '\'' +
                ", brand='" + brand + '\'' + ", price=" + price + ", available=" + available;
    }
}
