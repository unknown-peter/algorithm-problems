/**
 * Leetcode - rotate_string
 */
package com.algorithm.problems.rotate_string;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
