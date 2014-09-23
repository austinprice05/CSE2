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
public class Month { // define class
    public static void main(String[] args) { // define method
         Scanner myScanner = new Scanner (System.in); // constructing
         int monthNumber = 0, // declaring monthNumber
         yearNumber = 0, // declaring yearNumber
         yearRemainder; // calculated variable
         
         
         System.out.print("Enter an int giving the number of the month (1-12): ");
            if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
               monthNumber = myScanner.nextInt(); // if true assign input integer to variable
            } // end if
            else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // end program return to start
            } // end else
        if ( monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12 ) { // if int is one these
            System.out.println("The month has 31 days"); // print month has 31 days
        } // end if
        else if ( monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11 ) { // if int is one of these
            System.out.println("The month has 30 days"); // print month is 30 days
        } // end else if
        else if ( monthNumber == 2 ) { // if int == 2
            System.out.print("Enter an int giving the year "); // ask for the year
            if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
                yearNumber = myScanner.nextInt(); // if true assign input integer to variable
            } // end if
            else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // end program return to start
            } // end else
                yearRemainder = (yearNumber%4); // calculating if year has remainder when divided by 4
                    if ( yearRemainder == 0 ) { // if remainder == 0
                        System.out.println("The month has 29 days"); // print month has 29 days
                    } // end if
                    else { // if != 0 
                        System.out.println("The month has 28 days"); // print month has 28 days
                    } // end else
        } // end else if
        else { // if not between 1-12
            System.out.println("You did not enter an int between 1 and 12"); // print the user statement is invalid
            return;
        } // end else
    } // end method
} // end class