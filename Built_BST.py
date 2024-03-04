#built BST
class Node:
 def __init__(self,data):
   self.data=data
   self.left=None
   self.right=None     

def insert(root,data): 
    if not root:
        return Node(data)
    if data<root.data:
        if not root.left:
            root.left=Node(data)
        else:
            insert(root.left,data)
    if data>root.data:
        if not root.right:
            root.right=Node(data)
        else:
            insert(root.right,data)
    return root

def inorder(root):
    result = []
    def inorder_helper(node):
        if node:
            inorder_helper(node.left)
            result.append(node.data)
            inorder_helper(node.right)
    inorder_helper(root)
    return result

l=[15,12,1,9,7,3,4,18,16]
root=None
for i in l:
    root=insert(root,i)

inorder_traversal = inorder(root)

if inorder_traversal==sorted(l):
    print("BST")
else:
    print("Not a BST")

print(inorder_traversal)
