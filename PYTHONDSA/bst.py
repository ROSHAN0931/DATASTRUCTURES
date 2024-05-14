class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

def insert(root, key):
    if root is None:
        return Node(key)
    else:
        if root.val < key:
            root.right = insert(root.right, key)
        else:
            root.left = insert(root.left, key)
    return root

def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val)
        inorder_traversal(root.right)

# Example usage: 
root = None
keys = [50, 30, 20, 40, 70, 60, 80]

for key in keys:
    root = insert(root, key)

print("Inorder traversal of the constructed BST:")
inorder_traversal(root)


# Node class:
# This class defines the structure of a node in the binary search tree (BST).
# Each node has three attributes:
# left: Pointer to the left child node.
# right: Pointer to the right child node.
# val: Value stored in the node.

# Insert function (insert):
# This function inserts a new node with a given key into the BST.
# It takes two parameters: root (the root node of the BST) and key (the value to be inserted).
# If the root is None, indicating an empty tree, it creates a new node with the given key and returns it.
# If the root is not None, it recursively traverses the BST to find the appropriate position for the new key.
# If the key is less than the value of the current node (root.val), it recursively inserts the key into the left subtree.
# If the key is greater than the value of the current node, it recursively inserts the key into the right subtree.
# Finally, it returns the modified root node after insertion.

# Inorder traversal function (inorder_traversal):
# This function performs an inorder traversal of the BST, which visits the nodes in sorted order.
# It takes a single parameter root, representing the root node of the BST.
# If the root is not None, it recursively traverses the left subtree, prints the value of the current node (root.val), and then recursively traverses the right subtree.

# Example usage:
# It initializes an empty BST by setting root to None.
# It defines a list keys containing values to be inserted into the BST.
# It iterates through the keys list and inserts each key into the BST using the insert function.
# After inserting all keys, it prints "Inorder traversal of the constructed BST:" as a header.
# It calls the inorder_traversal function with the root node to perform the inorder traversal and print the elements of the BST in sorted order.

# binary tree

class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

# Example usage:
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

# Display the tree structure
def print_tree(root, level=0):
    if root:
        print("  " * level + str(root.val))
        print_tree(root.left, level + 1)
        print_tree(root.right, level + 1)

print_tree(root)
