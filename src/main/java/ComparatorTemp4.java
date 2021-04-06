import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorTemp4 {
    private String message;
    private int id;

    public ComparatorTemp4(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "[" + id + "]" + message;
    }

    public static void main(String[] args) {
        List<ComparatorTemp4> messages = new ArrayList();
        messages.add(new ComparatorTemp4("Hello, World"));
        messages.add(new ComparatorTemp4("Hello, Sun"));
        System.out.println(messages);
    }
}
