import java.util.*;
public class Recursion {

//    public static void printNumb(int n) {

    //Print numbers from 5 to 1
//        if(n==0)----->BASE CASE
//        {
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//
//    }
//     public static void main(String args[])
//    {
//
//        int n = 5;
//        printNumb(n);//5
//    }

    //Print numbers from 1 to 5
//    public static void printNumb(int n){
//          if(n == 6){
//              return;
//          }
//        System.out.println(n);
//          printNumb(n+1);
//    }
//        public static void main(String args[]) {
//            int n = 1;
//            printNumb(n);
//        }
//        }
    //Print sum of first n natural numbers
//      public static void SumOfNumbers(int i,int n,int sum) {
//          if(i==n)
//          {
//              sum=sum+n;
//              System.out.println(sum);
//              return;
//          }
//          sum=i+sum;
//          SumOfNumbers(i+1,n,sum);
//      }
//      public static void main(String args[])
//      {
//          SumOfNumbers(1,5,0);
//      }
    //Calculate factorial of n
//    public static int calcFactorial(int n){
//       if(n==1 || n == 0){
//           return 1;
//       }
//       int fact_nm1= calcFactorial(n-1);
//       int fact_n = n * fact_nm1;
//       return fact_n;
//
//    }
//    public static void main(String args[]){
//
//      int n =5;
//      int ans =calcFactorial(n);
//        System.out.println(ans);
//    }

    //Print fibonacci series
//    public static void printFibonacci(int a,int b,int n){
//        if(n==0){
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        printFibonacci(b,c,n-1);
//    }
//    public static void main(String args[]){
//        int a =0;
//        int b =1;
//        System.out.println(a);
//        System.out.println(b);
//        int n =7;
//        printFibonacci(a,b,n-2);
//    }
      //To calculate power(Stack height =n)
//     public static int calcPower(int x,int n){
//         if(n==0){
//             return 1;//base case 1
//         }
//         if (x==0){
//             return 0;//base case 2
//         }
//         int xPownm1 = calcPower(x,n-1);//kaam
//         int xPown = x * xPownm1;
//         return xPown;
//     }
//    public static void main(String args[]){
//
//         int x =2;
//         int n = 5;
//         int ans = calcPower(x,n);
//        System.out.println(ans);
//    }
    //Calculate power(stack height = logn)
    public static int calcPower(int x,int n){
        if(n==0){//base case 1
            return 1;
        }
        if(x==0){
            return 0;//base case 2
        }
        //if n is even
        if(n%2==0){
          return  calcPower(x,x/2) * calcPower(x,n/2);
        }
        else{//n is odd
           return calcPower(x,n/2)*calcPower(x, n/2) * x;
        }
    }
    public static void main(String args[])
    {
         int x =2;
         int n = 5;
         int ans = calcPower(x,n);
         System.out.println(ans);
    }
}


