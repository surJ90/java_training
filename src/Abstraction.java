abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.println("Area of circle: " + circle.area());
    }
}
