public class inheritence {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.fins = 9;
        System.out.println(shark.fins);
    }
}

class Animal {// base class
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {// derived class
    int fins;

    void swim() {
        System.out.println("swims");
    }
}
