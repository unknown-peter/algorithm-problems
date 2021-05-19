/**
 * Leetcode - excel_sheet_column_title
 */
package com.algorithm.problems.excel_sheet_column_title;

class Solution4 implements Solution {

    @Override
    public String convertToTitle(int columnNumber) {
        return (columnNumber > 0)
                ? convertToTitle(--columnNumber / 26) + (char) (columnNumber % 26 + 'A')
                : "";
    }
}
