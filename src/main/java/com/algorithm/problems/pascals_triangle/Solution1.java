/**
 * Leetcode - pascals_triangle
 */
package com.algorithm.problems.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> lastRow = triangle.get(i - 1);
            for (int j = 1; j < i; j++) {
                row.add(lastRow.get(j - 1) + lastRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
