import java.util.*;

public class Advanced_Patterns {

    public static  void main(String args[]){

        //Print butterfly pattern
//
//        int n = 4;
//        //upper half
//        for(int i=1; i<=n; i++)
//        {
//            //first part
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            //Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //lower half
//
//        for(int i=n; i>=1; i--)
//        {
//            //first part
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            //Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



// Print the pattern-solid rhombus

//        int n =5;
//
//        for(int i=1;i<=n;i++){
//            //Printing space
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //Printing star
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//

// Print the pattern-number pyramid
//          int n=5;
//        for(int i=1;i<=n;i++)
//        {
//            //spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//
//            //numbers-->print row number ,row number times
//            for(int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//
//        }


        //Print the pattern-palindromic pattern

//         1
//        212
//       32123
//      4321234
//     543212345


        int n =5;

        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //1st half
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            //2nd half
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }


    }

}
