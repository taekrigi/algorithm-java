package com.taekrigi.algorithm.leetcode.dfs;

/**
 * @see <a href="https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/">leetcode</a>
 * @see <a href="https://en.wikipedia.org/wiki/Binary_tree">wikipedia</a>
 */
public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(cloned, target);
    }

    private TreeNode dfs(final TreeNode cloned, final TreeNode target) {
        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }
        TreeNode left = dfs(cloned.left, target);
        TreeNode right = dfs(cloned.right, target);

        return left != null ? left : right;
    }
}
