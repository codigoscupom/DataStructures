package com.neilson.commons.com.neilson.commons.tree;

/**
 * Created by neilson on 1/13/15.
 */
public class Tree {
    public TNode root;

    public Tree(Integer value) {
        root = new TNode(value);
    }

    public Tree() {
    }

    public TNode insertNode(TNode root, Integer value) {
        if (root == null) {
            root = new TNode(value);
            return root;
        }

        if (value < root.value) {
            root.left =  insertNode(root.left, value);
        } else {
            root.right =  insertNode(root.right, value);
        }
        return root;

    }


    public void printPreOrder(TNode root) {
        if (root == null) {
            return;
        }
        printPreOrder(root.left);
        System.out.println(root.value);
        printPreOrder(root.right);
    }

   //TODO: implement toArrayPreOrder and others.
}
