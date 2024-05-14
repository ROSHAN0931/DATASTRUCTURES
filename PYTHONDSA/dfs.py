class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

def dfs_inorder(root):
    if root:
        dfs_inorder(root.left)
        print(root.val)
        dfs_inorder(root.right)

def dfs_preorder(root):
    if root:
        print(root.val)
        dfs_preorder(root.left)
        dfs_preorder(root.right)

def dfs_postorder(root):
    if root:
        dfs_postorder(root.left)
        dfs_postorder(root.right)
        print(root.val)

# Example usage:
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)

print("Depth-First Traversal (Inorder) of the binary tree:")
dfs_inorder(root)
print("\nDepth-First Traversal (Preorder) of the binary tree:")
dfs_preorder(root)
print("\nDepth-First Traversal (Postorder) of the binary tree:")
dfs_postorder(root)


# We define a class Node to represent each node in the binary tree. 
# Each node has a value (val), a left child (left), and a right child (right).
# We define three functions for performing different depth-first traversals of the binary tree: 
# dfs_inorder, dfs_preorder, and dfs_postorder.

# Inside each traversal function:
# dfs_inorder: This function performs an inorder traversal of the binary tree. 
# In inorder traversal, we first visit the left subtree, then the current node, and finally the right subtree.

# dfs_preorder: This function performs a preorder traversal of the binary tree. 
# In preorder traversal, we first visit the current node, then the left subtree, and finally the right subtree.

# dfs_postorder: This function performs a postorder traversal of the binary tree. 
# In postorder traversal, we first visit the left subtree, then the right subtree, and finally the current node.

# Inside each traversal function, we use recursion to traverse the tree.We start with the root node and recursively 
# call the function on the left child (if exists), then on the right child (if exists), 
# and finally print the value of the current node.