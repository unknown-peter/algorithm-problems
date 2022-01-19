/**
 * Leetcode - rectangle_overlap
 */
package com.algorithm.problems.rectangle_overlap;

class Solution1 implements Solution {

    /**
     * 矩形1 [x1, y1, x2, y2]和矩形2 [x3, y3, x4, y4]有重叠的条件
     * x4>x1 && x3<x2
     * y4>y1 && y3<y2
     */
    @Override
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec2[2] > rec1[0] && rec2[0] < rec1[2] && rec2[3] > rec1[1] && rec2[1] < rec1[3];
    }
}
