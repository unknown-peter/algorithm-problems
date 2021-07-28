/**
 * Leetcode - first_bad_version
 */
package com.algorithm.problems.first_bad_version;

class Solution1 implements Solution {

    private int badVersion;

    @Override
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    @Override
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) return 1;

        int left = 1;
        int right = n;
        while (left < (right - 1)) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) right = middle;
            else left = middle;
        }
        return right;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
