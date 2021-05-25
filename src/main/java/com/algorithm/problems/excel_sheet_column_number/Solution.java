/**
 * Leetcode - excel_sheet_column_number
 */
package com.algorithm.problems.excel_sheet_column_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int titleToNumber(String columnTitle);
}
