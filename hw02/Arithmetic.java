/*
    Austin Price
    CSE 2
    HW 2
    9/9/14
    
    Arithmetic Java Program
    Goal is to calculate shopping cost
    
    first compile program
        javac Arithmetic.java
    run program
        java Arithmetic
*/
// define class
public class Arithmetic {
    // add method
    public static void main(String[] args) {
        // # of pairs of socks
        int nSocks=3;
        // Cost per pair of socks
        // '$' is part of the variable name)
        double sockCost$=2.58;
        
        // # of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        // # of boxes of evelopes
        int nEnvelopes=1;
        // Cost per box of envelopes
        double envelopeCost$=3.25;
        // PA tax rate
        double taxPercent=0.06;
        // adding floating variables to calculate total cost and total item cost
        double totalSockCost$, totalGlassesCost$, totalEnvelopesCost$,
               totalCost$, salesTax$, totalCostTax$;
        // description of socks
        System.out.println("Item Bought: Socks");
        System.out.println("Quantity Bought: "+nSocks);
        System.out.println("Cost Per Sock: $"+sockCost$);
        //description of Drinking Glass
        System.out.println("\nItem Bought: Drinking Glass");
        System.out.println("Quantity Bought: "+nGlasses);
        System.out.println("Cost Per Drinking Glass: $"+glassCost$);
        // Description of Package of Envelopes
        System.out.println("\nItem Bought: Package of Envelopes");
        System.out.println("Quantity Bought: "+nEnvelopes);
        System.out.println("Cost Per Package of Envelopes: $"+envelopeCost$);
        // Calculating total cost of the items bought separately
        totalSockCost$= nSocks*sockCost$;
        totalGlassesCost$= nGlasses*glassCost$;
        totalEnvelopesCost$= nEnvelopes*envelopeCost$;
        // total cost of all items put together
        totalCost$= totalSockCost$+totalGlassesCost$+totalEnvelopesCost$;
        // calculating sales tax
        salesTax$=totalCost$*taxPercent;
        //calculating total with sales tax
        totalCostTax$= totalCost$+salesTax$;
        
        // printing total cost of each item separately
        System.out.println("\nTotal Cost of Socks: $"+totalSockCost$);
        System.out.println("Total Cost of Drinking Glasses: $"+totalGlassesCost$);
        System.out.println("Total Cost of Package ofEnvelopes: $"+totalEnvelopesCost$);
        // printing total cost of all items together
        System.out.println("\nTotal Cost of Items Purchased: $"+totalCost$);
        // printing sales tax
        System.out.printf("Sales Tax: $"+ "%.2f \n", salesTax$);
        // printing total cost with tax included
        System.out.printf("\nTotal Cost including Tax: $"+ "%.2f \n", totalCostTax$);
        
        
    } // end of method
} // end of class