/**
 * Leetcode - wildcard_matching
 */
package com.algorithm.problems.wildcard_matching;

class Solution3 implements Solution {

    /**
     * 定义遍历s、p的指针sInd、pInd和遇到'*'暂存的临时变量pNext、sLast
     * 遍历字符串s，当s与p在sInd、pInd位置字符相等或者p在pInd字符为'?'时，sInd、pInd右移一位向后遍历
     * 当p在pInd字符为'*'时，暂存当前pInd指向的下一位到pNext，sInd到sLast，即去掉'*'后p下一个与s比较的其他字符
     * 当pNext仍为初始值-1时，则当前sInd、pInd位置字符不匹配且遍历未遇到过'*'，则s、p不匹配
     * 剩下的情况即为当前sInd、pInd位置字符不匹配且遍历遇到过'*'，则需重置pInd为曾经'*'的下一个位置，sInd为暂存的下一个位置
     * 遍历完s之后，如果p还有剩余字符，则需要全为'*'，否则不匹配
     */
    @Override
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int sInd = 0;
        int pInd = 0;
        int pNext = -1;
        int sLast = -1;

        while (sInd < sLen) {
            if (pInd < pLen && (s.charAt(sInd) == p.charAt(pInd) || p.charAt(pInd) == '?')) {
                sInd++;
                pInd++;
            } else if (pInd < pLen && p.charAt(pInd) == '*') {
                pNext = ++pInd;
                sLast = sInd;
            } else if (pNext == -1) {
                return false;
            } else {
                pInd = pNext;
                sInd = ++sLast;
            }
        }
        while (pInd < pLen) {
            if (p.charAt(pInd) != '*') return false;
            pInd++;
        }
        return true;
    }
}
