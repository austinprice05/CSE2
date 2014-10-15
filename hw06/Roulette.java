/*
Austin Price
CSE 2
hw 06
10/14/14

Roulette.java program
For this program, use a random number generator (recall Math.random()) to simulate this person’s
betting on 100 spins, but run the simulation 1000 times and collect data on the outcome.
For 100 spins, if my number comes up 3 or more times, I walk away with 3x$36=$108 or more. 
Thus, if my number comes up at least 3 times I win money; otherwise I lose money. 
For the 1000 repetitions of the 100-spin simulation, compute the number of times I lose everything (my number never comes up), 
compute the total winnings (of all simulations added together), and 
compute the number of times I walked away with a profit in one session of 100 spins of the wheel.
Store the program in the file Roulette.java and store the file in lab06 on Cloud9.
*/
public class Roulette { // define class
  public static void main(String []arg){ // define method
        int counter1 = 0, //declare and store varibles (line 19-25)
            counter2 = 0,
            totalTimesWon = 0,
            timesWon = 0,
            timesProfit = 0,
            totalLostEverything = 0,
            totalWinnings = 0;
            
          while (counter1 < 1000) { // while counter1 is less than a 1000 b/c counter1 starts at 0
            counter1++; // add 1 to counter1 each time through loop
            while (counter2 < 100) { // while counter2 is less than a 100 b/c counter2 starts at 0
                counter2++; // add 1 to counter2
                final int numberSelected = (int) (Math.random() * 38); // declare a final random int for every 100 spins
                      int numberLand = (int) (Math.random() * 38); // declare random int for each spin
                if (numberSelected == numberLand) { // if guess is right
                    timesWon += 1; // add to times won
                    totalTimesWon+=1; // add to total times won
                    totalWinnings+=36; // add 36 to winnings
                    } // end if
            } // end 100 rep loop
            
            if (timesWon >= 3) { // if times won >= 3
              timesProfit+=1; // add timesProfit
              timesWon = 0; // reset times won
            } // end if
            else if (timesWon == 0) { // if no wins
              totalLostEverything+=1; // add to lost everything
              timesWon = 0; // reset times won
            } // end else if
            else { // if neither of those
              timesWon = 0; // only reset times won
            } // end else
            counter2 = 0; // reset counter2 to do another trial
          } // end 1000 rep loop

            System.out.println("Amount of money earned after 100,000 spins: $"+totalWinnings); // print out total times won
            System.out.println("Amount times won out of 100,000 spins: "+totalTimesWon); // print total times won
            System.out.println("Total times did not win every 100 spins (1000 trials): "+totalLostEverything); // print total times lost everything
            System.out.println("Total times walked away with profit: "+timesProfit); // print total time walked away with profit
  } // end method
} // end class