class BTraversal {
    int data;
    BTraversal left, right;

    public BTraversal(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BoundaryTraversal {

    // Print the left boundary (excluding leaf nodes)
    private static void printLeftBoundary(BTraversal root) {
        if (root != null) {
            if (root.left != null) {
                System.out.print(root.data + " ");
                printLeftBoundary(root.left);
            } else if (root.right != null) {
                System.out.print(root.data + " ");
                printLeftBoundary(root.right);
            }
        }
    }

    // Print the right boundary (excluding leaf nodes, bottom-up order)
    private static void printRightBoundary(BTraversal root) {
        if (root != null) {
            if (root.right != null) {
                printRightBoundary(root.right);
                System.out.print(root.data + " ");
            } else if (root.left != null) {
                printRightBoundary(root.left);
                System.out.print(root.data + " ");
            }
        }
    }

    // Print all leaf nodes (left-to-right)
    private static void printLeaves(BTraversal root) {
        if (root != null) {
            printLeaves(root.left);
            if (root.left == null && root.right == null) {
                System.out.print(root.data + " ");
            }
            printLeaves(root.right);
        }
    }

    // Perform the boundary traversal
    public static void boundaryTraversal(BTraversal root) {
        if (root != null) {
            // Print the root
            System.out.print(root.data + " ");

            // Print the left boundary
            printLeftBoundary(root.left);

            // Print all leaf nodes
            printLeaves(root.left);
            printLeaves(root.right);

            // Print the right boundary
            printRightBoundary(root.right);
        }
    }

    public static void main(String[] args) {
        // Example tree
        BTraversal root = new BTraversal(3);
        root.left = new BTraversal(4);
        root.right = new BTraversal(5);
        root.left.left = new BTraversal(8);
        root.left.right = new BTraversal(1);
        root.right.left = new BTraversal(6);
        root.right.right = new BTraversal(7);

        System.out.println("Boundary Traversal:");
        boundaryTraversal(root);
    }
}



    //     3
    //    / \
    //   4   5
    //  / \ / \
    // 8  1 6  7


// output : Boundary Traversal:
// 3 4 8 1 6 7 5

