class Studentt {
    String name = "Ram";
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Studentt s = new Studentt();

        System.out.println(s.toString());
        System.out.println(s.getClass());
    }
}