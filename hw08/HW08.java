/*
    Austin Price
    CSE 2
    hw 08
    10/09/14
    
    LoopTheLoop Java Program
    
    first compile program
        javac HW08.java
    run program
        java HW08
*/
import java.util.Scanner; // import scanner 
public class HW08{ // define class
  public static char getInput(Scanner a, String b) { // define method output char
      Scanner scan = new Scanner (System.in); // construct scanner
      String input = ""; // declare/ intialize string
      boolean check = false; // declare check make it false intially
      char userOutput; // declare char for output
      int lengthInput = b.length(); // declare and define length 
      
      while (true) { // infinite loop
          input = scan.next(); // input == userInput
          int length = input.length(); // length from input
            if (length > 1){ // if length>1
                System.out.println("Enter exactly one character; try again- "); // tell user the problem
                continue; // return to infinite loop
            }
          userOutput = input.charAt(0); // assign char
            for (int j=0; j<lengthInput; j++){ // for loop to see char is right
                if (b.charAt(j) == userOutput) { // correct
                    check = true; // check now true
                }
            }
            if (check == true) { // if true
                return userOutput; // return output
            }
            else { // otherwise
                System.out.println("You did not enter a character in the list \"Cc\"; try again- "); // print user invalid
                continue; // return to infinite
            }
      } // end while
  } // end method
  public static char getInput(Scanner a, String b, int maxRun) { // define method
      Scanner scan = new Scanner (System.in); // construct scanner
      String input = "";
      boolean check = false;
      char userOutput;
      int lengthInput = b.length();
      int counter = 0; // declare assign counter
      
      while (true) { // infinite loop
          counter++; // add 1 to counter
          input = scan.next(); // make input userinput
          int length = input.length(); // find length of user input
            if (length > 1){ // if > 1
                System.out.println("Enter exactly one character; try again- "); // tell user too long
                continue; // return to infinite loop
            }
          userOutput = input.charAt(0);// assign value to useroutput
            for (int j=0; j<lengthInput; j++){ // while j < length input
                if (b.charAt(j) == userOutput) { // if char equal to useroutput
                    check = true; // check now true
                }
            }
            if (check == true) { // check true
                return userOutput; // return useroutput
            }
            else { // otherwise
                System.out.println("You did not enter a character in the list \"Y,y,N,n\"; try again- "); // tell user wrong char
                if (counter == maxRun) { // if 5th time
                    userOutput = 32; // char literal for space
                    System.out.println("You failed"+maxRun+"times"); // wrong 5 times
                    return userOutput; // send back space
                }
                continue; // return to infinite loop
            }
      } // end while
      
  } //  end method
  public static char getInput(Scanner a, String b, String c) { // define method
      Scanner scan = new Scanner (System.in); // construct scanner
      String input ="";
      boolean check = false;
      char userOutput;
      int lengthInput = c.length();
      System.out.println(b+" "); // string b 
      System.out.print("Enter one of: "); // tell user to enter a char
      for (int i = 0; i<= lengthInput; i++){ // 
          System.out.print("\'"+i+"\'"+", ");
      }
    while (true) { // infinite loop
          input = scan.next(); 
          int length = input.length();
            if (length > 1){ // length > 1
                System.out.println("Enter exactly one character; try again- "); // tell user too long
                continue; // back to infinite loop
            }
         userOutput = input.charAt(0);
            for (int j=0; j<lengthInput; j++){ // check if equals to char in string
                if (c.charAt(j) == userOutput) {
                    check = true;
                }
            }
            if (check == true) {
                return userOutput;
            }
            else {
                System.out.println("You did not enter an acceptable character "); // tell user unacceptable
                continue; // back to infinte
            }
      } // end while

      
  } // end method
  public static void main(String []arg){ // define method
	char input; // declare variable char
	Scanner scan=new Scanner(System.in); // construct scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // print statement
	input=getInput(scan,"Cc"); // call for input
	System.out.println("You entered '"+input+"'"); // tell user what they entered
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // print statement
	input=getInput(scan,"yYnN",5); //give up after 5 attempts and call for input
	if(input!=' '){ // if not equal to space
   	System.out.println("You entered '"+input+"'"); // print input entered
	} // end if
	input=getInput(scan,"Choose a digit.","0123456789"); // call for input
	System.out.println("You entered '"+input+"'"); // print out input
  }  // end method
} // end class

