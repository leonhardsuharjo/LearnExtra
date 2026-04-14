package com.example.gradebook; 
import java.util.Scanner;

/* prev draft
public class App {
    public static String getGreeting() {
        return "hello word";
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        System.out.println(App.getGreeting()); 
        System.out.println("insert a number"); 
        int i=s.nextInt(); 
        System.out.println("the number is" +i); 
        if (i<0) System.out.println("negative"); 
        #
        else if >0 positive 
        if odd 
        else even 
        #
    }
}
*/

public class App {
    public static void main (String[] args){
        GradeBook gb; 
        Scanner s=new Scanner(System.in);
        System.out.println("insert student last name and id");
        gb=new GradeBook(s.next(), s.next(), s.next());
         
    }
}

