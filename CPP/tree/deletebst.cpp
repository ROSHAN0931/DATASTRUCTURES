#include <iostream>

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

TreeNode* findMin(TreeNode* root) {
    while (root->left != nullptr) {
        root = root->left;
    }
    return root;
}

TreeNode* deleteNode(TreeNode* root, int key) {
    if (root == nullptr) {
        return root;
    }

    // Search for the node to be deleted
    if (key < root->val) {
        root->left = deleteNode(root->left, key); // Delete from the left subtree
    } else if (key > root->val) {
        root->right = deleteNode(root->right, key); // Delete from the right subtree
    } else { // Node found, perform deletion
        // Case 1: Node has no children or only one child
        if (root->left == nullptr) {
            TreeNode* temp = root->right;
            delete root;
            return temp;
        } else if (root->right == nullptr) {
            TreeNode* temp = root->left;
            delete root;
            return temp;
        }

        // Case 2: Node has two children
        // Find the inorder successor (smallest node in the right subtree)
        TreeNode* successor = findMin(root->right);

        // Copy the value of the successor to the current node
        root->val = successor->val;

        // Delete the inorder successor node
        root->right = deleteNode(root->right, successor->val);
    }
    return root;
}

// Utility function to perform inorder traversal of the binary tree
void inorderTraversal(TreeNode* root) {
    if (root == nullptr) return;
    inorderTraversal(root->left);
    std::cout << root->val << " ";
    inorderTraversal(root->right);
}

int main() {
    // Create an example BST
    TreeNode* root = new TreeNode(50);
    root->left = new TreeNode(30);
    root->right = new TreeNode(70);
    root->left->left = new TreeNode(20);
    root->left->right = new TreeNode(40);
    root->right->left = new TreeNode(60);
    root->right->right = new TreeNode(80);

    // Perform inorder traversal to display the elements before deletion
    std::cout << "Inorder traversal before deletion: ";
    inorderTraversal(root);
    std::cout << std::endl;

    // Delete node with value 50 (root)
    root = deleteNode(root, 50);

    // Perform inorder traversal after deletion
    std::cout << "Inorder traversal after deletion: ";
    inorderTraversal(root);
    std::cout << std::endl;

    // Clean up memory (optional)
    // Perform cleanup by deleting nodes
    delete root->left->left;
    delete root->left->right;
    delete root->left;
    delete root->right->left;
    delete root->right->right;
    delete root->right;
    delete root;

    return 0;
}
