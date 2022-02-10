/**
 * Leetcode - unique_email_addresses
 */
package com.algorithm.problems.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

class Solution3 implements Solution {

    /**
     * 使用djb2算法生成每个email的hash存入set，获取set个数
     */
    @Override
    public int numUniqueEmails(String[] emails) {
        Set<Integer> set = new HashSet<>();
        for (String email : emails) {
            set.add(computeEmailHash(email));
        }
        return set.size();
    }

    private int computeEmailHash(String email) {
        int hash = 5381;
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '.') continue;
            else if (ch == '@' || ch == '+') break;
            // hash * 33 + c
            hash = (hash << 5) + hash + ch;
        }
        for (int i = email.length() - 1; i >= 0; i--) {
            char ch = email.charAt(i);
            if (ch == '@') break;
            // hash * 33 + c
            hash = (hash << 5) + hash + ch;
        }
        return hash;
    }
}
