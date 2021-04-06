import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList listofcountries = new ArrayList();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");
        /*Unsorted List*/         System.out.println("До:");
        for(Object counter: listofcountries){
            System.out.println(counter);
        }           /* Sort statement*/
        Collections.sort(listofcountries);
        /* Sorted List*/
        System.out.println("После:");
        for(Object counter: listofcountries){
            System.out.println(counter);
        }
    }
}
