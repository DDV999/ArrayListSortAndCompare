import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTemp3 {
    private String name;
    private int age;

    public ComparatorTemp3(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Comparator<ComparatorTemp3> pcom = new ComparatorByName().thenComparing(new ComparatorByAge());
        TreeSet<ComparatorTemp3> people = new TreeSet(pcom);

        people.add(new ComparatorTemp3("Tom",23));
        people.add(new ComparatorTemp3("Nick",34));
        people.add(new ComparatorTemp3("Tom",10));
        people.add(new ComparatorTemp3("Bill",14));

        for (ComparatorTemp3 p: people) {
            System.out.println(p.getName()+" "+p.getAge());
        }

    }
}

class ComparatorByName implements Comparator<ComparatorTemp3>{
    public int compare(ComparatorTemp3 a, ComparatorTemp3 b){
        return a.getName().compareTo(b.getName());
    }
}

class ComparatorByAge implements Comparator<ComparatorTemp3>{
    public int compare(ComparatorTemp3 a, ComparatorTemp3 b){
        if(a.getAge()<b.getAge()){
            return -1;
        } else if (a.getAge()>b.getAge()){
            return 1;
        } else {
            return 0;
        }
    }
}
