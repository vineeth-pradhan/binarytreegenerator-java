package com.binarytreegenerator;

import java.util.LinkedList;
import com.binarytreegenerator.TreeNode;

public class BinaryTree {
  BinaryTree(Object[] rawData){this.rawData = rawData; construct(); }
  private TreeNode root = new TreeNode();
  LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
  Object[] rawData = new Object[] {};


  public TreeNode getRoot() { return root.left; }

  public void construct() {
    int x = 0, i = 0;
    if(rawData.length > 0){
      root.left = new TreeNode();
      queue.add(root.left);
      while (i < rawData.length) {
        if (rawData[i] != null) {
          TreeNode node = queue.remove();
          node.val = (Integer) rawData[i];
          if (2 * i + 1 - x < rawData.length && rawData[2 * i + 1 - x] != null) {
            node.left = new TreeNode();
            queue.add(node.left);
          } else if (2 * i + 1 - x < rawData.length && rawData[2 * i + 1 - x] == null) {
            node.left = null;
          }

          if (2 * i + 2 - x < rawData.length && rawData[2 * i + 2 - x] != null) {
            node.right = new TreeNode();
            queue.add(node.right);
          } else if (2 * i + 2 - x < rawData.length && rawData[2 * i + 2 - x] == null) {
            node.right = null;
          }
        } else { x += 2; }
        i++;
      }
    }
    else{ root.left = null; }
  }
}
