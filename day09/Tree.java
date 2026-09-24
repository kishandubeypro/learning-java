

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree {

    static void display(Node root, int space) {

        if (root == null) {
            return;
        }

        // Display right subtree first
        display(root.right, space + 5);

        // Print spaces
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        // Print root
        System.out.println(root.data);

        // Display left subtree
        display(root.left, space + 5);
    }

    public static void main(String[] args) {

        // Creating binary tree
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Display tree
        display(root, 0);
    }
}