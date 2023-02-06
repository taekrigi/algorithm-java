package com.taekrigi.algorithm.leetcode.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/">leetcode</a>
 */
public class BinarySearchTreeToGreaterSumTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Sum {
        int val;
        Sum(int val) {
            this.val = val;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        dfs(root, new Sum(0));
        return root;
    }

    private void dfs(TreeNode node, Sum sum) {
        if (node == null) {
            return;
        }
        dfs(node.right, sum);
        sum.val += node.val;
        node.val = sum.val;
        dfs(node.left, sum);
    }
}