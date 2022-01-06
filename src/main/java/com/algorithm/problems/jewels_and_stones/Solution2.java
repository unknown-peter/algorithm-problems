/**
 * Leetcode - jewels_and_stones
 */
package com.algorithm.problems.jewels_and_stones;

class Solution2 implements Solution {

    @Override
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) count++;
            }
        }
        return count;
    }
}
