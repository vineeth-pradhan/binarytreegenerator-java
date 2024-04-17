package com.binarytreegenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BinaryTreeTest {
  @Test
  public void testShortDenerateBinaryTree(){
    BinaryTree tree = new BinaryTree(new Object[]{ 1, null, 2, 3 });
    assertArrayEquals(tree.inorderTraversal(tree.getRoot()).toArray(), new Object[] { 1, 3, 2 });
  }

  @Test
  public void testMediumShortDegenerateBinaryTree(){
    BinaryTree tree = new BinaryTree(new Object[]{ 3, 0, 2, 5, 6, 7, 8, null, null, 9, 10 });
    assertArrayEquals(tree.inorderTraversal(tree.getRoot()).toArray(), new Object[] { 5, 0, 9, 6, 10, 3, 7, 2, 8 });
  }

  @Test
  public void testMediumFullBinaryTree(){
    BinaryTree tree = new BinaryTree(new Object[]{ 10, 4, 17, 1, 5, 16, 21 });
    assertArrayEquals(tree.inorderTraversal(tree.getRoot()).toArray(), new Object[] { 1, 4, 5, 10, 16, 17, 21 });
  }

  @Test
  public void testLeftSkewedBinaryTree(){
    BinaryTree tree = new BinaryTree(new Object[]{ 10, 8, null, 6, null, 4, null });
    assertArrayEquals(tree.inorderTraversal(tree.getRoot()).toArray(), new Object[] { 4, 6, 8, 10 });
  }

  @Test
  public void testRightSkewedBinaryTree(){
    BinaryTree tree = new BinaryTree(new Object[]{ 10, null, 8, null, 6, null, 4 });
    assertArrayEquals(tree.inorderTraversal(tree.getRoot()).toArray(), new Object[] { 10, 8, 6, 4 });
  }
}