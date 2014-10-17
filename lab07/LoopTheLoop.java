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
        int counter2 = 0;
        int counter3=0;// declare counter2 and store value
        
        while ( nStars > 15 || nStars < 1 ) { // when nStars is outside of range prompt user to enter input
            System.out.print("Enter an int between 1 and 15: ");
                while(!myScanner.hasNextInt()){
    	            myScanner.next(); //get rid of the junk entered by user
    	            System.out.print("You did not enter an int; try again- ");
                }
                nStars = myScanner.nextInt();
        }

            while (counter <= nStars) {
                System.out.print("*");
                counter++;
            }
            
            while (counter2 < nStars) {
                System.out.print("\n");
                counter2++;
                while (counter3 < counter2) {
                System.out.print("*");
                counter3++;
                }
                counter3 = 0;
            }
            System.out.print("\n");
         // end of outside while
    } // end of method
} // end of class