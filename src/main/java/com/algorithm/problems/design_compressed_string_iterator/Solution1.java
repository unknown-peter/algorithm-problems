/**
 * Leetcode - design_compressed_string_iterator
 */
package com.algorithm.problems.design_compressed_string_iterator;

class Solution1 implements Solution {

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

        private char[] strArray;

        private int index;

        private char value;

        private int count;

        public StringIterator(String compressedString) {
            strArray = compressedString.toCharArray();
            index = 0;
            value = strArray[0];
            count = 0;
        }

        public char next() {
            if (!hasNext()) return ' ';

            if (count == 0) {
                value = strArray[index++];
                while (index < strArray.length && Character.isDigit(strArray[index])) {
                    count = 10 * count + (strArray[index++] - '0');
                }
                count--;
            } else count--;

            return value;
        }

        public boolean hasNext() {
            return count > 0 || index < strArray.length;
        }
    }
}
