class Example {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
class Parent {
    void display() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.add(10, 20);
        ex.add(10, 20, 30);
        Parent obj = new Child();
        obj.display();
    }
}
