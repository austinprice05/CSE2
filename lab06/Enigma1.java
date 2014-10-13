/*
    Austin Price
    CSE 2
    lab 06
    10/09/14
    
    Enigma1 Java Program

The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 Doesn't work when the user does not input an int that is 7 41 33 14 60.
 So if the user were to input 'x', '-1', '6', '100', etc. the program would not perform.
 */

import java.util.Scanner; // import scanner
public class Enigma1    { // define class
  public static void main(String []args){ // define method
    Scanner scan = new Scanner(System.in); // construct scanner
    double percentRemaining, // declare percentRemaining and x as doubles 
           x = 0; // store value for x
    System.out.print("Enter a value for the percent (0, 1,...99)- "); // tell user to input statement with in [0,99]
    if ( scan.hasNextDouble() ) { // if a double
        x= scan.nextDouble(); // store user input as x
    } // end if
    else { // if not a double
        System.out.println("You did not enter a double"); // tell user they did not enter a double
        return; // leave program
    } // end else
    if ( x>0 && x<99 ) { // if user input valid
        System.out.println("You entered "+x+"%"); // tell user the percentage inputed
        percentRemaining = (1-x/100); // compute percent remaining out of 1
        System.out.println("Proprtion (out of 1) "+ percentRemaining); // print percent remaining out of 1
    } // end if
    else { // if not in range
        System.out.println("You did not enter an int inside the range [0,99]"); // tell user to input within [0,99]
        return; // leave program
    } // end else
   //print out the proportion remaining for select percentages
  } // end method

} // end class

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
    There are no compiling errors but there are runtime errors
    any input that is not an int and is not 7 14 41 33 or 60 would not print out the remaining percentage out of one (which is the whole
    point of the program) b/c there are only if statements for 7, 14, 41, 33, and 60.
   don't declare and store n value before asking user for input - means the programmer is unable to check the user input for invalid entries
   ommit line 15-25 dont need if statement (would mean you an if for every number from 0-99)
   line 13 delete () - and make statement read 'x = scan.nextDouble();' makes for easier to read
   add line above 'double percent;' - makes it easier to read and constructs the new scanner makes for simpler program
   add if statement to check if user inputs a double
 * 
 * 
 * 
 */
