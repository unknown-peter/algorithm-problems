/**
 * Leetcode - trapping_rain_water
 */
package com.algorithm.problems.trapping_rain_water;

import java.util.Stack;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 从左至右遍历height数组，使用栈依次存储小于栈顶的数组当前元素index
     * 如果当前遍历元素大于栈顶index的元素，则栈顶index元素即为左右柱子间接雨水的位置，弹出栈顶index
     * 此时新的栈顶index元素与当前元素比较的最小值减去旧的已弹出index的元素即为该段积存雨水的高度
     * 新的栈顶index与当前元素index之间的距离为该段积存雨水的宽度
     * 对柱子间接到的雨水进行横向加和，由此依次累加即可
     */
    @Override
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        int ans = 0;
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) break;
                int distance = current - stack.peek() - 1;
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * boundedHeight;
            }
            stack.push(current++);
        }
        return ans;
    }
}
