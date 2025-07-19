public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sak";
        s1.roll = 2;
        s1.password = "abc";
        s1.marks[0] = 20;
        s1.marks[1] = 25;
        s1.marks[2] = 29;

        Student s2 = new Student(s1);
        s2.password = "kjgj";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s1) {// copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student() {
        marks = new int[3];
        System.out.println("call const");
    }

    /*
     * Student(String name) {
     * marks = new int[3];
     * this.name = name;
     * }
     * 
     * Student(int roll) {
     * marks = new int[3];
     * this.roll = roll;
     * }
     */

}