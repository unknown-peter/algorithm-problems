/**
 * Leetcode - keyboard_row
 */
package com.algorithm.problems.keyboard_row;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution2 implements Solution {

    private Set<Character> set1 = new HashSet<Character>() {{
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
    }};

    private Set<Character> set2 = new HashSet<Character>() {{
        add('a');
        add('s');
        add('d');
        add('f');
        add('g');
        add('h');
        add('j');
        add('k');
        add('l');
    }};

    private Set<Character> set3 = new HashSet<Character>() {{
        add('z');
        add('x');
        add('c');
        add('v');
        add('b');
        add('n');
        add('m');
    }};

    @Override
    public String[] findWords(String[] words) {
        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            int one = 0;
            int two = 0;
            int three = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (set1.contains(ch)) one = 1;
                if (set2.contains(ch)) two = 1;
                if (set3.contains(ch)) three = 1;
                if ((one + two + three) > 1) break;
            }
            if ((one + two + three) == 1) wordsList.add(word);
        }
        return wordsList.toArray(new String[0]);
    }
}
