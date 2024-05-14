class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

def bfs(root):
    if root is None:
        return
    
    queue = []  
    queue.append(root)
    
    while queue:
        current_node = queue.pop(0)
        print(current_node.val)
        
        if current_node.left:
            queue.append(current_node.left)
        if current_node.right:
            queue.append(current_node.right)

# Example usage:
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)

print("Breadth-First Traversal of the binary tree:")
bfs(root)

# We define a class Node to represent each node in the binary tree. 
# Each node has a value (val), a left child (left), and a right child (right).
# The bfs function performs a breadth-first traversal of the binary tree starting from the root node.

# Inside the bfs function:
# a. We first check if the root is None. If it is, we return early because there's nothing to traverse.
# b. We initialize an empty queue (queue) to keep track of nodes to visit. 
#     We append the root node to this queue to start the traversal.
# c. We enter a while loop that continues until the queue is empty.
# d. Inside the loop, we pop the first element from the queue (current_node).
#     This node represents the current node being visited.
# e. We print the value of the current node, effectively visiting it.
# f. Then, we check if the current node has a left child. If it does, we append the left child to the queue.
#     This ensures that we visit all left children before right children at the next level.
# g. Similarly, we check if the current node has a right child. 
#     If it does, we append the right child to the queue.
# h. Repeat steps d-g until the queue is empty, effectively traversing the entire binary tree in 
#     a breadth-first manner.
# Finally, we create an example binary tree with 7 nodes and perform a breadth-first traversal using 
#     the bfs function.
