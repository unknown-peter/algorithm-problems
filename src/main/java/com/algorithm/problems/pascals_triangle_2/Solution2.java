/**
 * Leetcode - pascals_triangle_2
 */
package com.algorithm.problems.pascals_triangle_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        row.set(0, 1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
