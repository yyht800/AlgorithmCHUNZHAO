package com.jyh.deliver.app.week2;


public class invert_binary_tree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode node = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(node);

        return root;
    }
}
