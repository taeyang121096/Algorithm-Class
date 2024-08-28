package structure;

public class TreeExample {

    // TreeNode class
    class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    // BinaryTree class
    class BinaryTree {
        private TreeNode root;

        public BinaryTree() {
            this.root = null;
        }

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private TreeNode insertRec(TreeNode root, int data) {
            if (root == null) {
                root = new TreeNode(data);
                return root;
            }
            if (data < root.getData()) {
                root.setLeft(insertRec(root.getLeft(), data));
            } else if (data > root.getData()) {
                root.setRight(insertRec(root.getRight(), data));
            }
            return root;
        }

        public void inOrder() {
            inOrderRec(root);
        }

        private void inOrderRec(TreeNode root) {
            if (root != null) {
                inOrderRec(root.getLeft());
                System.out.print(root.getData() + " ");
                inOrderRec(root.getRight());
            }
        }

        public void preOrder() {
            preOrderRec(root);
        }

        private void preOrderRec(TreeNode root) {
            if (root != null) {
                System.out.print(root.getData() + " ");
                preOrderRec(root.getLeft());
                preOrderRec(root.getRight());
            }
        }

        public void postOrder() {
            postOrderRec(root);
        }

        private void postOrderRec(TreeNode root) {
            if (root != null) {
                postOrderRec(root.getLeft());
                postOrderRec(root.getRight());
                System.out.print(root.getData() + " ");
            }
        }

        public boolean search(int data) {
            return searchRec(root, data);
        }

        private boolean searchRec(TreeNode root, int data) {
            if (root == null) {
                return false;
            }
            if (root.getData() == data) {
                return true;
            }
            return data < root.getData() ? searchRec(root.getLeft(), data) : searchRec(root.getRight(), data);
        }
    }

    public static void main(String[] args) {
        TreeExample example = new TreeExample();
        BinaryTree tree = example.new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preOrder();
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrder();
        System.out.println();

        System.out.println("Search for 40: " + tree.search(40));
        System.out.println("Search for 90: " + tree.search(90));
    }
}
