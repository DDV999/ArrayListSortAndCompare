import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTemp2 {
    private String name;

    public ComparatorTemp2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PersonComparator pcomp = new PersonComparator();
        TreeSet<ComparatorTemp2> people = new TreeSet<ComparatorTemp2>(pcomp);
        people.add(new ComparatorTemp2("Tom"));
        people.add(new ComparatorTemp2("Nick"));
        people.add(new ComparatorTemp2("Alice"));
        people.add(new ComparatorTemp2("Bill"));
        for (ComparatorTemp2 p : people) {
            System.out.println(p.getName());
        }
    }
}

class PersonComparator implements Comparator<ComparatorTemp2> {
    public int compare(ComparatorTemp2 a, ComparatorTemp2 b) {
        return a.getName().compareTo(b.getName());
    }
}