/**
 * Leetcode - add_to_array_form_of_integer
 */
package com.algorithm.problems.add_to_array_form_of_integer;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int[] array = new int[Math.max(num.length, 5) + 1];
        int i = num.length - 1;
        int j = array.length - 1;
        int carry = 0;
        while (i >= 0 && k > 0) {
            int sum = num[i--] + k % 10 + carry;
            array[j--] = sum % 10;
            carry = sum / 10;
            k /= 10;
        }

        if (i >= 0) {
            while (i >= 0) {
                int sum = num[i--] + carry;
                array[j--] = sum % 10;
                carry = sum / 10;
            }
        } else if (k > 0) {
            while (k > 0) {
                int sum = k % 10 + carry;
                array[j--] = sum % 10;
                carry = sum / 10;
                k /= 10;
            }
        }
        if (carry > 0) array[j--] = carry;
        for (int m = j + 1; m < array.length; m++) list.add(array[m]);
        return list;
    }
}
