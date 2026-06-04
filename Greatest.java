//write in java to find the greatest among two numbers

import java.util.*;
public class Greatest
{
    public static void main(String []args)
    {
        int a,b;
        Scanner ro=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        a=ro.nextInt();
        b=ro.nextInt();
        
        if(a>b)
            System.out.println("greatest is" +a);

        if(b>a)
            System.out.println("greatest is "+b);

            

            
        }

    }