

//BINARY SEARCH TREE(Insertion, Traversal (Inorder,Preorder,Postorder), Searching, Level-order Traversal,
//        Height,leafcount,Topview,delete a node)

import java.util.*;

class Node {
    int data;
    Node left, right;
    int height;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}

class Tree {
    Node create(int data) {
        return new Node(data);
    }

    Node insert(Node root, int data) {
        if (root == null) {
            return create(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }
    public void topview (Node root){
        if (root == null){
            return;
        }
        TreeMap<Integer,Integer> m= new TreeMap<Integer,Integer>();

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.remove();
            int h = temp.height;

            if(!m.containsKey(h)){
                m.put(h,temp.data);
            }
            if(temp.left != null){
                temp.left.height = h - 1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.height = h + 1;
                q.add(temp.right);
            }
        }
        for (Integer value : m.values()) {
            System.out.print(value + " ");
        }
    }
    public int leafCount(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafCount(root.left) + leafCount(root.right);
    }
    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node temp = findMin(root.right);
            root.data = temp.data;

            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    public static void main(String[] args) {
        Tree T1 = new Tree();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node root = T1.create(k);

        while (true) {
            int data = sc.nextInt();
            if (data == -1) {
                break;
            }
            T1.insert(root, data);
        }
        System.out.println("PREORDER:");
        T1.preorder(root);
        System.out.println("\nINORDER:");
        T1.inorder(root);
        System.out.println("\nPOSTORDER:");
        T1.postorder(root);
        System.out.println("\nLEVEL ORDER:");
        T1.levelOrder(root);
        System.out.println("\nHEIGHT = " + T1.height(root));

        System.out.println("enter input to search : ");
        int l = sc.nextInt();
        Node result = T1.search(root, l);

        if (result != null) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        System.out.println("TOP VIEW:");
        T1.topview(root);
        System.out.println("\nLEAF COUNT:");
        System.out.println(T1.leafCount(root));

        T1.delete(root,44);
        T1.preorder(root);
    }
}