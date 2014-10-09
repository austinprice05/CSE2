// The program is going to ask the user to input the number of Big Macs they want
// Then ask if they would like an order of fries with the BigMacs
// The program will tell the user to use certain characters to enter data
// if the user does not enter a valid character then the program will the user
// there is an error and restart the program.
/*
    Austin Price
    CSE 2
    lab 04
    9/18/14
    
    Big Mac Again Java Program
    
    first compile program
        javac BigMacAgain.java
    run program
        java BigMacAgain
*/
import java.util.Scanner; // import scanner

public class BigMacAgain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in); // input scanner into program
        
        double costBigMac, totalCostF, // declare variable that must be computed
            costPerBigMac = 2.22, // declare variable for cost of each big mac
            costFries = 2.15; // declare cost of fries
        int nBigMacs = 0; // declare/assign nBigMacs
        String orderFries; // declare holding variable
        System.out.print("Enter the number of Big Macs (an integer > 0): "); //Enter number of big macs
         if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
                nBigMacs = myScanner.nextInt(); // if true assign input integer to variable
        } // end if
        else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // end program return to start
        } // end else
        if (nBigMacs < 0) { // check if positive
            System.out.println("You did not enter a positive int"); //if not tell user to end program
        } // end if
        costBigMac = nBigMacs * costPerBigMac; // compute cost of big macs
        System.out.printf("You ordered "+nBigMacs+" Big Macs or a cost of "+nBigMacs+"x2.22 = "+ "%.2f \n", costBigMac); // print number of big mac and cost to 2 decimals
        System.out.print("Do you want an order of fries (Y/y/N/n) "); // ask user if they want fries
            orderFries = myScanner.next(); // assign input to orderFries
            int orderFriesLength = orderFries.length(); // find length of string
            
            if (orderFriesLength > 1) { // if string is greater than 1
                System.out.println("Single character expected"); // tell user string is too long
                return; // leave program
            } // end if
            totalCostF = costBigMac + costFries; // compute total cost plus fries
            switch ( orderFries ) { // start switch statement for orderFries
                case "Y": // case Y drop to case y
                case "y": // if the case is y
                    System.out.println("You ordered fries at a cost of $2.15"); // tell user cost of fries they ordered
                    System.out.printf("The total cost of the meal is "+ "%.2f \n", totalCostF); // print cost + fries
                    break; // stop switch
                case "N": // case N drop to case n
                case "n": // if the case is n
                    System.out.printf("The total cost of the meal is "+ "%.2f \n", costBigMac); // print cost without fries
                    break; // stop switch
                default: // if not y or n
                    System.out.println("You did not enter one of 'y', 'Y', 'n', or 'N'"); // tell user invalid input
                    break; // stop switch
            } // end switch
        
    } // end method
} // end class