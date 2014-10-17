// initialize nStars to some value outside the range [1,15], e.g., -1
// control outside loop by testing whether nStars is outside the range [1,15]
//    inside this loop…(A)
//       prompt user 
//       nested loop (B) conditioned by whether  user has entered an int (!hasNextInt())
//          inside loop (B)
//              use next() to get rid of junk
//              prompt user again
//          exit loop (B) when hasNextInt() returns true
//     exit  loop (A), when an int has been entered and the int is in the range [1,15]
//    now that you have exited with an int between 1 and 15 execute the loop to display
//     the stars
/*
    Austin Price
    CSE 2
    lab 07
    10/09/14
    
    LoopTheLoop Java Program
    
    first compile program
        javac LoopTheLoop.java
    run program
        java LoopTheLoop
*/
import java.util.Scanner; // import scanner

public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in); // input scanner into program
        int nStars = 0; // declare nStars and store value
        int counter = 1; // declare counter and store value
        int counter2 = 0; // declare counter2 and store value
        int counter3=0;// declare counter3 and store value
        
    while (true) { //infinite while loop if user wants to run code forever
        while ( nStars > 15 || nStars < 1 ) { // when nStars is outside of range prompt user to enter input
            System.out.print("Enter an int between 1 and 15: "); // ask user to input number within range
                while(!myScanner.hasNextInt()){ // when input is not an int
    	            myScanner.next(); //get rid of the junk entered by user
    	            System.out.print("You did not enter an int; try again- "); // prompt the user to an input within range again and if user input int not in range remind user to print with in range with original while loop
                } // end while
                nStars = myScanner.nextInt(); // set input value to nStars
        } // end while

            while (counter <= nStars) { // while counter is less than nStars
                System.out.print("*"); // print out a star
                counter++; // add 1 to counter
            } // end while
            
            while (counter2 < nStars) { // while counter 2 is less than nStars
                System.out.print("\n"); // print new line
                counter2++; // add one to counter2
                while (counter3 < counter2) { // while counter3 is less than counter2
                System.out.print("*"); // print a star
                counter3++; // add one to counter3
                }// nested end while
                counter3 = 0;// reset counter3
            } // end while
            System.out.print("\n"); // print new line
            nStars = 0; // reset nStars
            counter = 0; // reset counter lines (62-65)
            counter2 = 0;
            counter3 = 0;
            System.out.print("Enter y or Y to go again: ");
                String goAgain = myScanner.next().toLowerCase();
                if ( !goAgain.equals("y") ) {
                    break;
                }
    } //infinite while loop end
    } // end of method
} // end of class