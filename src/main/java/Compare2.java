import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class Compare2 implements Comparator<String> {
    @Override
    public int compare(String obj1, String obj2) {
        return obj1.compareTo(obj2);
    }

    public static void main(String[] args) {
        TreeSet<String> data = new TreeSet<String>();
        data.add(new String("Змей Горыныч"));
        data.add(new String("Баба Яга"));
        data.add(new String("Илья Муромец"));
        data.add(new String("Алеша Попович"));
        data.add(new String("Соловей Разбойник"));

        Iterator<String> i = data.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}