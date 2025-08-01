package Practice;

public class TcsXploreIPA2 {
    public static void main(String[] args) {
        Resort [] resorts={
                new Resort(101,"A","3 Star",3000,4.0),
                new Resort(102,"B","3 Star",3500,4.1),
                new Resort(103,"C","3 Star",3600,4.2),
                new Resort(104,"D","4 Star",4200,4.3),
                new Resort(105,"E","4 Star",4800,4.4),
                new Resort(106,"F","4 Star",5000,4.5),
                new Resort(107,"G","5 Star",5300,4.6),
                new Resort(108,"H","5 Star",5700,4.7),
                new Resort(109,"I","5 Star",6000,4.9)
        };
        int result=findAvbPriceByCategory(resorts,"3 Star");
        if(result>0){
            System.out.println(result);
        }
        else {
            System.out.println("There are no such available Resorts");
        }
    }
    public static int findAvbPriceByCategory(Resort []resorts, String category){
        int sum=0;
        int count=0;
        for (Resort r:resorts){
            if(r.getCategory().equalsIgnoreCase(category) && r.getRating()>4){
                sum+=(int) r.getPrice();
                count++;
            }
        }
        return (int)(sum/count);
    }
}
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public int getResortId() {
        return resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Resort details -> " + "resortId=" + resortId + ", resortName='" + resortName + '\'' +
                ", category='" + category + '\'' + ", price=" + price + ", rating=" + rating;
    }
}
