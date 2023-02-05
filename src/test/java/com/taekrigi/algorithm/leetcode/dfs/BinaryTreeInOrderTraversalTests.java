package com.taekrigi.algorithm.leetcode.dfs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static com.taekrigi.algorithm.leetcode.dfs.BinaryTreeInOrderTraversal.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInOrderTraversalTests {

    private BinaryTreeInOrderTraversal binaryTreeInOrderTraversal = new BinaryTreeInOrderTraversal();

    @Test
    public void case1() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> traversalOrder = binaryTreeInOrderTraversal.inorderTraversal(treeNode1);

        assertEquals(traversalOrder, List.of(1, 3, 2));
    }

    @Test
    public void case2() {
        List<Integer> traversalOrder = binaryTreeInOrderTraversal.inorderTraversal(null);
        assertEquals(traversalOrder, Collections.emptyList());
    }

    @Test
    public void case3() {
        TreeNode treeNode = new TreeNode(1);
        List<Integer> traversalOrder = binaryTreeInOrderTraversal.inorderTraversal(treeNode);
        assertEquals(traversalOrder, List.of(1));
    }
}
