import java.util.*;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args){

        //defining an array
//        int[] marks = new int[3];
//        int[] marks = {97,98,95};-->another way of defining an array
        //Adding values to the array
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//        System.out.println("The value in index 0 is " + marks[0]);

        //Printing the values of array using a loop
//
//        for(int i =0;i<marks.length;i++){
//
//            System.out.println(marks[i]);
//        }


        //Taking array size from user

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size= input.nextInt();
//        int[] marks = new int[size];
//        //for-loop for input
//        for(int i =0;i<size;i++){
//            marks[i]=input.nextInt();
//        }
//        System.out.println("Enter a number");
//        int num= input.nextInt();
//        //for-loop for output
//        for(int i =0;i<size;i++)
//        {
//            if(marks[i]==num)
//            {
//                System.out.println("The "+ num  + "is index's place is "+ i);
//            }
//
//        }
//Becsaue we did not give the values for this array,each index will have value 0

        //2-D arrays

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the size of columns:");
        int column = input.nextInt();

        int[][] numbers= new int[rows][column];

        //Nested loop for taking input

        for(int i=0;i<rows;i++)
        { //Outer loop
            for(int j=0;j<column;j++)
            { //inner loop for columns
                numbers[i][j] = input.nextInt();
            }
        }

        //Nested loop for printing the output
        for(int i =0;i<rows;i++)
        {
            for(int j = 0;j<column;j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }


}
