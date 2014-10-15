import java.util.Scanner;
/*
Austin Price
CSE 2
hw 06
10/14/14

Root.java program
0,1+x --> [0, (1+x/2)^2] --> [((1+x/2)^2)/2, (1+x/2)^2] --> etc.
Write a Java program that forces the user to enter a double that is greater than 0, 
uses the above algorithm to compute the square root of the number, and then prints it out. 
Use 0.0000001 as the “tolerance” for stopping the loop that computes the square root. 
*/
public class Root { // define class
    public static void main(String [] args) { // define method
        Scanner myScanner = new Scanner (System.in); // constructing
        
    double rootInput = 0; // declare and hold variable
    
    while (rootInput <= 0) { // while input <=0
        System.out.print("Enter a double > 0: ");// ask user for input
        if (myScanner.hasNextDouble()) { // if double
            rootInput = myScanner.nextDouble(); // allow input
        } // end eif
        else { // if not double
            System.out.println("You did not enter a double"); // print invalid entry
            return; // leave program
        } // end else
    } // end input while
        double high = rootInput+1; // declare max range
        double low = 0; // min range
        double middle; // declare middle
    while ( (high-low)>= (.0000001*(high)) ) { // while this is true
       middle = (high+low)/2; // compute middle
      

    if ( middle*middle > (rootInput)) { // if true
        high = middle; // set middle to high range
    }
    else { // if not
        low = middle; // set middle to min range
    } // end else
    } // end while for sqrt
    double sqrt = (low+high)/2; // compute sqrt and declare 
System.out.println("Square Root of "+rootInput+": "+sqrt); // print square root
    } // end method
} // end class