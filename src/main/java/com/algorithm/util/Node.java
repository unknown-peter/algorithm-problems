package com.algorithm.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {

    public int val;

    public List<Node> children = new ArrayList<>();

    public Node(int val) {
        this.val = val;
    }

    public static Node stringToNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        Node root = new Node(Integer.parseInt(item));
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        item = parts[index++];
        item = item.trim();
        while (index < parts.length && item.equals("null")) {
            item = parts[index++];
            item = item.trim();
        }

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.remove();

            while (!item.equals("null")) {
                int childrenNumber = Integer.parseInt(item);
                Node childrenNode = new Node(childrenNumber);
                node.children.add(childrenNode);
                nodeQueue.add(childrenNode);
                if (index == parts.length) break;
                item = parts[index++];
                item = item.trim();
            }

            if (index == parts.length) {
                break;
            }

            if (item.equals("null")) {
                item = parts[index++];
                item = item.trim();
            }
        }
        return root;
    }
}
