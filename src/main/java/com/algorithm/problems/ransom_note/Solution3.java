/**
 * Leetcode - ransom_note
 */
package com.algorithm.problems.ransom_note;

class Solution3 implements Solution {

    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] indexArray = new int[26];
        for (char ch : ransomNote.toCharArray()) {
            int index = magazine.indexOf(ch, indexArray[ch - 'a']);
            if (index == -1) return false;
            indexArray[ch - 'a'] = index + 1;
        }
        return true;
    }
}
