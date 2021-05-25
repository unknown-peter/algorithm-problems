/**
 * Leetcode - excel_sheet_column_number
 */
package com.algorithm.problems.excel_sheet_column_number;

class Solution1 implements Solution {

    @Override
    public int titleToNumber(String columnTitle) {
        int num = 0;
        int charLen = columnTitle.length();
        for (int i = 0; i < charLen; i++) {
            num *= 26;
            num += columnTitle.charAt(i) - 'A' + 1;
        }
        return num;
    }
}
