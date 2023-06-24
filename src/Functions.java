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
//    public static int addTwoNumbers(int a,int b)
//    {
//         int sum;
//         sum=a+b;
//         return sum;
//    }
//
//
//     public static void main(String[] args)
//     {
//         Scanner input=new  Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//
//         int sum = addTwoNumbers(a,b);
//         System.out.println(sum);
//     }

    //Make a function to multiply two numbers and return the product.

//    public static double productOfTwoNumbers(double a,double b)
//    {
//        double product;
//        product=a*b;
//        return product;
//
//    }
//
//    public static  void main(String[] args)
//    {
//      Scanner input=new Scanner(System.in);
//      int a=input.nextInt();
//      int b=input.nextInt();
//
//      double product =productOfTwoNumbers(a,b);
//      System.out.println("Product of the two numbers are:"+product);
//
//    }
    //Find the factorial of number-0!=1,no factorial of negative numbers
    //1!=1
    //2!=2*1
    //3!=3*2*1=
    //4!=4*3*2*1=24   ----------->loop
    //5!=120

//    public static void printFactorial(int n)
//    {
//        if(n>=0)
//        {
//            //loop
//            int factorial = 1;
//            for (int i = n; i >= 1; i--)
//            {
//                factorial = factorial * i;
//            }
//            System.out.println(factorial);
//            return;
//        }
//        else
//        {
//            System.out.println("No factorial for negative number");
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        printFactorial(n);
//    }

// Write a function that takes in the radius as input and returns the circumference of a circle.

//   public static double circumference(double r)
//    {
//     double circumference= 2 * 3.14 * r;
//     return circumference;
//    }
//
//   public static  void main (String args[])
//   {
//    Scanner input=new Scanner(System.in);
//    System.out.println("Enter the radius:");
//    double r = input.nextDouble();
//
//   double result=circumference(r);
//   System.out.println("Circumference of circle is "+result);
//
//   }
//Write a function to print the sum of all odd numbers from 1 to n.

    public static int sumOfOddNumbers(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if(i%2 == 1)
            {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int result = sumOfOddNumbers(n);
        System.out.println("The sum of odd numbers till n is " + result);

    }
}