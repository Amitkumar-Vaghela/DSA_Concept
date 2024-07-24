class Node:
 def __init__(self,v):  # def class for tree node
   self.data=v
   self.left=None                                                                              
   self.right=None
  
def printInorder(node):
   if node is None:
     return
   printInorder(node.left) # left
   print(node.data,end=' ') #node
   printInorder(node.right)  #right
   
# def height(self,root):
#   if root is None:
#     return -1
#   return max(self.height(root.left),self.height(root.right)) + 1
   
 #Drive unicode
if __name__=='__main__':
   root=Node(1)
   root.left=Node(2)
   root.right=Node(3)
   root.left.left=Node(4)
   root.left.right=Node(5)
   root.right.right=Node(6)
   root.right.left=Node(7)
   print("Inorder Traping")
   printInorder(root)


             #       1
             #     /   \
             #    2      3 
             #  /  \    /  \
             # 4    5  6    7



















 
  
                                                                                       
