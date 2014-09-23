import java.util.Scanner; // import scanner
/* 
 Austin Price
    CSE 2
    HW 4
    9/23/14
    
    Income Tax Java Program
    Goal is to find the year course was taken and which semester
    
    first compile program
        javac CourseNumber.java
    run program
        java CourseNumber
*/
public class CourseNumber { // define class
    public static void main(String[] args) { // define method
         Scanner myScanner = new Scanner (System.in); // constructing
         
         int inputNumber = 0, // declaring monthNumber
         yearNumber, // calculated variable
         semesterNumber; // calculated variable
         
         System.out.print("Enter a six digit number giving the course semester: ");
            if (  myScanner.hasNextInt() ) { // checking if input integer is an integer
               inputNumber = myScanner.nextInt(); // if true assign input integer to variable
            } // end if
            else { // or 
                System.out.println("You did not enter an int"); // print statement to tell user input is invalid
                return; // leave program
            } // end else
            
            
            
            if (inputNumber >= 186510 && inputNumber <= 201440) { // if 186510 <= inputNumber <= 201440
                yearNumber = (int) (inputNumber/100.0); // calculate year
                semesterNumber = (int) (inputNumber % 100.0); // calculate semesterNumber
                 if ( semesterNumber == 10 ) { // if semesterNumber == 10
                    System.out.println("The course was offered in the Spring semester of "+ yearNumber); // then print Spring semester statement
                 } // end if
                 else if (semesterNumber == 20 ) { // if semesterNumber == 20 
                    System.out.println("The course was offered in the Summer 1 semester of "+ yearNumber); // then print Summer 1 semester statement
                 } // end else if
                 else if (semesterNumber == 30 ) { // if semesterNumber == 30
                    System.out.println("The course was offered in the Summer 2 semester of "+ yearNumber); // then print Summer 2 semester statement
                 } // end else if
                 else if (semesterNumber == 40 ) { // if semesterNumber == 40
                    System.out.println("The course was offered in the Fall semester of "+ yearNumber); // then print Fall semester statement
                 } // end else if
                 else { // if remainder != 10,20,30,40
                     System.out.println(semesterNumber+" is not a legitimate semester"); // then print the semester is not legitimate
                     return ;
                 } // end else
            }
            else { // if not in range
                System.out.println("The number was outside the range [186510,201440]"); // then tell user not in range
                return; // leave program
            } // end else
    } // end method
} // end class
    