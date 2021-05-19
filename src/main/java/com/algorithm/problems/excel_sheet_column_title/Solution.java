/**
 * Leetcode - excel_sheet_column_title
 */
package com.algorithm.problems.excel_sheet_column_title;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String convertToTitle(int columnNumber);
}
