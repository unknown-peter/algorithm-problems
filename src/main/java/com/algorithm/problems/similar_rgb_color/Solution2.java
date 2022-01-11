/**
 * Leetcode - similar_rgb_color
 */
package com.algorithm.problems.similar_rgb_color;

class Solution2 implements Solution {

    @Override
    public String similarRGB(String color) {
        if (color == null || color.length() != 7) return "";

        StringBuilder sb = new StringBuilder("#");
        for (int i = 1; i < 7; i += 2) {
            String similar = getSimilar(color.substring(i, i + 2));
            sb.append(similar);
        }
        return sb.toString();
    }

    /**
     * 色值为xy，当首位x是0-6，若abs(x-y)>8，则x+1组成的两位色值最相似；否则xx最相似
     * 当首位x是7或8时，只有xx最相似
     * 当首位x是9、a-f时，若abs(x-y)>8，则x-1组成的两位色值最相似；否则xx最相似
     * 0 1 2 3 4 5 6 7 8 9 a b c d e f
     */
    private String getSimilar(String colorValue) {
        char high = colorValue.charAt(0);
        char low = colorValue.charAt(1);
        int highValue = Integer.parseInt(new String(new char[]{high}), 16);
        int lowValue = Integer.parseInt(new String(new char[]{low}), 16);

        if (high == '7' || high == '8') return new String(new char[]{high, high});
        if (high >= '0' && high <= '6') return Math.abs(highValue - lowValue) > 8
                ? new String(new char[]{(char) (high + 1), (char) (high + 1)})
                : new String(new char[]{high, high});
        if (high == 'a') return Math.abs(highValue - lowValue) > 8 ? "99" : "aa";
        return Math.abs(highValue - lowValue) > 8
                ? new String(new char[]{(char) (high - 1), (char) (high - 1)})
                : new String(new char[]{high, high});
    }
}
