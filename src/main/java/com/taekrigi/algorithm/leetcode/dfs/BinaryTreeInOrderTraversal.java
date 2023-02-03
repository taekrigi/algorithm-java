package com.taekrigi.algorithm.leetcode.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">leetcode</a>
 * @see <a href="https://en.wikipedia.org/wiki/Tree_traversal#Inorder_traversal">wikipedia</a>
 */
public class BinaryTreeInOrderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalOrder = new LinkedList<>();
        traverseByInOrder(traversalOrder, root);
        return traversalOrder;
    }

    private void traverseByInOrder(List<Integer> traversalOrder, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left != null) {
            traverseByInOrder(traversalOrder, treeNode.left);
        }
        traversalOrder.add(treeNode.val);
        if (treeNode.right != null) {
            traverseByInOrder(traversalOrder, treeNode.right);
        }
    }
}