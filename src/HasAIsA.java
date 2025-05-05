class Animal {}
class Dog extends Animal {
    void display() {
        System.out.println("Dog class");
    }
} // Dog Is-A Animal (inheritance)

// class Engine {
    
// }
// class Car {
//     Engine v12 = new Engine(); // Car Has-A Engine (composition)
// }

public class HasAIsA {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
