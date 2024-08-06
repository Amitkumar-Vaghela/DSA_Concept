// Node class represents a single node in the tree
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

// RecursiveTree class represents the tree itself
class RecursiveTree {
    Node root;

    public RecursiveTree() {
        root = null;
    }

    // Recursive method to insert a new node into the tree
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Recursive helper method to insert a new node into the tree
    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    // Recursive method to traverse the tree in-order (left, root, right)
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    // Recursive helper method to traverse the tree in-order
    private void inOrderTraversalRecursive(Node current) {
        if (current != null) {
            inOrderTraversalRecursive(current.left);
            System.out.print(current.value + " ");
            inOrderTraversalRecursive(current.right);
        }
    }
// main method
    public static void main(String[] args) {
    RecursiveTree tree = new RecursiveTree();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    tree.inOrderTraversal(); // prints: 2 3 4 5 6 7 8
}
}
