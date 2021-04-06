import java.util.ArrayList;
import java.util.Collections;

public class ArraayListTemp1 {
    public static void main(String[] args) {
        ArrayList temp1 = new ArrayList();
        temp1.add("Good");
        temp1.add("Self");
        temp1.add("Home");
        temp1.add("Dady");
        temp1.add("Salary");
        temp1.add("Stop");
        temp1.add("Heal");
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
