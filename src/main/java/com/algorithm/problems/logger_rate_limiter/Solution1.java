/**
 * Leetcode - logger_rate_limiter
 */
package com.algorithm.problems.logger_rate_limiter;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public Boolean[] loggerOperate(String[] operate, String[][] data) {
        Boolean[] result = new Boolean[operate.length];
        Logger logger = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "Logger":
                    logger = new Logger();
                    result[i] = null;
                    break;
                case "shouldPrintMessage":
                    result[i] = logger.shouldPrintMessage(Integer.parseInt(data[i][0]), data[i][1]);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class Logger {

        private Map<String, Integer> messageTimeMap;

        public Logger() {
            messageTimeMap = new HashMap<>();
        }

        public boolean shouldPrintMessage(int timestamp, String message) {
            Integer time = messageTimeMap.get(message);
            if (time == null || (timestamp - time) >= 10) {
                messageTimeMap.put(message, timestamp);
                return true;
            } else return false;
        }
    }


}
