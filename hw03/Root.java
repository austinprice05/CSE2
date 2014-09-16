import java.util.Scanner; // import Scanner
/*
    Austin Price
    CSE 2
    HW 3
    9/15/14
    Program 2
    Root Java Program
    Goal is to find cube root
    
    first compile program
        javac Root.java
    run program
        java Root
*/
// define class
public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter a Double, and I print its cube root- "); //Enter integer
        double x = myScanner.nextInt(); // allows user to input a double
        double guess, original; // declaring variables
        guess = x/3; // guess square root
        guess = (2*guess*guess*guess+x)/(3*guess*guess); // guess cube
        guess = (2*guess*guess*guess+x)/(3*guess*guess); // increase estimate accuracy
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //increase estimate accuracy
        guess = (2*guess*guess*guess+x)/(3*guess*guess); // increase estimate accuracy
        guess = (2*guess*guess*guess+x)/(3*guess*guess); // increase estimate accuracy
        original = guess*guess*guess; // give back user input
        System.out.println("The cube root is "+ guess +":"+guess+"*"+guess+"*"+
            guess+"="+original); // print out cubic root & equation
    }// end method
}// end class