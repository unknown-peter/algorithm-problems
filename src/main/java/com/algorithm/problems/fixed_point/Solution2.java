/**
 * Leetcode - fixed_point
 */
package com.algorithm.problems.fixed_point;

class Solution2 implements Solution {

    /**
     * 由于数组A中的值顺序排列且各不相同，因此可用二分查找索引为mid的值
     * 当A[mid]=mid时，继续向前查找最小的index值
     * 当A[mid]<mid时，此时mid前面的数均小于索引不满足要求，向后查找
     * 当A[mid]>mid时，此时mid后面的数均大于索引不满足要求，向前查找
     */
    @Override
    public int fixedPoint(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == mid) end = mid;
            else if (A[mid] < mid) start = mid + 1;
            else end = mid - 1;
        }
        if (A[start] == start) return start;
        if (A[end] == end) return end;
        return -1;
    }
}
