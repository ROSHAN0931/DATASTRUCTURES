#include <iostream>

// Define the structure for a binary tree node
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

// Function to insert a new value into the BST
TreeNode* insert(TreeNode* root, int val) {
    // If the tree is empty, create a new node and return it as the root
    if (root == nullptr) {
        return new TreeNode(val);
    }

    // If the value to be inserted is less than the value of the current node, insert into the left subtree
    if (val < root->val) {
        root->left = insert(root->left, val);
    }
    // If the value to be inserted is greater than or equal to the value of the current node, insert into the right subtree
    else {
        root->right = insert(root->right, val);
    }

    // Return the root of the modified tree
    return root;
}

// Function to perform inorder traversal of the binary tree
void inorderTraversal(TreeNode* root) {
    if (root == nullptr) return;
    inorderTraversal(root->left);
    std::cout << root->val << " ";
    inorderTraversal(root->right);
}

int main() {
    // Create an empty binary search tree
    TreeNode* root = nullptr;

    // Insert elements into the binary search tree
    root = insert(root, 50);
    root = insert(root, 30);
    root = insert(root, 70);
    root = insert(root, 20);
    root = insert(root, 40);
    root = insert(root, 60);
    root = insert(root, 80);

    // Perform inorder traversal to display the elements in sorted order
    std::cout << "Inorder traversal: ";
    inorderTraversal(root);
    std::cout << std::endl;

    // Clean up memory (optional)
    // Perform cleanup by deleting nodes (not shown here to keep the example simple)

    return 0;
}
