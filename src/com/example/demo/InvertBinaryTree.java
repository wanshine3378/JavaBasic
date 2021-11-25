package com.example.demo;

/* 二元反轉樹
 * 左邊 小 右邊 大
 * 
 */

public class InvertBinaryTree {
        /* testing for example nodes */
    public static void main(String args[]) 
    { 
        /*       2
         *     1   4
         *       3    5
         *  */
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(2); 
        tree.root.left = new Node(1); 
        tree.root.right = new Node(4); 
        tree.root.right.left = new Node(3); 
        tree.root.right.right = new Node(5); 

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :"); 
        tree.print_tree(); 
        System.out.println(""); 

        /* invert tree */
        tree.invert(); 

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : "); 
        tree.print_tree(); 

    } 
} 



// A node contains the value, left and right pointers
class Node { 
    int data; 
    Node left, right; 


    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 

class BinaryTree 
{ 
    Node root; 

    void invert() 
    { 
        root = invert(root); 
    } 

    Node invert(Node node) 
    { 
        if (node == null) 
            return node; 

        /* recursive calls */
        Node left = invert(node.left); 
        Node right = invert(node.right); 

        /* swap the left and right pointers */
        node.left = right; 
        node.right = left; 

        return node; 
    } 

    void print_tree() 
    { 
        print_tree(root); 
    } 

    // print InOrder binary tree traversal. 
    void print_tree(Node node) 
    { 
        if (node == null) 
            return; 

        print_tree(node.left); 
        System.out.print(node.data + " "); 

        print_tree(node.right); 
    } 
}

// 簡易 解法
//public static TreeNode invertTree(TreeNode root) {
//    if(root == null || root.left == null && root.right == null) {
//        return root;
//    }
//   
//    TreeNode tmp = root.right;
//    root.right = root.left;
//    root.left = tmp;
//    invertTree(root.left);
//    invertTree(root.right);
//   
//    return root;
//}

