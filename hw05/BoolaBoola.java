import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 5
    9/30/14
    
    Burger King Java Program
    Goal is to ask the user if a random statement is true or false and tell user
        if correct or incorrect
    
    first compile program
        javac BoolaBoola.java
    run program
        java BoolaBoola
*/
public class BoolaBoola { // define class
    public static void main(String[] args) { // define method
        Scanner myScanner = new Scanner (System.in); // constructing
   String choice1;
   int var1 = (int) (Math.random() * 31); // 32 random integers to use for the possible 32 cases
   
 switch(var1){
   case 1: // if var1 = 1
    System.out.print("Does true && true && true have the value of true(t/T) or false(f/F)? "); // t
          choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 2: // if var1 = 2
    System.out.print("Does true && false && true have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 3: // if var1 = 3
    System.out.print("Does true && true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 4: // if var1 = 4
    System.out.print("Does true && false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 5: // if var1 = 5
    System.out.print("Does false && false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 6: // if var1 = 6
    System.out.print("Does false && true && true have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 7: // if var1 = 7
    System.out.print("Does false && false && true have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 8: // if var1 = 8
    System.out.print("Does false && true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 9: // if var1 = 9
    System.out.print("Does true || true || true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 10: // if var1 = 10
    System.out.print("Does true || false || true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 11: // if var1 = 11
    System.out.print("Does true || true || false have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 12: // if var1 = 12 
    System.out.print("Does true || false || false have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 13: // if var1 = 13 
    System.out.print("Does false || false || false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 14: // if var1 = 14
    System.out.print("Does false || true || true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 15: // if var1 = 15
    System.out.print("Does false || false || true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 16: // if var1 = 16
    System.out.print("Does false || true || false have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 17: // if var1 = 17
    System.out.print("Does true || true && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 18: // if var1 = 18
    System.out.print("Does true || false && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 19: // if var1 = 19
    System.out.print("Does true || true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 20: // if var1 = 20
    System.out.print("Does true || false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 21: // if var1 = 21
    System.out.print("Does false || false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 22: // if var1 = 22
    System.out.print("Does false || true && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 23: // if var1 = 23
    System.out.print("Does false || false && true have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 24: // if var1 = 24
    System.out.print("Does false || true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 25: // if var1 = 25
    System.out.print("Does true || true && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 26: // if var1 = 26
    System.out.print("Does true || false && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 27: // if var1 = 27
    System.out.print("Does true || true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 28: // if var1 = 28
    System.out.print("Does true || false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 29: // if var1 = 29
    System.out.print("Does false || false && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 30: // if var1 = 30
    System.out.print("Does false || true && true have the value of true(t/T) or false(f/F)? "); // t
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "t": // in the case of t 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not t
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   case 31: // if var1 = 31
    System.out.print("Does false || false && true have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
   default: // if var1 = 0
    System.out.print("Does false || true && false have the value of true(t/T) or false(f/F)? "); // f
        choice1 = myScanner.next().toLowerCase(); // input ans
            switch (choice1) { // begin switch statement for user input
                    case "f": // in the case of f 
                        System.out.println("Correct"); // print correct
                        break; // stop program
                    default: // if not f
                        System.out.println("Wrong; Try Again"); // tell user they are incorrect
                        break; // stop program
            } // end switch for choice1
    break; // stop program
 } // end of switch for var1
} // end method
} // end class
