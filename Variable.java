public class Variable {
    int a = 1; // instance variable
    static int c = 1; // static variable

    void display() {
        int b = 1; // local variable

        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
        System.out.println("value of c is " + c);
    }

    public static void main(String[] args) {
        Variable v1 = new Variable();
        v1.display();
    }
}