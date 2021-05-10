/**
 * Leetcode - read_n_characters_given_read4
 */
package com.algorithm.problems.read_n_characters_given_read4;

import com.algorithm.util.FileOperateClass;

class Solution1 implements Solution {

    FileOperateClass file;

    @Override
    public void setFile(FileOperateClass file) {
        this.file = file;
    }

    @Override
    public int read(char[] buf, int n) {
        if (n <= 0) return 0;

        char[] read4Buf = new char[4];
        int read4Len;
        int readLen = 0;
        for (int i = 0; i < n && i < buf.length; i = i + 4) {
            read4Len = file.read4(read4Buf);
            System.arraycopy(read4Buf, 0, buf, i, Math.min(read4Len, n - i));
            readLen += Math.min(read4Len, n - i);
        }
        return readLen;
    }
}
