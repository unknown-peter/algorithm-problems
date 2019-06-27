/**
 * Leetcode - length_of_last_word
 */
package com.algorithmproblems.length_of_last_word;

class Solution1 implements Solution {

    @Override
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int lastLen = 0;
        int i = s.length() - 1;

        while ((i >= 0) && (s.charAt(i) == ' '))
            i--;

        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            lastLen++;
        }

        return lastLen;
    }

}
