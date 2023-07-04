import java.util.Scanner;
import java.util.*;

public class Strings {

    public static void main(String[] args){
        //String declaraction
        //String fname="Tony Stark";

        //Taking string input from user

        Scanner input = new Scanner(System.in);
//        String name=input.next();
        String name = input.nextLine(); //to take more than one word as string input
        System.out.println("Your name is "+ name);


    }
}
