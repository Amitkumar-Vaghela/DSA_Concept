class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

# Inorder Traversal
def inorder(root):
    if root:
        inorder(root.left)
        print(root.val, end=" ")
        inorder(root.right)

# Preorder Traversal
def preorder(root):
    if root:
        print(root.val, end=" ")
        preorder(root.left)
        preorder(root.right)

# Postorder Traversal
def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.val, end=" ")

# Sample Tree
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

print("Inorder Traversal:")
inorder(root)  # Output: 4 2 5 1 3

print("\nPreorder Traversal:")
preorder(root)  # Output: 1 2 4 5 3

print("\nPostorder Traversal:")
postorder(root)  # Output: 4 5 2 3 1
