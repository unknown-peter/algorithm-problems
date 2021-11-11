package com.algorithm.util;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AssertClass {

    public static <T> boolean isSameElementList(List<T> actual, List<T> expected) {
        return actual.stream().sorted().map(Objects::toString).collect(Collectors.joining())
                .equals(expected.stream().sorted().map(Objects::toString).collect(Collectors.joining()));
    }

    public static <T> boolean isSameElementList(T[] actual, T[] expected) {
        return Arrays.stream(actual).sorted().map(Objects::toString).collect(Collectors.joining())
                .equals(Arrays.stream(expected).sorted().map(Objects::toString).collect(Collectors.joining()));
    }
}
