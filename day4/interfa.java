package day4;

interface Printable {
    void print();  // method in the parent interface
}

interface Showable extends Printable {
    void show();   // additional method in the child interface
}

class A implements Showable {
    public void print() {
        System.out.println("Printing Java");
    }

    public void show() {
        System.out.println("Showing welcome message");
    }
}

public class interfa {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();  // calls the print method
        obj.show();   // calls the show method
    }
}
