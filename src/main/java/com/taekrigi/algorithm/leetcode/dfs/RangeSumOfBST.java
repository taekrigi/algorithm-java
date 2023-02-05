package com.taekrigi.algorithm.leetcode.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/range-sum-of-bst/description/">leetcode</a>
 * @see <a href="https://en.wikipedia.org/wiki/Binary_search_tree">wikipedia</a>
 */
public class RangeSumOfBST {

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

    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high, 0);
    }

    private int dfs(TreeNode root, int low, int high, int sum) {
        if (root == null) {
            return sum;
        }
        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }
        sum = dfs(root.left, low, high, sum);
        sum = dfs(root.right, low, high, sum);

        return sum;
    }
}