/**
 * Leetcode - design_compressed_string_iterator
 */
package com.algorithm.problems.design_compressed_string_iterator;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public String[] stringIteratorOperate(String[] operate, String[][] data) {
        String[] result = new String[operate.length];
        StringIterator stringIterator = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "StringIterator":
                    stringIterator = new StringIterator(data[i][0]);
                    result[i] = null;
                    break;
                case "next":
                    result[i] = String.valueOf(stringIterator.next());
                    break;
                case "hasNext":
                    result[i] = String.valueOf(stringIterator.hasNext());
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class StringIterator {

        private List<Character> charList = new ArrayList<>();

        private List<Integer> countList = new ArrayList<>();

        private int index = 0;

        public StringIterator(String compressedString) {
            int i = 0;
            while (i < compressedString.length()) {
                charList.add(compressedString.charAt(i++));
                int count = 0;
                while (i < compressedString.length() && Character.isDigit(compressedString.charAt(i))) {
                    count = 10 * count + (compressedString.charAt(i++) - '0');
                }
                countList.add(count);
            }
        }

        public char next() {
            if (!hasNext()) return ' ';
            char value = charList.get(index);
            int count = countList.get(index) - 1;
            countList.set(index, count);
            if (count == 0) index++;
            return value;
        }

        public boolean hasNext() {
            return index < charList.size();
        }
    }
}
