/**
 * Leetcode - trapping_rain_water
 */
package com.algorithm.problems.trapping_rain_water;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * 使用左右双指针与leftMax、rightMax左右最大值交替累加当前位置接到的雨水
     * 判断左右指针指向的元素哪个更小，假如左指针指向的元素更小，判断左指针指向元素是否小于leftMax
     * 如果小于leftMax，则左指针指向元素夹在leftMax和右指针指向元素之间且leftMax更小
     * 因此左指针位置接到的雨水即为leftMax减去左指针指向元素的差值
     * 如果大于等于leftMax，则左指针指向元素无法接到雨水，leftMax更新为左指针指向的元素
     * 左指针向右移动更新。反之若右指针更小则类似判断并将右指针向左移动更新
     */
    @Override
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else ans += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
