/**
 * Leetcode - valid_anagram
 */
package com.algorithm.problems.valid_anagram;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * 使用一个大小为26的int数组，对相应的s字符位置加1，t字符位置减1，查看最终数组内是否都为0
     * 或者先对相应的s字符位置加1，再遍历t字符位置减1，遍历的过程中如果当前字符位对应的计数小于0则非anagram
     */
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;

//        if (s.length() != t.length()) {
//            return false;
//        }
//        int[] table = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            table[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            table[t.charAt(i) - 'a']--;
//            if (table[t.charAt(i) - 'a'] < 0) {
//                return false;
//            }
//        }
//        return true;
    }
}
