import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        double p,t,r,si;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Principal: ");
p=sc.nextDouble();
System.out.println("Enter time: ");
t=sc.nextDouble();
System.out.println("Enter rate: ");
r=sc.nextDouble();
si=(p*t*r)/100; 
System.out.println("Simple Interest is "+si);
    }
}
