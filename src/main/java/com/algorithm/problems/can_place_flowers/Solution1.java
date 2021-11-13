/**
 * Leetcode - can_place_flowers
 */
package com.algorithm.problems.can_place_flowers;

class Solution1 implements Solution {

    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) return true;
        }
        return n == 0;
    }
}
