class BinaryTreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def print_tree(self, level=0):
        if self.right:
            self.right.print_tree(level + 1)
        print(" " * level * 4 + str(self.value))
        if self.left:
            self.left.print_tree(level + 1)

# Example Usage
root = BinaryTreeNode(10)
root.left = BinaryTreeNode(5)
root.right = BinaryTreeNode(20)
root.left.left = BinaryTreeNode(3)
root.left.right = BinaryTreeNode(7)

root.print_tree()
