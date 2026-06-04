class Parent {
    int a,b;
    void getValue()
{
    a=3;
    b=5;
}
    
}
class Child extends Parent
{
    void display()
    {
        int c;
        c= a+b;
        System.out.println("The sum is "+c);
    }

}

    class SingleInt
    {
        public static void main(String[] args)
        {
            Child cd = new Child();
            cd.getValue();
            cd.display();
        }
    }


