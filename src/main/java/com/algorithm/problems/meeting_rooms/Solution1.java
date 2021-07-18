/**
 * Leetcode - meeting_rooms
 */
package com.algorithm.problems.meeting_rooms;

class Solution1 implements Solution {

    @Override
    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if ((intervals[i][0] > intervals[j][0] && intervals[i][0] < intervals[j][1])
                        || (intervals[j][0] > intervals[i][0] && intervals[j][0] < intervals[i][1])) return false;
            }
        }
        return true;
    }
}
