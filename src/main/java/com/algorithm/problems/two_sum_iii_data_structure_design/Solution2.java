/**
 * Leetcode - two_sum_iii_data_structure_design
 */
package com.algorithm.problems.two_sum_iii_data_structure_design;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    private HashMap<Integer, Integer> numCountMap;

    @Override
    public Boolean[] twoSumOperate(String operates) {
        numCountMap = new HashMap<>();
        String[] operate = operates.split(",");
        Boolean[] result = new Boolean[operate.length];

        for (int i = 0; i < operate.length; i++) {
            if (operate[i].startsWith("add")) {
                String num = operate[i].substring(4, operate[i].length() - 1);
                add(Integer.parseInt(num));
                result[i] = null;
            } else if (operate[i].startsWith("find")) {
                String num = operate[i].substring(5, operate[i].length() - 1);
                result[i] = find(Integer.parseInt(num));
            }
        }
        return result;
    }

    private void add(int number) {
        numCountMap.merge(number, 1, Integer::sum);
    }

    private boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            Integer count = numCountMap.get(value - entry.getKey());
            if (count == null) continue;
            return (value - entry.getKey() != entry.getKey()) || count > 1;
        }
        return false;
    }
}
