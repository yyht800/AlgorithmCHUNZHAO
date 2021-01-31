package com.jyh.deliver.app.week2;


public class maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
