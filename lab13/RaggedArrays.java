import java.util.Random;




public class RaggedArrays { // define class
    public static void main (String args[]){ // define method
        Random fire = new Random(); // construct Random
        int [][] supahot = new int [5][]; // declare int
        for (int row=0; row<supahot.length; row++){ // use for loop to regulate space for each array within the array
            supahot[row] = new int[row*3+5];
        }
        for(int row=0; row<supahot.length; row++){ // use for loop give each pos. a value
            for (int p=0; p<supahot[row].length; p++){
                supahot[row][p] = fire.nextInt(40); // give every pos. random int between 0-39
            }
        }
        System.out.println("The array before sorting"); // print statement (ps)
        display(supahot); // call method to print original array
        
        ascending(supahot); // call method to sort array
        
        System.out.println("The array after sorting"); // ps
        display(supahot); // call method to print sorted array
    } // end method
    
    public static void display(int a[][]){ // define method
        
        for(int row=0; row<a.length; row++){ // for every row
            for(int c=0; c<a[row].length; c++){ // and for every pos. in the row
                System.out.print(a[row][c]+"  "); // print value
            }
            System.out.print("\n"); // then print new line for next row
        }
    }
    public static int[][] ascending(int b[][]){ // define method
        
        
        
        for(int row=0; row<b.length; row++){ // for every row
            for(int c=0; c<b[row].length-1; c++){ // and every pos in that row
                int cMin = b[row][c]; // create current min value
                int cMinIndex = c; // create position where current min is located
                for(int j=c+1; j<b[row].length; j++){ // for the pos
                    if(cMin>b[row][j]){ // if pos. less than current min
                        cMin = b[row][j]; // current min now equal low pos. value
                        cMinIndex = j; // new current min position
                    }
                }
                
                if(cMinIndex !=c){ // if current min not in same pos
                    b[row][cMinIndex] = b[row][c]; // then assign value of previous min to current minindex
                    b[row][c] = cMin; // current min is not the value of last min
                }
               
                
                
            }
        }
        return b; // return sorted int
        
    }
    
} //end class