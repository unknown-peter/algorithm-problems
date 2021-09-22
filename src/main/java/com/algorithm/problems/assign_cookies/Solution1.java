/**
 * Leetcode - assign_cookies
 */
package com.algorithm.problems.assign_cookies;

import java.util.Arrays;

class Solution1 implements Solution {

    /**
     * 数组g和数组s排序，从后向前遍历数组。
     * 如果当前s[j] >= g[i]，饼干能够满足孩子，两数组指针前移，计数加1
     * 否则s[j] < g[i]，移动g数组指针，寻找前一个孩子是否能被满足
     */
    @Override
    public int findContentChildren(int[] g, int[] s) {
        if (s == null) return 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;
        int count = 0;
        while (i >= 0 && j >= 0) {
            if (s[j] < g[i]) i--;
            else {
                i--;
                j--;
                count++;
            }
        }
        return count;
    }
}
