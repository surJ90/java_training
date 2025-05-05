class Book {
    String bookName;
    String author;
    double price;
    public Book() {
        this.bookName = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String bookName) {
        this.bookName = bookName;
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.price = 0.0;
    }
    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Book Name: " + this.bookName + 
        ", Author: " + this.author + ", Price: " + this.price);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Sapiens");
        Book b3 = new Book("Alchemist", "Poulo Cholo");
        Book b4 = new Book("Tiny Experiments", "Anne", 345.45);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
