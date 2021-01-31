package com.jyh.deliver.app.week2;


import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class n_ary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                level.add(temp.val);
                queue.addAll(temp.children);
            }

            res.add(level);

        }

        return res;
    }
}
