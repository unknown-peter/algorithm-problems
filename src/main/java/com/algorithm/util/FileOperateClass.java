package com.algorithm.util;

import org.apache.commons.lang3.StringUtils;

public class FileOperateClass {

    private String file;

    private int pointer;

    public FileOperateClass(String file) {
        this.file = file;
        this.pointer = 0;
    }

    public int read4(char[] buf) {
        if (StringUtils.isBlank(file)) return 0;
        int begin = pointer;
        int end = Math.min((pointer + 4), file.length());
        String readStr = file.substring(begin, end);
        pointer += 4;
        System.arraycopy(readStr.toCharArray(), 0, buf, 0, end - begin);
        return end - begin;
    }
}
