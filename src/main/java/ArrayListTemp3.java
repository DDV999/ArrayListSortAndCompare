import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTemp3 {
    public static void main(String[] args) {
        ArrayList temp = new ArrayList();
        temp.add(11);
        temp.add(71);
        temp.add(5);
        temp.add(98);
        System.out.println("Before sort: ");
        for (Object i:temp) {
            System.out.println(i);
        }

        Collections.sort(temp, Collections.reverseOrder());
        System.out.println("After sort: ");
        for (Object i:temp) {
            System.out.println(i);
        }
    }
}
