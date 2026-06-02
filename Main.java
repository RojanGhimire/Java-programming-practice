class Student {
    String name; // instance variable

    // Parameterized constructor
    Student(String n) {
        name = n;
    }

    // Copy constructor
    Student(Student s1) {
        name = s1.name;
    }

    void display() {
        System.out.println("I am copy constructor");
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ram");
        Student s2 = new Student(s1); // copy s1 to s2
        s2.display();
    }
}