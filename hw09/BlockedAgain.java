/////Austin Price
/// hw 09


import java.util.Scanner;
public class BlockedAgain{
    
        public static int getInt() {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter an int between 1 and 9, inclusive: ");
            while(!checkInt(scan)){
			scan.next();
			System.out.print("You did not enter an int; try again: ");
		}
		return checkRange(scan,scan.nextInt());
    }
    public static boolean checkInt(Scanner a) {
        return a.hasNextInt();
        
    }
    public static int checkRange(Scanner a, int test) {
        if (test > 0 && test < 10) {
            return test;
        }
        else {
            System.out.print("You did not enter an int in [1,9], try again: ");
			while(!checkInt(a)){
			a.next();
			System.out.print("You did not enter an int; try again: ");
			}
			return checkRange(a,a.nextInt());
        }
    }
    
    
    
    
    
    
    public static void allBlocks(int b) {
        for (int i =0; i<b; i++) {
            block();
            line();
        }
        
    }
    public static void line(){
    for(int i = 1; i<getInt()+1; i++) {
        for(int space = 1; space<getInt()-i+2; space++) { // add this space variable just like was done for rows, so dashed line shift under the numbers in stack
                System.out.print(" "); // print space for shift
            } // end 2nd space for loop
            for (int intersect = 0; intersect<(2*i-1); intersect++){ // you need to get a line of dashes between each number, so after the number block is printed print out dashes you the same for loop above
                System.out.print("-"); // print dash
            }
    }
    }
    public static void block() {
        int nVar = getInt();
        for (int i = 1; i<nVar+1; i++) {
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
        }
    }
    
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
}
