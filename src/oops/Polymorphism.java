package oops;

public class Polymorphism {
    static int adder(int a, int b) {
        return a + b;
    }
    static int adder(int a, int b, int c) {
        return a + b + c;
    }
    static float adder(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(adder(10, 20));
        System.out.println(adder(10, 20, 30));
        System.out.println(adder(10.0f, 20.0f));
    }
}
