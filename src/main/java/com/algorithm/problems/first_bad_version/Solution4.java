/**
 * Leetcode - first_bad_version
 */
package com.algorithm.problems.first_bad_version;

class Solution4 implements Solution {

    private int badVersion;

    @Override
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    @Override
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
