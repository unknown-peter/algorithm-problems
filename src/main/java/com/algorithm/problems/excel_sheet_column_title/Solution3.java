/**
 * Leetcode - excel_sheet_column_title
 */
package com.algorithm.problems.excel_sheet_column_title;

class Solution3 implements Solution {

    @Override
    public String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 0) {
            // columnNumber先减一再取余
            res += (char) (--columnNumber % 26 + 'A');
            columnNumber /= 26;
        }
        return new StringBuilder(res).reverse().toString();
    }
}
