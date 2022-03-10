/**
 * Leetcode - valid_boomerang
 */
package com.algorithm.problems.valid_boomerang;

class Solution1 implements Solution {

    /**
     * 如果三点共线，则(y2-y1)/(x2-x1)=(y3-y2)/(x3-x2)，即(y2-y1)*(x3-x2)=(y3-y2)*(x2-x1)
     * 因此如果isBoomerang，与上面条件相反即可
     */
    @Override
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0])
                != (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
    }
}
