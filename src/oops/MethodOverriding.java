package oops;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Purrs");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
