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
        Scanner myScanner = new Scanner (System.in);
        
        double costBigMac, totalCostF,
            costPerBigMac = 2.22,
            costFries = 2.15;
        int nBigMacs = 0;
        String orderFries;
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
        costBigMac = nBigMacs * costPerBigMac;
        System.out.printf("You ordered "+nBigMacs+" Big Macs or a cost of "+nBigMacs+"x2.22 = "+ "%.2f \n", costBigMac);
        System.out.print("Do you want an order of fries (Y/y/N/n) ");
            orderFries = myScanner.next();
            int orderFriesLength = orderFries.length();
            
            if (orderFriesLength > 1) {
                System.out.println("Single character expected");
                return;
            }
            totalCostF = costBigMac + costFries;
            switch ( orderFries ) {
                case "Y":
                case "y":
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.printf("The total cost of the meal is "+ "%.2f \n", totalCostF);
                    break;
                case "N":
                case "n":
                    System.out.printf("The total cost of the meal is "+ "%.2f \n", costBigMac);
                    break;
                default:
                    System.out.println("You did not enter one of 'y', 'Y', 'n', or 'N'");
                    break;
            }
        
    } // end method
} // end class