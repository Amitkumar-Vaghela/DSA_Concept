class TreeNode:
    def __init__(self, value):
        self.value = value
        self.children = []

    def add_child(self, child_node):
        self.children.append(child_node)

    def print_tree(self, level=0):
        print(" " * level * 4 + str(self.value))
        for child in self.children:
            child.print_tree(level + 1)

# Example Usage
root = TreeNode("A")
child1 = TreeNode("B")
child2 = TreeNode("C")
child3 = TreeNode("D")

root.add_child(child1)
root.add_child(child2)
child1.add_child(child3)

root.print_tree()
