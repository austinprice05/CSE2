/*
Austin Price
lab 10

*/

public class MethodCalls{ // define class
    public static int addDigit(int a, int b){ // define method
        int boss = Math.abs(a); // makes int positive
        int boss2 = Math.abs(b);
        double easy; // declare double
        int plaster = 0; // declare/ intialize int
        
        if (boss<100 && boss>9){ // excute if int (9,100)
            easy = (double)boss/100; // convert int into double then divide b 100
            easy = easy+boss2; // add 2nd int
            easy = (easy*100); //gets numbers to left of decimal
            plaster = (int)easy; // convert double to int
        } // end if
        // same instruction for next 3 else if
        else if (boss>99 && boss<1000){
            easy = (double)boss/1000;
            easy = easy+boss2;
            easy = (easy*1000);
            plaster = (int)easy;            
        }
        else if (boss>999 && boss<10000){
            easy = (double)boss/10000;
            easy = easy+boss2;
            plaster =  (int)(easy*10000);
        }
        else if (boss>9999 && boss<100000){
            easy = (double)boss/100000;
            easy = easy+boss2;
            plaster = (int)(easy*100000);
        }
        
        if (a*b<0){ // if product of 2 ints is < 0
            plaster*=-1; // convert to negative
        } // end if
        
        return plaster; // return int to main method
    } // end method
    
    public static int join(int a, int b){
        // same instruction as addDigit method
        int boss = Math.abs(a);
        int boss2 = Math.abs(b);
        double frac = 0;
        double nextOne= 0;
        int result = 0;
        
        if (boss2>9 && boss2<100){
            frac=(double)boss2/100;
            nextOne =frac+(double)boss;
            result = (int)(nextOne*100);
        }
        else if (boss2>999 && boss2<10000){
             frac=(double)boss2/10000;
            nextOne =frac+(double)boss;
            nextOne = (nextOne*10000);
            nextOne = Math.round(nextOne*100)/100.0;
            result = (int)nextOne;
        }
        else if (boss2<100 && boss2>9){
            frac=(double)boss2/10000;
            nextOne =frac+(double)boss;
            nextOne = (nextOne*10000);
            nextOne = Math.round(nextOne*100)/100.0;
            result = (int)nextOne;
        }
        if (a*b<0){
            result*=-1;
        }
         
        return result;
    } // end method
    
    public static void main(String []  arg){ // define method
        int a=784,b=22,c;
        c=addDigit(a,3); // call addDigit method
        System.out.println("Add 3 to "+a+" to get "+c); //print statement (ps)
        c=addDigit(addDigit(c,4),5); // call addDigit method
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c); // ps
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));// call addDigit method then ps
        c=join(a,b); // call join method
        System.out.println("Join "+a+" to "+b+" to get "+c); // ps
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83))); // call join twice then ps
        System.out.println("Join -9 and -90 to get "+join(-9,-90)); // call join ps
    } // end main method
}  // end class
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
