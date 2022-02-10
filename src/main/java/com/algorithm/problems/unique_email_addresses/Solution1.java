/**
 * Leetcode - unique_email_addresses
 */
package com.algorithm.problems.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] emailPart = email.split("@");
            set.add(getLocalName(emailPart[0]) + "@" + emailPart[1]);
        }
        return set.size();
    }

    private String getLocalName(String name) {
        StringBuilder sb = new StringBuilder();
        for (char ch : name.toCharArray()) {
            if (ch == '+') return sb.toString();
            if (ch == '.') continue;
            sb.append(ch);
        }
        return sb.toString();
    }
}
