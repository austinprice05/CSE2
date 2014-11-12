import java.util.Scanner;

public class Methods {
    public static int getInt(int x) {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("You did not enter an int; try again- ");
        }
        x = scan.nextInt();
        
        return x;
        
        
        
        
    }
    
    public static boolean ascending(int a, int b, int c) {
        if (a<b && b<c) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static int larger(int a,int b){
        int big = 0;
        if (a>b) {
            big = a;
        }
        else {
            big = b;
        }
        return big;
    }
    
    
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0;
        System.out.println("Enter three ints");
        a=getInt(a);
        b=getInt(b);
        c=getInt(c);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
    }
}