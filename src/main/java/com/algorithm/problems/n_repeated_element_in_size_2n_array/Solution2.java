/**
 * Leetcode - n_repeated_element_in_size_2n_array
 */
package com.algorithm.problems.n_repeated_element_in_size_2n_array;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 对于数组中的x有n个，其他数字共有n个。则数组中至少有一个4个元素的子数组，其中包含至少两个x
     */
    @Override
    public int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k)
            for (int i = 0; i < A.length - k; ++i)
                if (A[i] == A[i + k])
                    return A[i];

        throw null;
    }
}
