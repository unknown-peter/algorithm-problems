/**
 * Leetcode - pascals_triangle_2
 */
package com.algorithm.problems.pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if (rowIndex == 0) return row;
        row.add(1);
        if (rowIndex == 1) return row;
        for (int i = 1; i < rowIndex; i++) {
            for (int j = 0; j < i; j++) {
                row.add(row.get(0) + row.get(1));
                row.remove(0);
            }
            row.add(1);
        }
        return row;
    }
}
