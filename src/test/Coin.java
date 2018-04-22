package test;

/*
 * Authors: Bailey Kouwenhoven and J. Beckett Sweeney
 * Date: 21 Apr 2018
 * Overview: This program uses dynamic programming to provide the least amount of
 * 		for a requested amount with any set of denominations.
 * Special Instructions: 
 *      - The denomination system used must be consistent for each
 * 		test for the dynamic programming array to also be consistent.
 *      - To run on NetBeans, press alt+f6 to "Test Project" instead of 
 *              "Run Project."
 */
public final class Coin {

    public static int[] minChange(int[] in, int inNeeded) {
        int[] lastUsed = new int[100];
        lastUsed[0] = 0;
        lastUsed[1] = 1;
        int needed = inNeeded;
        if (in.length == 0) {	//empty array
            throw new IllegalArgumentException("Empty denomination array not allowed.");
        }
        if (needed == 0) {		//no change needed
            int[] zero = {0};
            return zero;
        } else {
            int lastUsedIter = inNeeded;
            int[] bigChangeArr = new int[30];
            int bigChangeIter = 0;
            while (lastUsedIter > 0) {
                if (lastUsed[lastUsedIter] == 0) {
                    find(lastUsed, in, lastUsedIter);
                }
                bigChangeArr[bigChangeIter] = lastUsed[lastUsedIter];
                lastUsedIter -= lastUsed[lastUsedIter];
                bigChangeIter++;
            }
            int[] change = new int[bigChangeIter];	//array of exact size of change
            for (int i = 0; i < change.length; i++) {
                change[change.length - (i + 1)] = bigChangeArr[i];
            }
            for (int i = 0; i < lastUsed.length; i++) {
                if (lastUsed[i] != 0) {
                    System.out.print(i + " = " + lastUsed[i] + ", ");
                }
            }
            System.out.println();
            return change;
        }
    }

    public static void find(int[] lastUsed, int[] denom, int target) {
        for (int i = 0; i < denom.length; i++) {
            for (int j = 0; j < denom.length; j++) {
                if ((target % denom[i]) == 0) {
                    lastUsed[target] = denom[i];
                    return;
                } else if ((target % denom[i]) == denom[j] && denom[j] != 1 && i != j) {
                    lastUsed[target] = denom[j];
                    return;
                }
            }
        }
        lastUsed[target] = denom[denom.length - 1];
        return;
    }
}
