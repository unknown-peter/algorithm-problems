/**
 * Leetcode - reverse_bits
 */
package com.algorithm.problems.reverse_bits;

import java.util.HashMap;
import java.util.Map;

class Solution3 implements Solution {

    private Map<Integer, Integer> cache = new HashMap<>();

    /**
     * solution from leetcode
     *
     *                                                        abcd efgh
     *            0000 0010  0000 0010  0000 0010  0000 0010  0000 0010
     * 0000 000a  bcde fgha  bcde fgha  bcde fgha  bcde fgha  bcde fgh0
     * 0000 0001  0000 1000  1000 0100  0100 0010  0010 0000  0001 0000
     * 0000 000a  0000 f000  b000 0g00  0c00 00h0  00d0 0000  000e 0000
     *                                                       00hgfedcba
     */
    @Override
    public int reverseBits(int n) {
        int ret = 0;
        int power = 24;
        while (n != 0) {
            ret += reverseByte(n & 0xFF) << power;
            n >>>= 8;
            power -= 8;
        }
        return ret;
    }

    private int reverseByte(int n) {
        Integer ret = cache.get(n);
        if (ret == null) {
            ret = (int) ((n * 0x0202020202L & 0x010884422010L) % 1023);
            cache.put(n, ret);
        }
        return ret;
    }
}
