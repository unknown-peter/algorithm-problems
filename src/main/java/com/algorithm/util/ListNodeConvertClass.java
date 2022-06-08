package com.algorithm.util;

import com.ciaoshen.leetcode.util.ListNode;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.List;

public class ListNodeConvertClass {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static ListNode stringToListNode(String input, int pos) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        if (pos != -1) {
            ListNode node = dummyRoot.next;
            for (int i = 0; i < pos; i++) {
                node = node.next;
            }
            ptr.next = node;
        }
        return dummyRoot.next;
    }

    public static ListNode[] stringToListNodeArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);

        int left = 0;
        List<ListNode> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[') left = i;
            else if (input.charAt(i) == ']') list.add(stringToListNode(input.substring(left, i + 1)));
        }

        ListNode[] arr = new ListNode[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ",";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    public static String listNodeToString(ListNode node, int pos) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        ListNode cycleIn = node;
        for (int i = 0; i < pos; i++) {
            cycleIn = cycleIn.next;
        }
        while (node != null) {
            result += Integer.toString(node.val) + ",";
            node = node.next;
            if (cycleIn.equals(node)) break;
        }
        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    public static Triple<ListNode, ListNode, ListNode> intersectionListNodes(int val, String listA, String listB,
                                                                             int skipA, int skipB) {
        if (val == 0) {
            ListNode listNodeA = stringToListNode(listA);
            ListNode listNodeB = stringToListNode(listB);
            return new ImmutableTriple<>(listNodeA, listNodeB, null);
        }

        int[] listAValues = stringToIntegerArray(listA);
        int[] listBValues = stringToIntegerArray(listB);
        ListNode listADummyRoot = new ListNode(0);
        ListNode listBDummyRoot = new ListNode(0);
        ListNode ptrA = listADummyRoot;
        ListNode ptrB = listBDummyRoot;
        for (int i = 0; i < skipA; i++) {
            ptrA.next = new ListNode(listAValues[i]);
            ptrA = ptrA.next;
        }
        for (int i = 0; i < skipB; i++) {
            ptrB.next = new ListNode(listBValues[i]);
            ptrB = ptrB.next;
        }
        for (int i = skipA, j = skipB; i < listAValues.length && j < listBValues.length; i++, j++) {
            ListNode intersectionNode = new ListNode(listAValues[i]);
            ptrA.next = intersectionNode;
            ptrA = ptrA.next;
            ptrB.next = intersectionNode;
            ptrB = ptrB.next;
        }
        ListNode node = listADummyRoot;
        for (int i = 0; i <= skipA; i++) {
            node = node.next;
        }
        return new ImmutableTriple<>(listADummyRoot.next, listBDummyRoot.next, node);
    }

    public static ListNode getNode(ListNode head, int val) {
        ListNode p = head;
        while (p != null) {
            if (p.val == val) return p;
            p = p.next;
        }
        return null;
    }
}
