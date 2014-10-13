/*
    Austin Price
    CSE 2
    lab 06
    10/09/14
    
    Enigma3 Java Program
* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println(k);
    System.out.println(n);
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    System.out.println(n);
    
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(n);
    switch(n+k){
      case 114: 
        n-=11;
        
        k-=3;
        
        break;
      case 97:
        n-=14;
        
        k-=2;
        
        break;
      case 98:
        n/=5;
        System.out.println(n);
        k/=9;
        System.out.println(k);
      default:
        n-=3;
        System.out.println(n);
        k-=5;
        System.out.println(k);
    }
    System.out.println(n);
    System.out.println(k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 k goes to zero at line 65 and causes program to crash at line 70
 the reason the program crashes is because there is no break statement between case 98 and default.
 * 
 * 
 * 
 * 
 */
