/**
 * Leetcode - longest_substring_without_repeating_characters
 */
package com.algorithm.problems.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    /**
     * start为当前起点，cur为当前子串回溯的长度，定义map存放字符c及其对应索引
     * 当map中不包含当前字符或者当前字符在start之前，子串长度cur加一
     * 否则有重复字符，将cur回置到i-index，start置为index+1
     */
    @Override
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int start = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer ind = map.get(s.charAt(i));
            if (ind == null || ind < start) {
                cur++;
            } else {
                res = Math.max(res, cur);
                cur = i - ind;
                start = ind + 1;
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(res, cur);
    }
}
