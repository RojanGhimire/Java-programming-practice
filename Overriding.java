//overriding
class Animal {
    void eat()
    {
        System.out.println("Animal is eating...");

    }
    
}

class Dog extends Animal{
    void eat()
    {
        System.out.println("Dog is eating...");
        //super.eat();
    }
}

public class Overriding{
    public static void main(String[] args)
    {
        Animal a=new Animal();
        a.eat();
    }
}

