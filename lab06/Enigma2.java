/*
    Austin Price
    CSE 2
    lab 06
    10/09/14
    
    Enigma2 Java Program
*/
import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    try{ // program tries out switch statement
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    } 
     System.out.println(out);
    } // end try
    catch (ArithmeticException ae){ // if there is a arithmetic exception or problematic equation
      System.out.println(ae.getMessage()); // print "/ by zero"
    } // end catch statement
   // nothing after catch statemnt b/c don't want program to still run when there is a problem
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
    You would use the ArithmeticException because 40/0 is undefined
    put try statement around switch statement, then add a catch statement.
    Put (ArithmeticException ae) next to catch statement then curly bracket
    Then input a print statement with a get message which prints out the problem with a simple message
 * 
 * 
 * 
 * 
 * 
 */