/**
 * Leetcode - largest_triangle_area
 */
package com.algorithm.problems.largest_triangle_area;

class Solution1 implements Solution {

    @Override
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (isCollinear(points[i], points[j], points[k])) continue;
                    double area = calcTriangleArea(points[i], points[j], points[k]);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    private boolean isCollinear(int[] a, int[] b, int[] c) {
        return (b[0] - a[0]) * (c[1] - b[1]) == (c[0] - b[0]) * (b[1] - a[1]);
    }

    private double calcTriangleArea(int[] a, int[] b, int[] c) {
        if (a[0] == b[0]) return (double) Math.abs(a[1] - b[1]) * Math.abs(c[0] - a[0]) / 2;
        if (b[0] == c[0]) return (double) Math.abs(b[1] - c[1]) * Math.abs(a[0] - b[0]) / 2;
        if (c[0] == a[0]) return (double) Math.abs(c[1] - a[1]) * Math.abs(b[0] - c[0]) / 2;
        if (a[1] == b[1]) return (double) Math.abs(a[0] - b[0]) * Math.abs(c[1] - a[1]) / 2;
        if (b[1] == c[1]) return (double) Math.abs(b[0] - c[0]) * Math.abs(a[1] - b[1]) / 2;
        if (c[1] == a[1]) return (double) Math.abs(c[0] - a[0]) * Math.abs(b[1] - c[1]) / 2;

        int maxX = Math.max(Math.max(a[0], b[0]), c[0]);
        int minX = Math.min(Math.min(a[0], b[0]), c[0]);
        int middleX = a[0] + b[0] + c[0] - maxX - minX;
        int maxY = Math.max(Math.max(a[1], b[1]), c[1]);
        int minY = Math.min(Math.min(a[1], b[1]), c[1]);
        int middleY = a[1] + b[1] + c[1] - maxY - minY;
        double triangle1, triangle2, triangle3;
        double rectangle = (maxX - minX) * (maxY - minY);
        if ((a[0] == minX && a[1] == maxY) || (b[0] == minX && b[1] == maxY)
                || (c[0] == minX && c[1] == maxY)) {
            triangle1 = (double) (maxY - minY) * (middleX - minX) / 2;
            triangle2 = (double) (maxX - minX) * (maxY - middleY) / 2;
            triangle3 = (double) (maxX - middleX) * (middleY - minY) / 2;
        } else if ((a[0] == minX && a[1] == minY) || (b[0] == minX && b[1] == minY)
                || (c[0] == minX && c[1] == minY)) {
            triangle1 = (double) (maxY - minY) * (middleX - minX) / 2;
            triangle2 = (double) (maxX - minX) * (middleY - minY) / 2;
            triangle3 = (double) (maxX - middleX) * (maxY - middleY) / 2;
        } else if ((a[0] == maxX && a[1] == minY) || (b[0] == maxX && b[1] == minY)
                || (c[0] == maxX && c[1] == minY)) {
            triangle1 = (double) (maxY - minY) * (maxX - middleX) / 2;
            triangle2 = (double) (maxX - minX) * (middleY - minY) / 2;
            triangle3 = (double) (middleX - minX) * (maxY - middleY) / 2;
        } else {
            triangle1 = (double) (maxY - minY) * (maxX - middleX) / 2;
            triangle2 = (double) (maxX - minX) * (maxY - middleY) / 2;
            triangle3 = (double) (middleX - minX) * (middleY - minY) / 2;
        }
        return rectangle - triangle1 - triangle2 - triangle3;
    }
}
