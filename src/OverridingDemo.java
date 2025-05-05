class Parent {
    // 1. Access modifier
    protected void display() {
        System.out.println("Parent display");
    }
    // 2. Final method
    final void finalMethod() {
        System.out.println("Final method");
    }
    // 3. Static method
    static void staticMethod() {
        System.out.println("Static method");
    }
    // 4. Private method
    // private void privateMethod() {
    //     System.out.println("Private method");
    // }
    // 5. Covarient return type
    Parent getObject() {
        return this;
    }
    // 6. Super call & 7. Exception handling
    void process() throws RuntimeException {
        System.out.println("Parent process");
    }
}

class Child extends Parent {
    @Override 
    public void display() { // Changing access modifier from protected to public
        System.out.println("Child display");
    }
    // Final method cannot be overridden
    // void finalMethod() {
    //     System.out.println("Final method");
    // } -> Compilation error
    static void staticMethod() { // static method cannot be overridden, can be hidden
        System.out.println("Child static");
    }
    // void privateMethod() { // not inherited, not overridden
    //     System.out.println("Child private");
    // }
    @Override
    Child getObject() { // Covarient return type
        return this;
    }
    @Override // Invoking parent's override method
    void process() { // same or narrower exception handling
        super.process(); // calls parent's method
        System.out.println("Child process");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
        parent.process();
        System.out.println(parent.getObject().getClass());
        Parent.staticMethod();
        Child.staticMethod();
        Parent p = new Parent();
        p.finalMethod();
    }
}
