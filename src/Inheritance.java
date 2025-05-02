class Vehicle {
    String brand = "Generic";
    void move() {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    String model = "Sedan";
    void display() {
        System.out.println("Brand: " + brand + "\nMode: " + model);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.move();
    }
}
