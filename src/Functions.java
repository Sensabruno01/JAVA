import java.util.*;
import java.util.Scanner;
public class Functions {

    //To print name
//    public static void printMyName(String name)
//    {
//
//        System.out.println(name);
//        return;
//    }
//
//    public static void main(String[] args)
//    {
//
//           Scanner input=new Scanner(System.in);
//           String name=input.next();
//
//           printMyName(name);
//    }

    //Make a function to add two numbers
    public static int addTwoNumbers(int a,int b)
    {
         int sum;
         sum=a+b;
         return sum;
    }


     public static void main(String[] args)
     {
         Scanner input=new  Scanner(System.in);
         int a = input.nextInt();
         int b = input.nextInt();

         int sum = addTwoNumbers(a,b);
         System.out.println(sum);
     }
}