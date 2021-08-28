/**
 * Leetcode - binary_watch
 */
package com.algorithm.problems.binary_watch;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (getBits(i, j) == turnedOn) {
                    list.add(i + ":" + ((j < 10) ? ("0" + j) : j));
                }
            }
        }
        return list;
    }

    private int getBits(int hour, int minute) {
        int time = (hour << 6) + minute;
        int count = 0;
        while (time != 0) {
            time = time & (time - 1);
            count++;
        }
        return count;

//        BitSet bitSet = new BitSet(10);
//        int i = 0;
//        while (time != 0) {
//            if ((time & 0x00000001) == 0x00000001) {
//                bitSet.set(i);
//            }
//            time >>>= 1;
//            i++;
//        }
//        return bitSet.cardinality();
    }
}
