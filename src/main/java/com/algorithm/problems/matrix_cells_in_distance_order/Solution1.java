/**
 * Leetcode - matrix_cells_in_distance_order
 */
package com.algorithm.problems.matrix_cells_in_distance_order;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution1 implements Solution {

    @Override
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<Pair<Integer, Integer>>> map = new TreeMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int dist = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                List<Pair<Integer, Integer>> list = map.computeIfAbsent(dist, k -> new ArrayList<>());
                list.add(new Pair<>(i, j));
            }
        }

        int[][] res = new int[rows * cols][2];
        int i = 0;
        for (List<Pair<Integer, Integer>> pairList : map.values()) {
            for (Pair<Integer, Integer> pair : pairList) {
                res[i][0] = pair.getKey();
                res[i][1] = pair.getValue();
                i++;
            }
        }
        return res;
    }
}
