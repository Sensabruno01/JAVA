import java.util.*;
import java.util.Scanner;

public class Loops_Practise {

    public static void main(String args[]) {
//Print numbers from 1 to n
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = input.nextInt();
//
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("Loop exit");


//Code to write sum of first ten natural numbers
//      int sum=0;
//      for(int i=1;i<=10;i++)
//      {
//          sum=sum+i;
//
//      }
//        System.out.println(sum);

// Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.


//        Scanner input=new Scanner(System.in);
//        int num=input.nextInt();
//
//        if(num>0){
//
//            int n =1;
//            for(int i=1;i<=10;i++)
//            {
//                n=num*i;
//                System.out.println(num + " " + "*" + " "+ i + " " + " " + "="+" "+ n);
//            }
//
//        }
//        else if(num==0){
//            System.out.println("Anything multiplied by 0 is 0");
//        }
//        else{
//            System.out.println("Enter a positive integer");
//        }
//
// Write a program to find the factorial value of any number entered through the keyboard
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the number:");
//        int num = input.nextInt();
//
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact = fact * i;
//        }
//        System.out.println("The factorial of" + " "+ num + " is "+fact);

//        Two numbers are entered through the keyboard.
//        Write a program to find the value of one number raised to the power of another.
//        (Do not use Java built-in method)

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num= input.nextInt();
//        System.out.println("Enter the power:");
//        int pow= input.nextInt();
//        int result=1;
//        for(int i=1;i<=pow;i++)
//        {
//            result=result*num;
//        }
//        System.out.println("The result is "+result);

        //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int number= input.nextInt();
        int reverse=0;
        //using for loop

//        for(int i=number;i>0;i/=10)
//        {
//           int remainder = i%10;
//           reverse = reverse * 10 +remainder;
//
//        }
//        System.out.println("The reverse of the "+number+" is "+reverse);

        //using while loop

//        while (number>0)
//        {
//            int remainder=number%10;
//            reverse=reverse*10+remainder;
//            number=number/10;
//        }
//        System.out.println(reverse);






   }
}


