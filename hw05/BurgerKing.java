import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 5
    9/29/14
    
    Burger King Java Program
    Goal is to figure out what customer wants to order and details of order
    
    first compile program
        javac BurkerKing.java
    run program
        java BurgerKing
*/
public class BurgerKing { // define class
    public static void main(String[] args) { // define method
        Scanner myScanner = new Scanner (System.in); // constructing
         
        String choice, // store choice
                condiments, // store condiments
                size, // store size
                drink; // store drink
         
        System.out.print("Enter a letter to indicate a choice of \n Burger (B or b) \n Soda (S or s) \n Fries (F or f) - "); // print statement asking question
                choice = myScanner.next().toLowerCase(); // put string to lower case and assign to choice variable
                int choiceLength = choice.length(); // length of string inputed
        
        if ( choiceLength > 1) { // if string length > 1
            System.out.println("Single character expected"); // print single character expected
            return; // leave program
        } // end if
            
        switch (choice) { // begin switch statement for choice
            case "b": // case for burger
                System.out.print("Enter A or a for \"all the fixins\" \n C or c for cheese \n N or n for none of the above - "); // ask for condiments
                        condiments = myScanner.next().toLowerCase(); // input string
                        int condimentsLength = condiments.length(); // gives length of inputed string
                    
                    if (condimentsLength > 1) {
                        System.out.println("Single character expected"); // print single character expected
                        return; // leave program
                    } // end if
                        switch (condiments) { // begin switch statement for condiments
                            case "a": // case for all the fixins
                                System.out.println("You ordered a burger with \"all the fixins\""); // print burger order w/ fixins
                                break; // stop program
                            case "c": // case for cheese
                                System.out.println("You ordered a burger with cheese"); // print burger w/ cheese
                                break; // stop program
                            case "n": // case for nothing
                                System.out.println("You ordered a burger without condiments"); // print burger ordered with out condiments
                                break; // stop program
                            default : // if the input is not the case of the previous 3
                                System.out.println("You did not enter A, a, C, c, N, or n"); // print invalid character inputed
                                return; // leaves program
                        } // end switch for condiments
                break; // stop program
            case "f": // case for fries
                System.out.print("Do you want a large or small order of fries (L,l or S,s) - "); // ask user size of order
                        size = myScanner.next().toLowerCase(); // take user input and convert to lower case
                        int sizeLength = size.length(); // get length of string
        
                    if (sizeLength > 1) { // if length > 1
                        System.out.println("Single character expected"); // print single character expected
                        return; // leave program
                    } // end if
                        switch (size) { // begin switch statement for size
                            case "l": // case for large
                                System.out.println("You ordered large fries"); // print large fries ordered
                                break; // stop program;
                            case "s": // case for small
                                System.out.println("You ordered small fries"); // print small fries ordered
                                break; // stop program
                            default : // if none of the cases above
                                System.out.println("You did not enter L, l, s, or S"); // tell user to enter large or small next time
                                return; // leave program
                        } // end switch statement for size
                break; // stop program
            case "s": // case for soda
                System.out.print("Do you want Pepsi (P, p)\n Coke (C, c) \n Sprite (S,s) \n Mountain Dew (M, m) - "); // ask user for type of soda
                        drink = myScanner.next().toLowerCase(); // take user input and convert to lowercase
                        int drinkLength = drink.length(); // get length of user string
                    
                    if (drinkLength > 1) { // if string greater than 1
                        System.out.println("Single character expected"); // print single character expected
                        return; // leave program
                    } // end if
                        switch (drink) { // begin drink switch statement
                            case "p": // case for pepsi
                                System.out.println("You ordered a Pepsi"); // print pepsi order
                                break; // stop program
                            case "c": // case for coke
                                System.out.println("You ordered a Coke"); // print coke order
                                break; // stop program
                            case "s": // case for sprite
                                System.out.println("You ordered a Sprite"); // print sprite order
                                break; // stop program
                            case "m": // case for mountain dew
                                System.out.println("You ordered a Mountain Dew"); // print mountain dew order
                                break; // stop program
                            default : // if none of those case 
                                System.out.println("You did not enter P, p, C, c, S, s, M, or m"); // tell user to input valid character
                                return; // leave program
                        } // end drink switch statement
                break; // stop program
            default: // if none of cases above
                System.out.println("You did not enter B, b, S, s, F, or f"); // you did not enter vaild character
                return; // leave program
            } // end choice switch statement
    } // end method
} // end class
        