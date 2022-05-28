/**
 * Leetcode - median_of_two_sorted_arrays
 */
package com.algorithm.problems.median_of_two_sorted_arrays;

class Solution3 implements Solution {

    /**
     * 对于一个有序数组，其中位数可表示为(L + R)/2 = (A[(N-1)/2] + A[N/2])/2
     * 对于数组nums1、nums2，在其字符前后分别增加特殊字符#，则总长为2M+2N+2
     * 对两个新数组分别进行分割，则除去两个分割字符，分割之后左右都为M+N个字符
     * 假如nums1新数组分割数量为C=k，则nums2新数组分割数量为D=M+N-k
     * 因此，nums1分割左右值分别为L1=(C-1)/2，R1=C/2. nums2分割左右值分别为L2=(D-1)/2，R2=D/2
     * 为保证在中位数处分割，需满足左右都为M+N个字符，左边任一数字均小于等于右边任一数字
     * 因而有L1<=R1&&L1<=R2&&L2<=R1&&L2<=R2，对于两个有序数组本身已满足L1<=R1和L2<=R2
     * 因此使用二分查找，当满足L1<=R2&&L2<=R1时，左边最大值和右边最小值的平均即为中位值
     */
    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m < n) return findMedianSortedArrays(nums2, nums1);
        if (n == 0) return (nums1[(m - 1) / 2] + nums1[m / 2]) / 2.0;
        int left = 0, right = 2 * n;
        while (left <= right) {
            int mid2 = (left + right) / 2;
            int mid1 = m + n - mid2;
            double L1 = mid1 == 0 ? Double.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double L2 = mid2 == 0 ? Double.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = mid1 == m * 2 ? Double.MAX_VALUE : nums1[mid1 / 2];
            double R2 = mid2 == n * 2 ? Double.MAX_VALUE : nums2[mid2 / 2];
            if (L1 > R2) left = mid2 + 1;
            else if (L2 > R1) right = mid2 - 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;
    }
}
