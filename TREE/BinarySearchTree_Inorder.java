import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeInorderTraversal {

    // Recursive Inorder Traversal
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    // Iterative Inorder Traversal
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

    // Helper to build a sample tree for demonstration
    public static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

        // Build sample tree: [1, null, 2, 3]
        TreeNode root = buildSampleTree();

        // Recursive Traversal
        System.out.println("Recursive Inorder Traversal:");
        List<Integer> recursiveResult = traversal.inorderTraversalRecursive(root);
        System.out.println(recursiveResult);

        // Iterative Traversal
        System.out.println("Iterative Inorder Traversal:");
        List<Integer> iterativeResult = traversal.inorderTraversalIterative(root);
        System.out.println(iterativeResult);
    }
}
