/**
 * Leetcode - fizz_buzz
 */
package com.algorithm.problems.fizz_buzz;

import java.util.Arrays;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public List<String> fizzBuzz(int n) {
        String[] array = new String[n];
        Arrays.fill(array, "");
        for (int i = 2; i < n; i = i + 3) {
            array[i] = "Fizz";
        }
        for (int i = 4; i < n; i = i + 5) {
            array[i] += "Buzz";
        }
        for (int i = 0; i < n; i++) {
            if ("".equals(array[i])) array[i] = String.valueOf(i + 1);
        }
        return Arrays.asList(array);
    }
}
