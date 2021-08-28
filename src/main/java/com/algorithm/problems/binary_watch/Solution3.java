/**
 * Leetcode - binary_watch
 */
package com.algorithm.problems.binary_watch;

import java.util.*;

class Solution3 implements Solution {

    private List<Integer> hourBitValues = Arrays.asList(8, 4, 2, 1);

    private List<Integer> minuteBitValues = Arrays.asList(32, 16, 8, 4, 2, 1);

    @Override
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= turnedOn; i++) {
            Set<Integer> hours = getValues(hourBitValues, i);
            Set<Integer> minutes = getValues(minuteBitValues, turnedOn - i);
            for (Integer h : hours) {
                if (h >= 12) continue;
                for (Integer m : minutes) {
                    if (m >= 60) continue;
                    list.add(h + ":" + (m < 10 ? ("0" + m) : m));
                }
            }
        }
        return list;
    }

    private Set<Integer> getValues(List<Integer> list, int bitNum) {
        if (bitNum > list.size()) return new HashSet<>();

        Set<Integer> set = new HashSet<>();
        if (bitNum == 0) {
            set.add(0);
            return set;
        }

        for (Integer value : list) {
            List<Integer> subList = new ArrayList<>(list);
            subList.remove(value);
            Set<Integer> sums = getValues(subList, bitNum - 1);
            for (Integer s : sums) {
                set.add(s + value);
            }
        }
        return set;
    }
}
