/**
 * Leetcode - baseball_game
 */
package com.algorithm.problems.baseball_game;

class Solution1 implements Solution {

    @Override
    public int calPoints(String[] ops) {
        int[] score = new int[ops.length];
        int sum = 0;
        int j = 0;
        for (String op : ops) {
            if ("C".equals(op)) {
                sum -= score[j - 1];
                score[j - 1] = 0;
                j--;
            } else if ("D".equals(op)) {
                score[j] = 2 * score[j - 1];
                sum += score[j];
                j++;
            } else if ("+".equals(op)) {
                score[j] = score[j - 2] + score[j - 1];
                sum += score[j];
                j++;
            } else {
                score[j] = Integer.parseInt(op);
                sum += score[j];
                j++;
            }
        }
        return sum;
    }
}
