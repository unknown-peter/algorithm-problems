/**
 * Leetcode - robot_return_to_origin
 */
package com.algorithm.problems.robot_return_to_origin;

class Solution1 implements Solution {

    @Override
    public boolean judgeCircle(String moves) {
        int[] pos = new int[2];
        char[] movesArray = moves.toCharArray();
        for (char move : movesArray) {
            if (move == 'U') pos[1] += 1;
            else if (move == 'D') pos[1] -= 1;
            else if (move == 'R') pos[0] += 1;
            else if (move == 'L') pos[0] -= 1;
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}
