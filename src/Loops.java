public class Loops {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Traditional for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnhanced for loop");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
