import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 4
    9/23/14
    
    TimePadding Java Program
    Goal is to find the year course was taken and which semester
    
    first compile program
        javac TimePadding.java
    run program
        java TimePadding
*/
public class TimePadding { // define class
    public static void main(String[] args) { // define method
         Scanner myScanner = new Scanner (System.in); // constructing
         
         int inputSeconds = 0; // declaring inputSeconds
         
         System.out.print("Enter the time in seconds: ");
            if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
               inputSeconds = myScanner.nextInt(); // if true assign input integer to variable
            } // end if
            else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // leave program
            } // end else
      if ( inputSeconds >= 0 ) { // if input is a positive int      
        int hourDigit = inputSeconds/3600; // converts seconds to hours...since int only gives digits to left of decimal
        int minuteDigit1 = inputSeconds - (hourDigit*3600); // computes amount of seconds left
            minuteDigit1 = minuteDigit1/60; // computes remainding seconds into minutes
            minuteDigit1 = minuteDigit1/10; // gives tens place for the minutes
        int minuteDigit2 = inputSeconds - (hourDigit*3600) - (minuteDigit1*600); // computes remainding seconds
            minuteDigit2 = minuteDigit2/60; // computes remainding seconds into minutes...this gives ones place
        int secondsDigit1 = inputSeconds - (hourDigit*3600) - (minuteDigit1*600) - (minuteDigit2*60); // computes remainding seconds
            secondsDigit1 = secondsDigit1/10; // gives tens place for seconds
        int secondsDigit2 = inputSeconds - (hourDigit*3600) - (minuteDigit1*600) - (minuteDigit2*60) - (secondsDigit1*10); // computes remaining seconds....which is the ones place for seconds
        
        System.out.println("The time is "+hourDigit+":"+minuteDigit1+minuteDigit2+":"+secondsDigit1+secondsDigit2+"."); // print time statement w/ padded zeros if neccesary
      }
      else {
          System.out.println("You did not enter a positive int");
          return; //leave program
      }
    } // end method
} // end class
        