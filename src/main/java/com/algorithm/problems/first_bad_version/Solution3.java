/**
 * Leetcode - first_bad_version
 */
package com.algorithm.problems.first_bad_version;

class Solution3 implements Solution {

    private int badVersion;

    @Override
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    @Override
    public int firstBadVersion(int n) {
        for (int i = 1; i < n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
