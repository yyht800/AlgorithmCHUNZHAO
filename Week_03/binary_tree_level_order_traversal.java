package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binary_tree_level_order_traversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.offerLast(temp.left);
                if (temp.right != null) queue.offerLast(temp.right);
                list.add(temp.val);
            }
            res.add(list);
        }

        return res;
    }
}
