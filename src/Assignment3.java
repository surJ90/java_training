public class Assignment3 {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4 };

        System.out.println("Sum of all the elements is: " + getSum(arr));
    }
}
