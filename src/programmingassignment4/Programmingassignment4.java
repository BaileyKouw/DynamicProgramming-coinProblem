
package programmingassignment4;

/**
 *  Bailey Kouwenhoven and J Beckett Sweeney.
 *   April 24, 2018
 * Programming Assignment 4:  Dynamic programming coin problem
 */
public class Programmingassignment4 {

    
    public static void main(String[] args) {
        int amount = 63;
        int[] array = {1,5,10,21,25};
        int[] coinsUsed = new int[100];
        int[] coinCounts = new int[100];
        
        System.out.println("Making change for "+ amount);
        System.out.println("They are: ");

    }
    
    
    
    public static int[] makeChange(int[] coinList, int amt){
       int[] mCoins = new int[amt +1];                   //keep track of min coin
       int[] coinsUsed = new int [amt+1];               //keep track of coins needed for change
   
       /*  some pseudocode from the python example ... i think
        for loop searches through all coins less than amt, stores in mCoin array
       
       */      
        return coinsUsed;
        
        
    }
}
    
    
    
   