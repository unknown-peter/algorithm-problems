/**
 * Leetcode - find_common_characters
 */
package com.algorithm.problems.find_common_characters;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<String> commonChars(String[] words) {
        int[] chArray = new int[26];
        for (char ch : words[0].toCharArray()) chArray[ch - 'a']++;
        for (String word : words) {
            int[] tmp = new int[26];
            for (char ch : word.toCharArray()) tmp[ch - 'a']++;
            for (int i = 0; i < 26; i++) {
                if (tmp[i] < chArray[i]) chArray[i] = tmp[i];
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (chArray[i] != 0) {
                while (chArray[i] > 0) {
                    list.add(Character.valueOf((char) ('a' + i)).toString());
                    chArray[i]--;
                }
            }
        }
        return list;
    }
}
