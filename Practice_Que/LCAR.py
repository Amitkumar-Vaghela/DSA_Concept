#lowest common ansister for root

#lowest common ansister for root
class Node:
  def __init__(self, data):
    self.data = data
    self.left = None
    self.right = None
def lca(root,a,b):
  if root is None:
    return 0
  if root.data==a or root.data==b:
    return root
  else:
   Llca=lca(root.left,a,b)
   Rlca=lca(root.right,a,b)
   if Llca and Rlca:
     return root
   return Llca if Llca else Rlca
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)
root.right.left=Node(6)
root.right.right=Node(7)

print("lowest common ansister for 5 and 6 is Lca(root,5,6).data")
print("lowest common ansister for 4 and 5 is Lca(root,4,5).data")
print("lowest common ansister for 6 and 7 is Lca(root,5,6).data")
