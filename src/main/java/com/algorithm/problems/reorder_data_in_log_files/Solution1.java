/**
 * Leetcode - reorder_data_in_log_files
 */
package com.algorithm.problems.reorder_data_in_log_files;

import java.util.*;

class Solution1 implements Solution {

    @Override
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogList = new ArrayList<>();
        TreeSet<String> contentSet = new TreeSet<>();
        Map<String, TreeSet<String>> contentIdentifiersMap = new HashMap<>();
        for (String log : logs) {
            if (Character.isLetter(log.charAt(log.length() - 1))) {
                String identifier = log.substring(0, log.indexOf(' ') + 1);
                String content = log.substring(log.indexOf(' ') + 1);
                if (contentSet.contains(content)) {
                    contentIdentifiersMap.get(content).add(identifier);
                } else {
                    contentSet.add(content);
                    TreeSet<String> treeSet = new TreeSet<>();
                    treeSet.add(identifier);
                    contentIdentifiersMap.put(content, treeSet);
                }
            } else digitLogList.add(log);
        }

        String[] res = new String[logs.length];
        int i = 0;
        for (String content : contentSet) {
            TreeSet<String> identifiers = contentIdentifiersMap.get(content);
            for (String identifier : identifiers) {
                res[i++] = identifier + content;
            }
        }
        for (String log : digitLogList) res[i++] = log;
        return res;
    }
}
