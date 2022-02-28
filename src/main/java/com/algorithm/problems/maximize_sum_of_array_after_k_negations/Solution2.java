/**
 * Leetcode - maximize_sum_of_array_after_k_negations
 */
package com.algorithm.problems.maximize_sum_of_array_after_k_negations;

class Solution2 implements Solution {

    @Override
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        int[] count = new int[201];

        // 所有元素相加计算sum，每个元素计算count
        for (int num : nums) {
            sum += num;
            count[num + 100]++;
        }

        for (int i = 0; i < 201 && k > 0; i++) {
            if (i < 100 && count[i] > 0) {
                // 负数在k之内的，翻转为正数，在sum上增加2*num
                int K = Math.min(k, count[i]);
                count[200 - i] += K;
                count[i] -= K;
                sum += K * (200 - 2 * i);
                k -= K;
            } else if (i >= 100 && count[i] > 0) {
                // 负数之外若k还有剩余；k为偶数返回，k为奇数则减去第一个数的2*num
                if ((k & 1) == 1) sum -= 2 * i - 200;
                break;
            }
        }
        return sum;
    }
}
