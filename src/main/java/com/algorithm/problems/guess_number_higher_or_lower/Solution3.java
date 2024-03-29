/**
 * Leetcode - guess_number_higher_or_lower
 */
package com.algorithm.problems.guess_number_higher_or_lower;

class Solution3 implements Solution {

    private int pick;

    @Override
    public void setPick(int pick) {
        this.pick = pick;
    }

    /**
     * solution from leetcode
     */
    @Override
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            int res1 = guess(mid1);
            int res2 = guess(mid2);
            if (res1 == 0)
                return mid1;
            if (res2 == 0)
                return mid2;
            else if (res1 < 0)
                high = mid1 - 1;
            else if (res2 > 0)
                low = mid2 + 1;
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
