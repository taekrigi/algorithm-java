package com.taekrigi.algorithm.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static com.taekrigi.algorithm.leetcode.dfs.RangeSumOfBST.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumOfBSTTests {

    private static final RangeSumOfBST rangeSumOfBST = new RangeSumOfBST();

    @Test
    public void case1() {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(18);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;

        int sum = rangeSumOfBST.rangeSumBST(treeNode1, 7, 15);

        assertEquals(sum, 32);
    }

    @Test
    public void case2() {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(13);
        TreeNode treeNode7 = new TreeNode(18);
        TreeNode treeNode8 = new TreeNode(1);
        TreeNode treeNode9 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;
        treeNode5.left = treeNode9;

        int sum = rangeSumOfBST.rangeSumBST(treeNode1, 6, 10);

        assertEquals(sum, 23);
    }
}
