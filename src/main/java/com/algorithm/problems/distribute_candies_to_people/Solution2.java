/**
 * Leetcode - distribute_candies_to_people
 */
package com.algorithm.problems.distribute_candies_to_people;

class Solution2 implements Solution {

    /**
     * 糖果的分配遵循1+2+3+...+n的等差数列，由等差数列公式(1+n)*n/2 <= candies，则有n^2+n-2*candies<=0
     * 由一元二次方程求根公式ax^2+bx+c=0，x=(-b±(b^2-4ac)^1/2)/2a 则n<=((1+8candies)^1/2-1)/2
     * 求出n，则根据人数排列共有n/num_people整行另加n%num_people列，如果candies-(1+n)*n/2还有剩余则还会再加剩余一列
     * 则对于每个人i都有(i+1+i+1+(row-1)*num_people)*row/2颗糖，如果是另加的列再加上i+1+row*num_people
     * 如果是最后一列则是加上最后剩余的
     */
    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int n = (int) (Math.sqrt(0.25 + 2 * candies) - 0.5);
        int row = n / num_people;
        int remain = n % num_people;
        int last = candies - (1 + n) * n / 2;
        int[] res = new int[num_people];

        for (int i = 0; i < num_people; i++) {
            if (i < remain) {
                res[i] = (2 * i + 2 + (row - 1) * num_people) * row / 2 + i + 1 + row * num_people;
            } else if (i == remain) {
                res[i] = (2 * i + 2 + (row - 1) * num_people) * row / 2 + last;
            } else {
                res[i] = (2 * i + 2 + (row - 1) * num_people) * row / 2;
            }
        }
        return res;
    }
}
