/**
 * Leetcode - index_pairs_of_a_string
 */
package com.algorithm.problems.index_pairs_of_a_string;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    /**
     * 使用Trie字典树存储words，Trie中包含了每一个词的字符顺序路径
     * 遍历text，查找各index开始的词的end index
     */
    @Override
    public int[][] indexPairs(String text, String[] words) {
        Trie trie = new Trie(words);
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            for (int end : trie.endIndexs(text, i)) {
                list.add(new int[]{i, end});
            }
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }

    static class Trie {

        private Node root;

        public Trie(String[] words) {
            this.root = new Node();
            for (String word : words) {
                insert(word);
            }
        }

        private void insert(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (cur.next[ch - 'a'] == null)
                    cur.next[ch - 'a'] = new Node();
                cur = cur.next[ch - 'a'];
            }
            cur.isCompleted = true;
        }

        public List<Integer> endIndexs(String text, int start) {
            List<Integer> list = new ArrayList<>();
            Node cur = root;

            for (int i = start; i < text.length(); i++) {
                char ch = text.charAt(i);
                // 向下没有更长的word了，直接返回
                if (cur.next[ch - 'a'] == null) break;

                cur = cur.next[ch - 'a'];
                // word结束，记录end index
                if (cur.isCompleted) list.add(i);
            }
            return list;
        }

        class Node {

            private Node[] next;

            private boolean isCompleted;

            public Node() {
                this.next = new Node[26];
            }
        }
    }
}
