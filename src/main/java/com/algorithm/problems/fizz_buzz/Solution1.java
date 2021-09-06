/**
 * Leetcode - fizz_buzz
 */
package com.algorithm.problems.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0) {
                if ((i + 1) % 5 == 0) list.add("FizzBuzz");
                else list.add("Fizz");
            } else if ((i + 1) % 5 == 0) list.add("Buzz");
            else list.add(String.valueOf(i + 1));
        }
        return list;
    }
}
