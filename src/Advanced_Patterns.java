import java.util.*;

public class Advanced_Patterns {

    public static  void main(String args[]){

        //Print butterfly pattern

        int n = 4;
        //upper half
        for(int i=1; i<=n; i++)
        {
            //first part
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n; i>=1; i--)
        {
            //first part
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }






    }

}
