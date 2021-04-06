import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTemp6 {
    public static void main(String[] args) {
        List<String> temp = new ArrayList<String>();
        Collections.addAll(temp,"good","fail","sex","heal","trow","boom");
        temp.stream().filter(p->p.length()<4).sorted().forEach(s-> System.out.println(s));
    }
}
