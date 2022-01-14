/**
 * Leetcode - largest_triangle_area
 */
package com.algorithm.problems.largest_triangle_area;

class Solution1 implements Solution {

    /**
     * S = x1y2+x2y3+x3y1-x1y3-x2y1-x3y2
     */
    @Override
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double area = 0.5 * Math.abs((x2 * y3 + x1 * y2 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
}
