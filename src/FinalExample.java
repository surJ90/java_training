final class Final {
    final int value;
    public Final(int value) {
        this.value = value;
    }
    final void display() {
        System.out.println("Value: " + value);
    }
}

// class Child extends Final {}

public class FinalExample {
    public static void main(String[] args) {
        Final obj = new Final(21);
        obj.display();
    }
}
