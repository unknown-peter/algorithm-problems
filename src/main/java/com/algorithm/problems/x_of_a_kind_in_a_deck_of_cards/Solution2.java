/**
 * Leetcode - x_of_a_kind_in_a_deck_of_cards
 */
package com.algorithm.problems.x_of_a_kind_in_a_deck_of_cards;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int c : deck)
            count[c]++;

        int g = -1;
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0) {
                if (g == -1)
                    g = count[i];
                else
                    g = gcd(g, count[i]);
            }

        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
