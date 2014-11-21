import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  public static void showHands(){
    Scanner scan = new Scanner(System.in);
      // 0-12 clubs
      // 13-25 diamonds
      // 26-38 hearts
      // 39-51 spades
      int[] deck = new int[52];
    String[] suits = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String ans = "";
do {
    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }
    // shuffle cards
    for (int i= 0; i< deck.length; i++){
        
        int index = (int)(Math.random() *deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
        
    }
    //draw cards
   for (int j = 0; j<4; j++){
     System.out.print(suits[j]);
    for (int i = 0; i < 5; i++) {
      if(deck[i]/13==j) {
        String rank = ranks[deck[i]%13];
    
        System.out.print(rank+" ");
    //do stuff with nameString
}
}
  System.out.print("\n");
}
 System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
 ans = scan.next();
} while(ans.equals("y")||ans.equals("Y"));
      
      
      
  }
  public static void simulateOdds() {
    int oneDuplicate =0;
    int Ncounter = 0;
    int duplicate = 0;
    int [] dup = new int[13];
    for (int de = 0; de<dup.length; de++){
      dup[de] = 0;
    }

      int[] deck = new int[52];
    String[] suits = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String ans = "";
  for(int e = 0; e<10000; e++){
    
    //SUB COUNTERS
    int cAcounter = 0;
    int c2counter = 0;
    int c3counter = 0;
    int c4counter = 0;
    int c5counter = 0;
    int c6counter = 0;
    int c7counter = 0;
    int c8counter = 0;
    int c9counter = 0;
    int c10counter = 0;
    int Jcounter = 0;
    int Qcounter = 0;
    int Kcounter = 0;
    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }
    for (int i= 0; i< deck.length; i++){
        
        int index = (int)(Math.random() *deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
        
    }
    //draw cards
    for (int i = 0; i < 5; i++) {
        String rank = ranks[deck[i]%13];
        if(rank.equals("A")){
          cAcounter++;
        }
        if(rank.equals("2")){
          c2counter++;
        }
        if(rank.equals("3")){
          c3counter++;
        }
        if(rank.equals("4")){
          c4counter++;
        }
        if(rank.equals("5")){
          c5counter++;
        }
        if(rank.equals("6")){
          c6counter++;
        }
        if(rank.equals("7")){
          c7counter++;
        }
        if(rank.equals("8")){
          c8counter++;
        }
        if(rank.equals("9")){
          c9counter++;
        }
        if(rank.equals("10")){
          c10counter++;
        }
        if(rank.equals("J")){
          Jcounter++;
        }
        if(rank.equals("Q")){
          Qcounter++;
        }
        if(rank.equals("K")){
          Kcounter++;
        }
        
        switch(rank) {
          case "A":
            cAcounter++;
            
        }
        int [] counters = {cAcounter, c2counter, c3counter, c4counter, c5counter, c6counter, c7counter, c8counter, c9counter, c10counter, Jcounter, Qcounter, Kcounter};
        
        
        for (int y = 0; y<13; y++){
        //if (cAcounter==2 || c2counter==2 || c3counter==2 || c4counter==2 || c5counter==2 || c6counter==2 ||c7counter==2 || c8counter==2 || c9counter==2 || c10counter ==2 || Jcounter==2 || Qcounter ==2|| Kcounter==2){
          if (counters[y]==2){
          duplicate++;
          dup[y]+=1;
          
          }
        //}
        }
    
        if (duplicate!=1){
          Ncounter++;

        }
        else{
          oneDuplicate++;
        }
    }
     cAcounter = 0;
     c2counter = 0;
     c3counter = 0;
     c4counter = 0;
     c5counter = 0;
     c6counter = 0;
     c7counter = 0;
     c8counter = 0;
     c9counter = 0;
     c10counter = 0;
     Jcounter = 0;
     Qcounter = 0;
     Kcounter = 0;
     duplicate = 0;
    }
    System.out.println("rank    freq of exactly one pair");
    for(int p = 0; p<ranks.length; p++){
      System.out.println(ranks[p]+"     "+dup[p]);
    }
    System.out.println("--------------");
    System.out.println("Total not exactly one pair: "+Ncounter);
    
  }
      
}
      
      
    
  



/*
Clubs:    J 4 
Diamonds: 
Hearts:   J 7 4 
Spades:   

Go again? Enter 'y' or 'Y', anything else to quit- y
Clubs:    Q 2 
Diamonds: A 
Hearts:   5 
Spades:   J 

Go again? Enter 'y' or 'Y', anything else to quit- q
  rank   freq of exactly one pair
    A       312
    K       307
    Q       339
    J       325
   10       323
    9       334
    8       363
    7       312
    6       339
    5       349
    4       328
    3       293
    2       327
----------------------------
 total not exactly one pair: 5749
*/