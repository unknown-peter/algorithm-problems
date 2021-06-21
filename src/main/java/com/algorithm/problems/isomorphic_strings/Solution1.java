/**
 * Leetcode - isomorphic_strings
 */
package com.algorithm.problems.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> stMap = new HashMap<>();
        Map<Character, Character> tsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sIso = stMap.get(s.charAt(i));
            Character tIso = tsMap.get(t.charAt(i));
            if (sIso == null && tIso == null) {
                stMap.put(s.charAt(i), t.charAt(i));
                tsMap.put(t.charAt(i), s.charAt(i));
            } else if (sIso != null && tIso != null) {
                if (!sIso.equals(t.charAt(i)) || !tIso.equals(s.charAt(i)))
                    return false;
            } else return false;
        }
        return true;
    }
}
