package com.jyh.deliver.app.week2;


import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class n_ary_tree_postorder_traversal {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        for (Node child : root.children) {
            res.addAll(postorder(child));
        }
        res.add(root.val);

        return res;
    }

    public List<Integer> postorder2(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            res.addFirst(temp.val);
            for (Node child : temp.children) {
                stack.push(child);
            }
        }
        return res;
    }
}
