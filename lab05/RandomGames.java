import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 4
    9/23/14
    
    Income Tax Java Program
    Goal is to find how many days are in each Month
    
    first compile program
        javac Month.java
    run program
        java Month
*/
public class RandomGames { // define class
    public static void main(String[] args) { // define method
         Scanner myScanner = new Scanner (System.in); // constructing
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- "); // ask user whichh game they want to play
        String letter = myScanner.next().toLowerCase(); // ask user input and make user input lowercase
        int letterLength = letter.length(); // find length of string
    if (letterLength > 1) { // if length > 1
        System.out.println("Single Character Expected"); // print string too long
        return; // leave program
    } // end if
    
    switch (letter) { // begin switch
        case "r": // for case r
            System.out.println("Roulette has not been implemented yet"); // print statement
            break; // stop switch
        case "c": // for case c
            int dice1 = 1+ (int) (Math.random() * 6); // random number from 1 to 6
            int dice2 = 1+ (int) (Math.random() * 6); // random number from 1 to 6
            System.out.println("Craps: "+dice1+" + "+dice2+" = "+(dice1+dice2)); // print what was rolled and what it equals
            break; // stop switch
        case "p": // for case p
            System.out.println("Pick a card has not been implemented"); // print statement
            break; // stop switch
        default: // if not r c or p
            System.out.println("'"+letter+"' is not one of 'R', 'r', 'C', 'c', 'P' or 'p'"); // tell user invalid input
            break; // stop switch
    } // end switch
        
        
        
        
    }
}