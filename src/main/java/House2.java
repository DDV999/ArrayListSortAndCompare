import java.util.ArrayList;

public class House2 {
    int area;
    int price;
    String city;
    Boolean hasFurniture;

    public House2(int area, int price, String city, Boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    public String toString(){
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("area=").append(area);
        sb.append(", price=").append(price);
        sb.append(", city='").append(city).append('\'');
        sb.append(", hasFurniture=").append(hasFurniture);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<House2> list = new ArrayList<House2>();

        House2 firstHouse = new House2(100, 120000, "Tokyo", true);
        House2 secondHouse = new House2(40, 70000, "Oxford", true);
        House2 thirdHouse = new House2(70, 180000, "Paris", false);

        list.add(firstHouse);
        list.add(secondHouse);
        list.add(thirdHouse);
        for (House2 h:list){
            System.out.println(h);
        }

        PriceComparator priceComparator = new PriceComparator();
        list.sort(priceComparator);

        System.out.println("Sorted: ");
        for (House2 h: list){
            System.out.println(h);
        }
    }
}
