package com.taekrigi.algorithm.leetcode.dfs;

import org.junit.jupiter.api.Test;
import static com.taekrigi.algorithm.leetcode.dfs.FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeTests {

    private static final FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree findCorrespondingNodeOfBinaryTreeInCloneOfThatTree =
            new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree();


    @Test
    public void case1() {
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(19);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        TreeNode target = treeNode3;

        TreeNode targetCopy = findCorrespondingNodeOfBinaryTreeInCloneOfThatTree.getTargetCopy(null, treeNode1, target);

        assertEquals(targetCopy, target);
    }

    @Test
    public void case2() {
        TreeNode treeNode = new TreeNode(7);
        TreeNode target = treeNode;

        TreeNode targetCopy = findCorrespondingNodeOfBinaryTreeInCloneOfThatTree.getTargetCopy(null, treeNode, target);

        assertEquals(targetCopy, target);
    }

    @Test
    public void case3() {
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(1);

        treeNode1.right = treeNode2;
        treeNode2.right = treeNode3;
        treeNode3.right = treeNode4;
        treeNode4.right = treeNode5;
        treeNode5.right = treeNode6;
        treeNode6.right = treeNode7;

        TreeNode target = treeNode4;

        TreeNode targetCopy = findCorrespondingNodeOfBinaryTreeInCloneOfThatTree.getTargetCopy(null, treeNode1, target);

        assertEquals(targetCopy, target);
    }

}
