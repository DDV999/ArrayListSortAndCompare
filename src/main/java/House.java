import java.util.TreeSet;

public class House implements Comparable<House>{
    private int area;
    private int price;
    private String city;
    Boolean hasFurniture;

    public House(int area, int price, String city, Boolean hasFurniture) {
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
        TreeSet<House> tree = new TreeSet<House>();
        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        tree.add(firstHouse);
        tree.add(secondHouse);
        tree.add(thirdHouse);

        for (House h: tree) {
            System.out.println(h);
        }
    }

    public int compareTo(House o) {
        if (this.area==o.area){
            return 0;
        } else if (this.area<o.area){
            return -1;
        } else {
            return 1;
        }
    }
}
