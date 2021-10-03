/**
 * Leetcode - next_greater_element_i
 */
package com.algorithm.problems.next_greater_element_i;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution3 implements Solution {

    /**
     * 遍历nums2，将其元素存到stack中，若当前遍历的num大于stack栈顶元素时，num即为栈顶元素下一个更大值，存到map中。
     */
    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map map = new HashMap<Integer, Integer>();
        for (int num : nums2) {
            while (!stack.empty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = (Integer) map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
