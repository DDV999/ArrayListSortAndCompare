import java.util.Comparator;

public class PriceComparator implements Comparator<House2> {
    public int compare(House2 o1, House2 o2){
        if(o1.price== o2.price){
            return 0;
        } else  if (o1.price>o2.price){
            return 1;
        } else {
            return -1;
        }
    }
}
