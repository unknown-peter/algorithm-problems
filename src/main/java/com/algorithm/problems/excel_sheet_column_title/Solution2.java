/**
 * Leetcode - excel_sheet_column_title
 */
package com.algorithm.problems.excel_sheet_column_title;

class Solution2 implements Solution {

    @Override
    public String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 0) {
            // 如果能整除26，该位为'Z'，columnNumber减去26向前借位
            if (columnNumber % 26 == 0) {
                res += 'Z';
                columnNumber -= 26;
            } else {
                res += (char) (columnNumber % 26 - 1 + 'A');
                columnNumber -= columnNumber % 26;
            }
            columnNumber /= 26;
        }
        return new StringBuilder(res).reverse().toString();
    }
}
