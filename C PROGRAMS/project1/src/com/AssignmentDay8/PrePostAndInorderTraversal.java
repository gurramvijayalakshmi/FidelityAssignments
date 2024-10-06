package com.AssignmentDay8;

class Node {
    String value;
    Node left, right;

    public Node(String item) {
        value = item;
        left = right = null;
    }
}

public class PrePostAndInorderTraversal {
    Node root;


    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }


    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }


    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        PrePostAndInorderTraversal tree = new PrePostAndInorderTraversal();


        tree.root = new Node("-");
        tree.root.left = new Node("+");
        tree.root.right = new Node("3");
        tree.root.left.left = new Node("10");
        tree.root.left.right = new Node("*");
        tree.root.left.right.left = new Node("2");
        tree.root.left.right.right = new Node("8");

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}