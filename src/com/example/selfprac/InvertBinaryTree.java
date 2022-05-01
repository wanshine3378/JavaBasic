package com.example.selfprac;

public class InvertBinaryTree {
    
    public static void main(String[] args) {
        
        
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
    
}

class BinaryTree {
    
    Node root;
    
    void invert() {
       root = invert(root);
    }
    
    Node invert(Node node) {
        if(node == null)
            return node;
        
        Node left = invert(node.left);
        Node right = invert(node.right);
        
       node.left = right;
       node.right = left;
       
       return node;
    }
    
    void print_tree() {
        if(node == null) 
            return;
        
        print_tree(node.left);
        System.out.println(node.data + " ");
        
        print_tree(node.right);
    }
    
}
