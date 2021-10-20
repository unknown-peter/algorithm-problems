/**
 * Leetcode - student_attendance_record_i
 */
package com.algorithm.problems.student_attendance_record_i;

class Solution2 implements Solution {

    @Override
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (++countA > 1) return false;
                countL = 0;
            } else if (s.charAt(i) == 'L') {
                if (++countL > 2) return false;
            } else countL = 0;
        }
        return true;
    }
}
