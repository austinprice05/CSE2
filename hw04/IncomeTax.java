import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 4
    9/23/14
    
    Income Tax Java Program
    Goal is to calculate Income Tax
    
    first compile program
        javac IncomeTax.java
    run program
        java IncomeTax
*/
public class IncomeTax { // define class
    public static void main(String[] args) { // define method
         Scanner myScanner = new Scanner (System.in); // constructing
        int taxRate = 0; // declare taxRate as integer
        
        System.out.print("Enter an int giving the number of thousands- "); // print input statement
            if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
                taxRate = myScanner.nextInt(); // if true assign input integer to variable
            } // end if
            else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // end program return to start
            } // end else
            
            double twentyRate = .05, // declaring income tax rate variables (tr >= 0)
                fortyRate = .07, // tr >= 20
                seventyRate = .12, // tr >= 40
                highRate = .14, // tr >= 78
                incomeTax, incomeThousands; // calculated variables
                
                incomeThousands = taxRate*1000; // converted user input to thousands
        
            if ( taxRate >= 78 ) { // if over equal to 78
                incomeTax = incomeThousands*highRate; // calculating income tax
                System.out.println("The tax rate on $"+taxRate+",000 is 14% and the tax is $"+incomeTax ); // print out income tax statement
            } // end if
            else if ( taxRate >= 40 ) { // if over or equal to 40
                incomeTax = incomeThousands*seventyRate; // calculating income tax
                System.out.println("The tax rate on $"+taxRate+",000 is 12% and the tax is $"+incomeTax ); // print out income tax statement
            } // end else if
            else if ( taxRate >= 20 ) { // if over or equal to 20
                incomeTax = incomeThousands*fortyRate; // calculating income tax
                System.out.println("The tax rate on $"+taxRate+",000 is 7% and the tax is $"+incomeTax ); // print out income tax statement
            } // end else if
            else if ( taxRate >= 0 ) { // if over or equal to 0
                incomeTax = incomeThousands*twentyRate; // calculating income tax
                System.out.println("The tax rate on $"+taxRate+",000 is 5% and the tax is $"+incomeTax ); // print out income tax statement
            } // end else if
            else { // or
                System.out.println("You did not enter a positive int"); // print user gave invalid input for being less than 0
                return; // return to start
            } // end else
    } // end method
        
    } // end class