/**
 * Leetcode - perfect_number
 */
package com.algorithm.problems.perfect_number;

class Solution1 implements Solution {

    @Override
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;

//        if (num <= 0) {
//            return false;
//        }
//        int sum = 0;
//        for (int i = 1; i * i <= num; i++) {
//            if (num % i == 0) {
//                sum += i;
//                if (i * i != num) {
//                    sum += num / i;
//                }
//
//            }
//        }
//        return sum - num == num;
    }
}
