/**
 * Leetcode - keyboard_row
 */
package com.algorithm.problems.keyboard_row;

import java.util.*;

class Solution1 implements Solution {

    private List<Set<Character>> charSetList = Arrays.asList(
            new HashSet<Character>() {{
                add('q');
                add('w');
                add('e');
                add('r');
                add('t');
                add('y');
                add('u');
                add('i');
                add('o');
                add('p');
            }},
            new HashSet<Character>() {{
                add('a');
                add('s');
                add('d');
                add('f');
                add('g');
                add('h');
                add('j');
                add('k');
                add('l');
            }},
            new HashSet<Character>() {{
                add('z');
                add('x');
                add('c');
                add('v');
                add('b');
                add('n');
                add('m');
            }});

    @Override
    public String[] findWords(String[] words) {
        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            Set<Character> set = charSetList.stream().filter(charSet -> charSet.contains(Character.toLowerCase(word.charAt(0)))).findFirst().get();
            int i = 0;
            for (; i < word.length(); i++) {
                if (!set.contains(Character.toLowerCase(word.charAt(i)))) break;
            }
            if (i == word.length()) wordsList.add(word);
        }
        return wordsList.toArray(new String[0]);
    }
}
