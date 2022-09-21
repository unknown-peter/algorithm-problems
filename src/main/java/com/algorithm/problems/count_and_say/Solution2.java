/**
 * Leetcode - count_and_say
 */
package com.algorithm.problems.count_and_say;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public String countAndSay(int n) {
        String currentString = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            for (int j = 0, k = 0; j < currentString.length(); j = k) {
                while (k < currentString.length() && currentString.charAt(k) == currentString.charAt(j)) k++;
                nextString += Integer.toString(k - j) + currentString.charAt(j);
            }
            currentString = nextString;
        }
        return currentString;
    }

}
