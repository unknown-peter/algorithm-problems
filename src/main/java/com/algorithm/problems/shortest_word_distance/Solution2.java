/**
 * Leetcode - shortest_word_distance
 */
package com.algorithm.problems.shortest_word_distance;

class Solution2 implements Solution {

    /**
     * 使用一个变量记录index，遍历数组。遇到和两个单词相等的时候判断index是否为-1，
     * 不为-1且当前单词和index处单词不相同则计算距离更新结果
     */
    @Override
    public int shortestDistance(String[] words, String word1, String word2) {
        int index = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1) || words[i].equals(word2)) {
                if (index != -1 && !words[index].equals(words[i])) {
                    distance = Math.min(distance, i - index);
                }
                index = i;
            }
        }
        return distance;
    }
}
