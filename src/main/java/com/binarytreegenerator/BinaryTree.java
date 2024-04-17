package com.binarytreegenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class BinaryTree {
  LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
  List<Integer> list = new ArrayList<Integer>();
  TreeNode root = new TreeNode();
  Object[] rawData = new Object[] {};

  BinaryTree(Object[] rawData){this.rawData = rawData; construct(); }

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
        } else {
          x += 2;
        }
        i++;
      }
      System.out.println(inorderTraversal(root.left));
    }
    else{
      root.left = null;
      System.out.println(inorderTraversal(root.left));
    }
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    if(root != null){
      inorderTraversal(root.left);
      this.list.add(root.val);
      inorderTraversal(root.right);
    }
    return list;
  }
}
