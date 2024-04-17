package com.binarytreegenerator;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() { }
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public int getVal(){ return this.val; }
  public TreeNode getLeft() { return this.left; }
  public TreeNode getRight() { return this.right; }
}
