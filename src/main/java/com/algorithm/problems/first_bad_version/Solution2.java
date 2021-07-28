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
        return 0;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
