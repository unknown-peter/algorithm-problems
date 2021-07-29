/**
 * Leetcode - first_bad_version
 */
package com.algorithm.problems.first_bad_version;

class Solution2 implements Solution {

    private int badVersion;

    @Override
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    @Override
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) return 1;
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int left, int right) {
        if (left >= (right - 1)) return right;
        int middle = left + (right - left) / 2;
        if (isBadVersion(middle)) right = middle;
        else left = middle;
        return firstBadVersion(left, right);
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
