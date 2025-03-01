class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class GfG {
    static Node insert(Node root, int key)
    {
        if (root == null)
            return new Node(key);

        if (root.key == key)
            return root;

        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    static int getLeastValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.key;
    }
    
    public static void main(String[] args)
    {
        Node root = null;
        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println(getLeastValue(root));


    }
}
