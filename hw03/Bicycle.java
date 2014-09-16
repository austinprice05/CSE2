import java.util.Scanner; // import scanner (allows user to input data)
/*
    Austin Price
    CSE 2
    HW 3
    9/15/14
    
    Bicycle Java Program
    Goal is to find average mph
    
    first compile program
        javac Bicylce.java
    run program
        java Bicycle
*/
// define class
public class Bicycle {
// define method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of seconds: "); //Enter time (s)
        int nSeconds = myScanner.nextInt(); //allows user to input time on bike
        
        System.out.print("Enter the number of counts: "); //Enter number of counts
        int nCounts = myScanner.nextInt(); //allows user to input number counts on cyclometer
        
        double wheelDiameter = 27; // diameter of wheel
    
        double PI=3.14159, //number use for PI
            feetPerMile=5280, // conversion from mile to feet
            inchesPerFoot=12, // conversion for inches per foot
            nMiles, nMinutes, averageMPH, nHours;// conversion from feet to inches
        nMiles  = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; // find number of miles
        
        nMinutes = nSeconds/60; // convert seconds to minutes
        
        nHours = nMinutes/60; // convert minutes to hours
        averageMPH = nMiles/nHours; // find average MPH
        
        System.out.printf("The distance was "+"%.2f", nMiles); // print miles to two decimal places
        System.out.println(" miles and took "+ nMinutes+
            " mintues."); // print statement of number of miles and minutes user put in
        System.out.printf("The average mph was "+ "%.2f \n", averageMPH); // find speed of user

    } // end method
} // end class