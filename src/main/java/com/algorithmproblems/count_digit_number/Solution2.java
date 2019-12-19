/**
 * Leetcode - count_digit_number
 */
package com.algorithmproblems.count_digit_number;

class Solution2 implements Solution {

    /**
     * 由低位到高位递归计算对应位整数含有digit的奇/偶数并相加
     * 若C(n)为n位数中digit的数量, S(n)=C(n)+C(n-1)+...+C(1), 则有C(n+1)=9*S(n)+5*10^(n-1)  (digit≠0)
     */
    @Override
    public int count(int num, int digit, boolean isOdd) {
        if ((num < 0) || (digit < 0) || (digit > 9)) {
            throw new RuntimeException("argument illegal");
        }
        if (digit == 0) {
            // TODO:
            return 0;
        } else {
            int count = 0;
            int digitSum = 0;
            // 初始化个位
            // 如果查找偶数中的偶数digit 或 查找奇数中的奇数digit,则个位数的digit数量为1
            // 如果num的个位数大于等于digit，则计数加1
            if (((digit % 2 == 1) && isOdd) || ((digit % 2 == 0) && (!isOdd))) {
                digitSum = 1;
                if ((num % 10) >= digit) {
                    count++;
                }
            }
            int i = 1;
            int numDivide = num / 10;
            int m;
            while (numDivide > 0) {
                m = numDivide % 10;
                // 从低到高将每位整数内含有的digit数量相加
                if (m > digit) {
                    // 若位数字m大于digit，则该位整数内的digit数量为 (m-1)*S(n)+5*10^(n-1)+S(n)=m*S(n)+5*10^(n-1)
                    count += m * digitSum + 5 * Math.pow(10, (i - 1));
                } else if (m < digit) {
                    // 若位数字m小于digit，则该位整数内的digit数量为 (m-1)*S(n)+S(n)=m*S(n)
                    count += m * digitSum;
                } else {
                    // 若位数字m等于digit；如果只查找奇数，则该位整数内的digit数量为 (m-1)*S(n)+S(n)=m*S(n)
                    // 如果只查找偶数，需要加上该位整数中的digit，digit数量为(m-1)*S(n)+S(n)+1=m*S(n)+1
                    if (isOdd) {
                        count += m * digitSum;
                    } else {
                        count += m * digitSum + 1;
                    }
                    // 位数字m等于digit时，还需要考虑其后的digit数量
                    int remain = num % (int) Math.pow(10, i);
                    if ((remain % 2 == 1) && isOdd) {
                        count += remain / 2 + 1;
                    } else {
                        count += remain / 2;
                    }
                }
                // 计算C(n)
                digitSum += (int) (9 * digitSum + 5 * Math.pow(10, (i - 1)));
                numDivide /= 10;
                i++;
            }
            return count;
        }
    }

}
