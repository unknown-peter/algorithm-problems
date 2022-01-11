/**
 * Leetcode - similar_rgb_color
 */
package com.algorithm.problems.similar_rgb_color;

class Solution3 implements Solution {

    private final String hexString = "0123456789abcdef";

    /**
     * 各个相似色值之间均相差17(0x11)，因此每个色值除以17判断当前到哪个字符，余数是否大于8判断是否需要加1
     */
    @Override
    public String similarRGB(String color) {
        if (color == null || color.length() != 7) return "";

        StringBuilder sb = new StringBuilder("#");
        for (int i = 1; i < 7; i += 2) {
            int num = Integer.parseInt(color.substring(i, i + 2), 16);
            int idx = num / 17 + (num % 17 > 8 ? 1 : 0);
            sb.append(hexString.charAt(idx)).append(hexString.charAt(idx));
        }
        return sb.toString();
    }
}
