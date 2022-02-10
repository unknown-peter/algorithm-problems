/**
 * Leetcode - unique_email_addresses
 */
package com.algorithm.problems.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

class Solution2 implements Solution {

    @Override
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] emailPart = email.split("@");
            String[] localName = emailPart[0].split("\\+");
            set.add(localName[0].replace(".", "") + "@" + emailPart[1]);
        }
        return set.size();
    }
}
