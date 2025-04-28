import java.util.ArrayList;
// Enum example
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
public class Java5Updates {
    // Varargs method
    public static void printNumbers(Integer... numbers) {
        // Enhanced for loop
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        // Generics
        ArrayList<String> names = new ArrayList<>();
        names.add("Suraj");
        names.add("Satish");
        // No casting needed
        for (String s : names) {
            System.out.println(s);
        }
        // Autoboxing
        Integer num = 10;
        System.out.println("Autoboxed number: " + num);
        // Enum
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
        // Varargs
        printNumbers(1, 2, 3, 4, 5);
    }
}
