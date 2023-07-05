import java.util.Scanner;
import java.util.*;

public class Strings {

    public static void main(String[] args){
        //String declaraction
        //String fname="Tony Stark";

        //Taking string input from user

        Scanner input = new Scanner(System.in);
//        String name=input.next();
//        String name = input.nextLine(); //to take more than one word as string input
//        System.out.println("Your name is "+ name);

        //Concatenation

//        String fname="Tony";
//        String lname="Stark";
//        String fullname=fname + " "+ lname ;
//        System.out.println(fullname);
//        System.out.println(fullname.length());
//Going through each character of the string
//        for(int i = 0;i<fullname.length();i++){
//
//            System.out.println(fullname.charAt(i));
//        }

        //To compare two strings-compare function()
//          if(fname.compareTo(lname)==0){
//              System.out.println("fname and lname are equal");
//          }
//          else if(fname.compareTo(lname)>0){
//              System.out.println("fname is bigger than lname");
//          }
//          else {
//              System.out.println("lname is bigger");
//          }

        //To compare

//        if(new String ("Tony")==new String  ("Tony"))
//        {
//            System.out.println("Equal");
//        }                                  //Here by using ==,its showing wrong-reason will learn in string builder
//        else
//        {
//            System.out.println("Not equal");
//        }


        //sub strings
//        String sentence = "My name is Tony";
//        String name= sentence.substring(11,sentence.length());
//        String name = sentence.substring(3);
//        System.out.println(name);
        //Strings are immutable
        //StringBuilder

        StringBuilder sb = new StringBuilder("Sensa");
        System.out.println(sb);

        //To take character at index 0
//        System.out.println(sb.charAt(0));

        //Set char at index function
//        sb.setCharAt(0,'P');
//        System.out.println(sb);

//        To insert a character 'P'.---Sensa becomes PSensa

//        sb.insert(0,'P');
//        System.out.println(sb);

        //To delete a char or susbtring.

//        sb.delete(1,3);
//        System.out.println(sb);

        //append function

        sb.append(" B"); // sb = sb + "B";
        sb.append("r");
        sb.append("u");
        sb.append("n");
        sb.append("o");
        System.out.println(sb);

        //to print length
        System.out.println(sb.length());

    }
}
