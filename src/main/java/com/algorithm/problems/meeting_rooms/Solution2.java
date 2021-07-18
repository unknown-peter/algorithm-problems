/**
 * Leetcode - meeting_rooms
 */
package com.algorithm.problems.meeting_rooms;

import java.util.Arrays;

class Solution2 implements Solution {

    /**
     * 所有区间按起始时间由小到大排序并遍历，如果当前区间起始时间小于前一区间结束时间，则区间有重叠
     */
    @Override
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] < o2[0]) return -1;
            if (o1[0] > o2[0]) return 1;
            return 0;
        });
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) return false;
        }
        return true;
    }
}
