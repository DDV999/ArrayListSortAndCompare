import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTemp2 {
    public static void main(String[] args) {
        ArrayList temp1 = new ArrayList();
        temp1.add(45);
        temp1.add(12);
        temp1.add(78);
        temp1.add(111);
        temp1.add(6);
        temp1.add(32);
        temp1.add(17);
        System.out.println("After sort: ");
        for (Object i : temp1) {
            System.out.println(i);
        }
        Collections.sort(temp1);
        System.out.println("Before sort: ");
        for (Object i : temp1) {
            System.out.println(i);
        }
    }
}
