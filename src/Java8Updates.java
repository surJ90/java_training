import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface Greeting {
    void greet(String name);
    default void defGreet() {
        System.out.println("Welcome!");
    }
}
public class Java8Updates {
     public static void main(String[] args) {
        Greeting newGreet = name -> System.err.println("Hello " + name);
        newGreet.greet("Suraj");
        newGreet.defGreet();
        // Stream API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * 2)
               .forEach(System.out::println); // Method Reference

        // Optional
        Optional<String> name = Optional.ofNullable("Bob");
        System.out.println(name.orElse("Unknown"));

        // Date and Time API
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
     }
}
