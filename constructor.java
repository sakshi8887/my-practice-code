public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

    }
}

class Student {
    String name;
    int age;

    Student() {// constructor
        // this.name=name;
        System.out.println("calling constructor");
    }
}
