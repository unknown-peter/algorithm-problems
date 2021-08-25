/**
 * Leetcode - binary_watch
 */
package com.algorithm.problems.binary_watch;

import java.util.*;

class Solution1 implements Solution {

    private Map<Integer, List<String>> hourMap = new HashMap<Integer, List<String>>() {
        {
            put(0, Arrays.asList("0"));
            put(1, Arrays.asList("1", "2", "4", "8"));
            put(2, Arrays.asList("3", "5", "6", "9", "10"));
            put(3, Arrays.asList("7", "11"));
        }
    };

    private Map<Integer, List<String>> minuteMap = new HashMap<Integer, List<String>>() {
        {
            put(0, Arrays.asList(":00"));
            put(1, Arrays.asList(":01", ":02", ":04", ":08", ":16", ":32"));
            put(2, Arrays.asList(":03", ":05", ":06", ":09", ":10", ":12", ":17", ":18", ":20", ":24", ":33", ":34", ":36", ":40", ":48"));
            put(3, Arrays.asList(":07", ":11", ":13", ":14", ":19", ":21", ":22", ":25", ":26", ":28", ":35", ":37", ":38", ":41", ":42", ":44", ":49", ":50", ":52", ":56"));
            put(4, Arrays.asList(":15", ":23", ":27", ":29", ":30", ":39", ":43", ":45", ":46", ":51", ":53", ":54", ":57", ":58"));
            put(5, Arrays.asList(":31", ":47", ":55", ":59"));
        }
    };

    @Override
    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 8) return new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            List<String> hours = hourMap.get(i);
            List<String> minutes = minuteMap.get(turnedOn - i);
            if (hours != null && minutes != null) {
                for (String h : hours) {
                    for (String m : minutes) {
                        list.add(h + m);
                    }
                }
            }
        }
        return list;
    }
}
