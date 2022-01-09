/**
 * Leetcode - rotate_string
 */
package com.algorithm.problems.rotate_string;

import java.math.BigInteger;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * hash(S) = (S[0] * P**0 + S[1] * P**1 + S[2] * P**2 + ...) % MOD
     * hash(S[1]) = (hash(S) - S[0]) / P + S[0] * P**(N-1)
     */
    @Override
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;

        int MOD = 1_000_000_007;
        int P = 113;
        int Pinv = BigInteger.valueOf(P).modInverse(BigInteger.valueOf(MOD)).intValue();

        long hb = 0, power = 1;
        for (char x : B.toCharArray()) {
            hb = (hb + power * x) % MOD;
            power = power * P % MOD;
        }

        long ha = 0;
        power = 1;
        char[] ca = A.toCharArray();
        for (char x : ca) {
            ha = (ha + power * x) % MOD;
            power = power * P % MOD;
        }

        for (int i = 0; i < ca.length; ++i) {
            char x = ca[i];
            ha += power * x - x;
            ha %= MOD;
            ha *= Pinv;
            ha %= MOD;
            if (ha == hb && (A.substring(i + 1) + A.substring(0, i + 1)).equals(B))
                return true;
        }
        return false;
    }
}
