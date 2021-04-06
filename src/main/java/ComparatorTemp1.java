import java.util.TreeSet;

public class ComparatorTemp1 implements Comparable<ComparatorTemp1>{
    private String name;

    public ComparatorTemp1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int compareTo(ComparatorTemp1 p){
        return name.length()-p.getName().length();
        //return name.compareTo(p.getName());
    }

    public static void main(String[] args) {
        TreeSet<ComparatorTemp1> people = new TreeSet<ComparatorTemp1>();
        people.add(new ComparatorTemp1("Tom"));
        System.out.println(people.first().name);
    }
}
