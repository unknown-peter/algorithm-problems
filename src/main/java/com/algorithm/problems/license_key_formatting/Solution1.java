/**
 * Leetcode - license_key_formatting
 */
package com.algorithm.problems.license_key_formatting;

class Solution1 implements Solution {

    @Override
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') continue;
            sb.append(Character.toUpperCase(s.charAt(i)));
            count++;
            if (count == k) {
                sb.append('-');
                count = 0;
            }
        }
        String res = sb.reverse().toString();
        if ("".equals(res)) return "";
        return (res.charAt(0) == '-') ? res.substring(1) : res;
    }
}
