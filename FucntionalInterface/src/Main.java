import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<Integer> valueConsumer = (Integer x) -> System.out.println(x);

        Supplier<String> valueSupplier = () -> "Hello";

        Function<Integer, String> function = (Integer x) -> {
            if(x>10)return "greater than 10";
            return "less than 10";
        };

        Predicate<Integer> predicate = (Integer x) -> {
            if(x>10)return true;
            return false;
        };

        valueConsumer.accept(100);
        System.out.println(valueSupplier.get());
        System.out.println(function.apply(9));
        System.out.println(predicate.test(100));


    }
}