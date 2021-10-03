/**
 * Leetcode - next_greater_element_i
 */
package com.algorithm.problems.next_greater_element_i;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    /**
     * 将nums2中元素及其索引位置存到map中。遍历nums1元素查找该元素索引位置之后下一个更大的值
     */
    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = -1;
            for (int j = (Integer) map.get(nums1[i]) + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
