/**
 * Leetcode - similar_rgb_color
 */
package com.algorithm.problems.similar_rgb_color;

class Solution1 implements Solution {

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
     * 计算色值首位数字d、d-1、d+1处的距离找出最小的
     */
    private String getSimilar(String colorValue) {
        char high = colorValue.charAt(0);
        int abs = Math.abs(Integer.parseInt(Character.toString(high), 16) -
                Integer.parseInt(Character.toString(colorValue.charAt(1)), 16));
        String res = new String(new char[]{high, high});
        if (high > '0') {
            char ch = (high == 'a') ? '9' : (char) (high - 1);
            String curSimilar = new String(new char[]{ch, ch});
            int tmpAbs = Integer.parseInt(colorValue, 16) - Integer.parseInt(curSimilar, 16);
            if (tmpAbs < abs) {
                abs = tmpAbs;
                res = curSimilar;
            }
        }
        if (high < 'f') {
            char ch = (high == '9') ? 'a' : (char) (high + 1);
            String curSimilar = new String(new char[]{ch, ch});
            int tmpAbs = Integer.parseInt(curSimilar, 16) - Integer.parseInt(colorValue, 16);
            if (tmpAbs < abs) {
                abs = tmpAbs;
                res = curSimilar;
            }
        }
        return res;
    }
}
