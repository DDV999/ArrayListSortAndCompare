import java.util.Comparator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ComparatorTemp6 {
    public static void main(String[] args) {
        Supplier<Integer> randomizer = () -> new Random().nextInt(1000);
        Stream.generate(randomizer)
                .limit(10)
                .sorted(Comparator.naturalOrder())
                .forEach(e -> System.out.println(e));
    }
}
