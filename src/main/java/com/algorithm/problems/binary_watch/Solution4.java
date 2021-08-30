/**
 * Leetcode - binary_watch
 */
package com.algorithm.problems.binary_watch;

import java.util.ArrayList;
import java.util.List;

class Solution4 implements Solution {

    @Override
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= turnedOn; i++) {
            List<Integer> hours = new ArrayList<>();
            List<Integer> minutes = new ArrayList<>();
            getValues(4, i, 0, hours);
            getValues(6, turnedOn - i, 0, minutes);
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

    private void getValues(int length, int bitNum, int base, List<Integer> list) {
        if (bitNum == 0) {
            list.add(base);
            return;
        }

        if (length == 0 || length < bitNum) return;

        getValues(length - 1, bitNum - 1, base + (1 << (length - 1)), list);
        getValues(length - 1, bitNum, base, list);
    }
}
