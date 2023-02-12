package com.taekrigi.algorithm.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static com.taekrigi.algorithm.leetcode.dfs.BinarySearchTreeToGreaterSumTree.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinarySearchTreeToGreaterSumTreeTests {

    private static final BinarySearchTreeToGreaterSumTree binarySearchTreeToGreaterSumTree = new BinarySearchTreeToGreaterSumTree();

    @Test
    public void case1() {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(0);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode5.right = treeNode8;

        treeNode7.right = treeNode9;

        TreeNode target = binarySearchTreeToGreaterSumTree.bstToGst(treeNode1);

        assertEquals(target.val, 30);
        assertEquals(target.left.val, 36);
        assertEquals(target.right.val, 21);
        assertEquals(target.left.left.val, 36);
        assertEquals(target.left.right.val, 35);
        assertEquals(target.right.left.val, 26);
        assertEquals(target.right.right.val, 15);
        assertEquals(target.right.right.right.val, 8);
    }

    @Test
    public void case2() {
        TreeNode treeNode = new TreeNode(0, null, new TreeNode(1));

        TreeNode target = binarySearchTreeToGreaterSumTree.bstToGst(treeNode);

        assertEquals(target.val, 1);
        assertNull(target.left);
        assertEquals(target.right.val, 1);
    }
}
