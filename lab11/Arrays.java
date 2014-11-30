import java.util.Scanner;
/*
Austin Price
CSE 2 
Lab 11
Program. Write a program that performs the following tasks:

Create an array that can hold 10 ints
Ask the user enter 10 ints and store them in the array
Search the array for the highest entry and print it out
Search the array for the lowest entry and print it out
Sum the ints in the array and print out the sum
Copy the contents of the array into a second array in reverse order 
Print the contents of the two arrays in two columns, side by side. 
Below is sample output that your program should resemble:

Enter 10 ints- -9 20 8 9 23 45 1 2 89 70
The lowest entry is -9
The highest entry is 89
The sum is 258
    -9     70
    20     89
     8      2
     9      1
    23     45
    45     23
     1      9
     2      8
    89     20
    70     -9

Note: For simplicity, assume that the user only enters ints.
*/

public class Arrays { // define class
    public static void main(String[] args){ // define method
    Scanner scan = new Scanner(System.in); // construct scanner
    
    int [] tenInts= new int[10]; // declare array
    
    int sum = 0; // declare intialize varibles
    int counter =0;
    System.out.print("Enter 10 ints- "); // tell user to enter 10 ints
    for(int i = 0; i<10; i++){ // intialize array
        tenInts[i] = scan.nextInt(); // where each input will be placed
    } // end for

    int min = tenInts[0]; // intialize min
    int max = tenInts[0]; // initalize max
    for(int i = 0; i<10; i++){ // begin for
        if (min>tenInts[i]){ // if min> value of next position in arrays
            min = tenInts[i]; // change min to the value of that position
        } // end if
    } // end min for
    for(int i = 0; i<10; i++){ // begin max for
        if (max<tenInts[i]){ // if max< value of next pos.
            max = tenInts[i]; // change max to that pos.
        } // end if
    } // end max for 
    for(int i = 0; i<10; i++){// begin for
        sum += tenInts[i]; // add value of each pos. to sum
    } // end sum for
    System.out.println("The lowest entry is "+min); // print min
    System.out.println("The highest entry is "+max); // print max
    System.out.println("The sum is "+sum); // print sum
    int [] reverseInts = new int[10]; // declare array
    for(int i=9;i>=0;i--){ // reverse for
        reverseInts[counter] = tenInts[i]; // reverse position of value in inital array
        counter++; // add 1 to counter
    } // end reverse for
    for (int i=0; i<10; i++){ // begin for
        System.out.println(tenInts[i]+"   "+reverseInts[i]); //print value and position (shows reverse array)
    } // end for
    } // end method
}// end class