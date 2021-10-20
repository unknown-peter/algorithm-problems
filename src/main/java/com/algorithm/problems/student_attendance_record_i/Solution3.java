/**
 * Leetcode - student_attendance_record_i
 */
package com.algorithm.problems.student_attendance_record_i;

class Solution3 implements Solution {

    @Override
    public boolean checkRecord(String s) {
        return !s.matches(".*A.*A.*|.*LLL.*");
    }
}
