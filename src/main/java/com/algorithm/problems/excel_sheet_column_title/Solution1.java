/**
 * Leetcode - excel_sheet_column_title
 */
package com.algorithm.problems.excel_sheet_column_title;

class Solution1 implements Solution {

    @Override
    public String convertToTitle(int columnNumber) {
        int divisor = columnNumber;
        int remainder;
        int borrow = 0;
        String title = "";
        while (divisor > 0) {
            remainder = divisor % 26;
            divisor /= 26;
            if (remainder - borrow <= 0) {
                if (divisor == 0) break;
                title += (char) ('Z' + remainder - borrow);
                borrow = 1;
            } else {
                title += (char) ('A' + remainder - borrow - 1);
                borrow = 0;
            }
        }
        return new StringBuilder(title).reverse().toString();
    }
}
