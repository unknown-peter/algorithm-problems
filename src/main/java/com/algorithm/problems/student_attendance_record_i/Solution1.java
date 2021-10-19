/**
 * Leetcode - student_attendance_record_i
 */
package com.algorithm.problems.student_attendance_record_i;

class Solution1 implements Solution {

    @Override
    public boolean checkRecord(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                if (countA > 1) return false;
            }
        }
        return !s.contains("LLL");
    }
}
