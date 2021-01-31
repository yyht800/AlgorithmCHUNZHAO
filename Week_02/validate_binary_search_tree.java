package com.jyh.deliver.app.week2;


public class validate_binary_search_tree {

    private long last = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) {
            return false;
        }

        if (root.val <= last) return false;

        last = root.val;

        return isValidBST(root.right);
    }
}
