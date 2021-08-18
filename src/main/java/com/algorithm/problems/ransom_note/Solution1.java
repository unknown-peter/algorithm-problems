/**
 * Leetcode - ransom_note
 */
package com.algorithm.problems.ransom_note;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Character ch = magazine.charAt(i);
            Integer count = map.get(ch);
            if (count == null) count = 0;
            map.put(ch, count + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);
            Integer count = map.get(ch);
            if (count == null || count == 0) return false;
            map.put(ch, count - 1);
        }
        return true;
    }
}
