/**
 * Leetcode - assign_cookies
 */
package com.algorithm.problems.assign_cookies;

import java.util.Arrays;

class Solution2 implements Solution {

    /**
     * 数组g和数组s排序，遍历s数组同时遍历g数组，g数组指针移动次数即为满足的孩子个数。
     * 如果当前s[j] >= g[i]，饼干能够满足孩子，两数组指针后移
     * 否则s[j] < g[i]，只有s数组指针向后移动，寻找可以满足该孩子的下一个饼干
     */
    @Override
    public int findContentChildren(int[] g, int[] s) {
        if (s == null) return 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (s[j] >= g[i]) i++;
        }
        return i;
    }
}
