/*
Austin Price
lab12
ArrayMath.java
*/
public class ArrayMath{ // define class
  public static void main(String [] arg){ // define method
    double x[]={2.3, 3, 4, -2.1, 82, 23}, // intialize arrays
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y); // calculate array v by calling add arrays
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));// print statement (ps) and calls method display
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z))); // call addArrays and ps
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y)); // ps and call methods
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w)); // ps and call methods
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z)); // ps and call methods

  }
  
  public static String display(double [] x){ // define method
    String out="{"; // intialize and define String
    for(int j=0;j<x.length;j++){ // for loop
      if(j>0){ 
        out+=", "; // add a comma after every value in string
      }
      out+=x[j]; // add value to string
    }
    return out+"}"; // return string +closing bracket
  }
  public static boolean equals(double [] a, double [] b){ // define method
    if(a.length == b.length){ // if length are equal
        for(int i=0; i<a.length; i++){ // go through and see if values are equal
            if(a[i]!=b[i]){ // if not
                return false; // return false
            }
        }
    
    }
    else{
        return false; // if not equal length false
    }
      return true; // otherwise return true
  } // end method
  public static double [] addArrays(double [] a, double [] b){ // define method
      double [] sum = new double[0]; // declare array and initialize the size
      if(a.length == b.length){ // if equal
          sum = new double[a.length]; // new sum length
          for(int i = 0; i<sum.length; i++){ // for every position in sum
              sum[i]= a[i]+b[i]; // add value of a and b at that position
          }
      }
      
      if(a.length > b.length){ // if a>b
          sum = new double[a.length]; // new sum length
          double [] bigb = new double[a.length]; // declare and intialize larger array
          for(int i=0; i<bigb.length; i++){ // for every position of bigb
              if(i>=b.length){// if position exceeds length of b
                  bigb[i]=0; // position ==0
              }
              else{// if not
                  bigb[i]=b[i]; //position is value of b in that position
              }
          }
          for(int i = 0; i<sum.length; i++){ // same as previous sum for loop
              sum[i]= a[i]+bigb[i];
          }
      }
      
      if(a.length < b.length){ // if a<b
          sum = new double[b.length]; // new sum lwngth
          double [] biga= new double[b.length]; // declare initialize new aray
          for(int i=0; i<biga.length; i++){ // same as bigb for loop
              if(i>=a.length){
                biga[i] = 0;
              }
              else{
                  biga[i] = a[i];
              }
          }
          for(int i = 0; i<sum.length; i++){ // same as previous sum for loop
              sum[i]= biga[i]+b[i];
          }
      }
      
      return sum; // return sum
      
      
  } // end method
} // end class

//output:
/*
OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/