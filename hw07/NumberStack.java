import java.util.Scanner; // import scanner
/*
    Austin Price
    CSE 2
    HW 07
    10/21/14
    
    Number Stack Java Program
    
    first compile program
        javac NumberStack.java
    run program
        java NumberStack
Write a program that forces the user to enter an integer between 1 and 9, inclusive, and then prints out displays that depend on the value entered and look like the following: 
Enter a number between 1 and 9- 4
Using for/while/do-while loops:
    1
    -
   222
   222
   ---
  33333
  33333
  33333
  -----
 4444444
 4444444
 4444444
 4444444
 -------
*/
public class NumberStack { // define class
    public static void main ( String args[] ) { // define method
        Scanner myScanner = new Scanner (System.in); // input scanner into program
        int nVar = 0; // assign and declare input variable
        
        while ( nVar > 9 || nVar < 1 ) { // when nStars is outside of range prompt user to enter input
            System.out.print("\t \t Enter an int between 1 and 9- "); // ask user to input number within range
                while(!myScanner.hasNextInt()){ // when input is not an int
    	            myScanner.next(); //get rid of the junk entered by user
    	            System.out.print("You did not enter an int; try again- "); // prompt the user to an input within range again and if user input int not in range remind user to print with in range with original while loop
                } // end while
                nVar = myScanner.nextInt(); // set input value to nStars
        } // end while
        System.out.println("Using for loops:"); // number stack with for loops
        for (int i = 1; i<nVar+1; i++ ) { // declare i to equal 1; stop when its equal to user input+1; increment by 1 after reading
            
            for(int row = 1; row<i+1; row++) { // declare row to equal 1; stop when row equal i +1; incre,ent row by 1 (prints out number of rows = i)
                for(int space = 1; space<nVar-i+2; space++) { // need to make a pyramid, so using this to make a space for number printing. Space variable print a space everytime nVar-i+1 is grreater than space variable
                System.out.print(" "); // printing space shift the numbers into a pyramid formation so number stack correctly
                } // end space for loop
                for (int j=0; j<(2*i-1); j++){// declare j(stands for how many times number is printed) = 1; stop when j<(2i-1) [2i-1 only prints out odd amount of numbers]; increment by 1
                    
                    System.out.print(i); // print out i
                
                } // end number of print for loop
                System.out.print("\n"); // go to next line
            } // end amount of rows printed
            for(int space = 1; space<nVar-i+2; space++) { // add this space variable just like was done for rows, so dashed line shift under the numbers in stack
                System.out.print(" "); // print space for shift
            } // end 2nd space for loop
            for (int intersect = 0; intersect<(2*i-1); intersect++){ // you need to get a line of dashes between each number, so after the number block is printed print out dashes you the same for loop above
                System.out.print("-"); // print dash
            }
        System.out.print("\n"); // go to next line
            
        } // end for loops
        
        int number = 1; // intialize and store values to variables within code (lines 69-74)
        int spaceWhile = 0;
        int spaceWhile2 =0;
        int rowWhile = 0;
        int dashWhile = 0;
        int numberTimes = 0;
        System.out.println("Using while loops:"); // tell user the type of loop used for following array
        while (number < nVar+1) { // while number is less than nVar (user input)
            while (rowWhile < number) { //while number of rows is less than number being printed
                while (spaceWhile < nVar-number+1) { // while amount of space incorrect
                    System.out.print(" "); // print a space
                    spaceWhile++; // increment variable by 1
                } // end spaceWhilefor number
                while (numberTimes < 2*number-1) { // while numberTimes is less than odd number
                    System.out.print(number); // print number
                    numberTimes++; // increment variable by 1
                }// nested end while

                rowWhile++; // increment rowWhile by 1
                spaceWhile = 0; // reset variable
                numberTimes = 0; // reset variable
                System.out.print("\n");// print new line
        } // end while for rows (as far printing numbers)
        while (spaceWhile2 < nVar-number+1) { // while the dashes are in the wrong spot
            System.out.print(" "); // print a space
            spaceWhile2++; // increment variable by 1
        } // end space while for dash
        while (dashWhile < 2*number-1) { // while there are not enough dashes under numbers printed
            System.out.print("-"); // print a dash
            dashWhile++; // increment by 1
        }
        System.out.print("\n"); // print new line
        number++; // increment number by 1
        rowWhile = 0; // reset variable
        spaceWhile = 0; // reset variable
        spaceWhile2 = 0; // reset variable
        dashWhile =0; // reset variable
        } // end while
        int numberDo = 1, // intialize and store values for variable with do-while code
            numberTimesDo = 0,
            rowDo = 0,
            spaceDo = 0,
            spaceDo2 = 0,
            dashDo = 0;
        System.out.println("Using do-while loops:");
        do { // do the following while number < userinput+1
            do { // do the following while number of rows < number
                do { // do the following while while number of spaces < input my current -1
                    System.out.print(" "); // print space
                    spaceDo++; // increment by 1
                } while (spaceDo < nVar - numberDo+1); // specify when do-while loop ends
                do { // do the following while numbers printed is less than current number*2 -1
                    System.out.print(numberDo); // print current number
                    numberTimesDo++; // increment by 1
                } while (numberTimesDo < 2*numberDo-1); // specify when do-while loop ends
                System.out.print("\n"); // print new line
                rowDo++; // increment by 1
                numberTimesDo = 0; // reset variable so program can keep running
                spaceDo = 0; // reset variable
            } while (rowDo < numberDo); // specify when do-while loop ends
            do { // do the following while number of spaces < input - current number +1 
                System.out.print(" "); // print space
                spaceDo2++; // increment by 1
            } while (spaceDo2 < nVar - numberDo+1); // specify when do-while loop ends
            do { // do the following while dash printed is less than current number*2 -1
                System.out.print("-"); // print dash
                dashDo++; // increment by 1
            } while (dashDo < 2*numberDo-1); // specify when do-while loop ends
        System.out.print("\n"); // print new line
         numberDo++; // increment by 1
         rowDo = 0; // reset variable so program can keep running
         spaceDo2 = 0; // reset variable so program can keep running
         dashDo = 0; // reset variable so program can keep running
         
        } while (numberDo < nVar+1); // specify when do-while loop ends
        
    } // end method
} // end class
