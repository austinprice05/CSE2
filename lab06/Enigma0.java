/*
    Austin Price
    CSE 2
    lab 06
    10/09/14
    
    Enigma0 Java Program
     *   Explain the error(s) that occurred here, and then fix them
Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner; // import scanner
public class Enigma0{ // define class
  public static void main(String [] args) { // define method
    Scanner scan=new Scanner(System.in); // construct scanner
    int n = 0; // declare n as int and store value
    System.out.print("Enter an int- "); // ask user to enter int
    if(scan.hasNextInt()){ // if user enters int
      n=scan.nextInt(); // store user input in n
      System.out.println("You entered "+n); // print out value of n
    } // end if
    else { // if not int
        System.out.println("You did not enter a int"); // tell user input invalid
        return; // leave program
    } // end else
    
    int sum = 16+n; // declare sum and assign equation to find sum
    System.out.println("sum is "+ sum); // print sum
      
    System.out.println("Again, you entered "+n); // reprint user input (value of n)
  } // end method
} // end class

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 line 27 change 'to repeat' to 'Again'
 line 22 declared variable n for second time in the program - omit n in that line
         omit everything in that line. Trying to find a sum where when 9 is entered 25 is the sum
         so the equation is 16+n.
 line 23 delete switch statement - it is not needed in this situation because we are trying to find a sum.
 line 19 change print statement to 'You did not enter an int' and kill program
 omit all n declarations and store n value before input (line 13)
 */
