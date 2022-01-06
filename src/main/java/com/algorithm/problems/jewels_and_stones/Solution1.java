/**
 * Leetcode - jewels_and_stones
 */
package com.algorithm.problems.jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) set.add(ch);

        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) count++;
        }
        return count;
    }
}
