import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTemp4 {
    public static void main(String[] args) {
        ArrayList temp = new ArrayList();
        temp.add(12);
        temp.add(112);
        temp.add(42);
        temp.add(72);
        System.out.println("Before sort: ");
        for (Object i: temp) {
            System.out.println(i);
        }
        Collections.sort(temp);
        Collections.reverse(temp);
        System.out.println("After sort: ");
        for (Object i: temp){
            System.out.println(i);
        }
    }
}
