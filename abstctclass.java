public class abstctclass {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // h.walk();
        // h.eat();

    }
}

abstract class Animal {
    String color;

    Animal() {// constructor
        System.out.println("animal constructor");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {// constructor
        System.out.println("horse constructor");
    }

    void walk() {
        System.out.println("walks");
    }
}

class Mustang extends Horse {
    Mustang() {// constructor
        System.out.println("mustang constructor");
    }
}
