import java.util.Scanner; //importing Scanner class
/*
    Austin Price
    CSE 2
    lab 03
    9/9/14
    
    Big Mac Java Program
    Goal is to calculate BigMac cost in multiple states
    
    first compile program
        javac BigMac.java
    run program
        java BigMac
*/
// define class
public class BigMac {
    //main method
    public static void main(String[] args) {
        Scanner myScanner; // declare instance of the Scanner object
        myScanner = new Scanner( System.in ); // constructing 
        //an instance of the Scanner class (calling Scanner constructor)
        
        System.out.print("Enter the number of Big Macs (an integer > 0): "); //Enter number of big macs
        int nBigMacs = myScanner.nextInt(); //allows user to input number of Big Macs
        
        System.out.print("Enter the cost per Big Mac as"+
            " a double (in the form xx.xx): "); // cost of Big Mac print line
        double bigMac$ = myScanner.nextDouble(); //allows input of BigMac cost to nearest penny hence the double
        
        System.out.print("Enter the percent tax as a whole number (xx): "); //tax percent print line
        double taxRate = myScanner.nextDouble(); // user input of tax percent
        taxRate/=100; //enter percent but want the proportion (.07 instead of 7%)
        
        double cost$;
        int dollars, // whole dollar amount of cost
                dimes, pennies; // for storing digits
                                // to the right of the decimal point
                                // for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        // get the whole amount, dropping decimal fraction
        dollars = (int)cost$;
        // get dimes amount, e.g,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        // where the % (mod) operator returns the remainder
        // after the division:  583%100 -> 83, 27%5 -> 2
        dimes = (int)(cost$*10)%10; //putting in tenths place (.1)
        pennies = (int)(cost$*100)%10;//putting in hundreths place (.01)
        System.out.println("The total cost of " +nBigMacs
            +" BigMacs, at $"+bigMac$+" per bigMac, with a"+
            " sales tax of "+ (int)(taxRate*100) + "%, is $"
            +dollars+'.'+dimes+pennies); // print statement giving out total cost of number of 
                                            // BigMacs for a given price and tax rate
    } //end method
} //end class