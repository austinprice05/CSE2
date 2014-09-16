import java.util.Scanner; // import scanner (allows user to input data)
/*
    Austin Price
    CSE 2
    HW 3
    9/15/14
    
    Four Digits Java Program
    Goal is to find average mph
    
    first compile program
        javac FourDigits.java
    run program
        java FourDigits
*/
// define class
public class FourDigits {
// define method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- "); //Enter double statement
        double x = myScanner.nextDouble(); //allows user to input double
        int decimalDigits4 = (int)(x*10000); //multiply by 10000 and turn input(x) into an integer
            decimalDigits4 = decimalDigits4 % 10; // gives fourth digit to right of decimal
            
        int decimalDigits3 = (int)(x*10000); // multiply by 10000 and turn input(x) into an intege
            decimalDigits3 = decimalDigits3 % 100; // gives 3rd and 4th digit
            decimalDigits3 = (int) (decimalDigits3/10); // gives only 3rd digit
            
        int decimalDigits2 = (int)(x*10000); //multiply by 10000 and turn input(x) into an integer
            decimalDigits2 = decimalDigits2 % 1000; // gives 2nd 3rd and 4th digit
            decimalDigits2 = (int) (decimalDigits2/100); // gives ony 2nd digit
            
        int decimalDigits = (int)(x*10000); //multiply by 10000 and turn input(x) into an integer
            decimalDigits = (int) decimalDigits % 10000; // gives 1st 2nd 3rd and 4th digit
            decimalDigits = (int) (decimalDigits/1000); // gives only 1st digit
            
       
        System.out.println("The four digits are "+ decimalDigits+decimalDigits2+decimalDigits3+decimalDigits4); // print last four digits
    } // end method
} // end class
        