public class Binarytree {

    public static Node root;

   
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    static class Binary {

        public Binary() {
            root = null;
        }

        
        public void addNode(int data) {
            root = addNodeRec(root, data);  
        }

        private Node addNodeRec(Node current, int data) {
            if (current == null) {
                return new Node(data);  
            }

            if (data < current.data) {
                current.left = addNodeRec(current.left, data);  
            } else if (data > current.data) {
                current.right = addNodeRec(current.right, data);  
            }

            return current;
        }

       
        public void preOrder(Node root) {
            if (root != null) {
                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public void inOrder(Node root) {
            if (root != null) {
                inOrder(root.left);
                System.out.print(root.data+" ");
                inOrder(root.right);
            }
        }

        public void postOrder(Node root) {
            if (root != null) {
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data+" ");
            }
        }
    }

    public static void main(String args[]) {
        Binary tree = new Binary();

       
        tree.addNode(1);
        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(4);
        tree.addNode(2);
        tree.addNode(3);

        
        System.out.println("PreOrder Traversal: ");
        tree.preOrder(root);

        System.out.println("\nInOrder Traversal: ");
        tree.inOrder(root);

        System.out.println("\nPostOrder Traversal: ");
        tree.postOrder(root);
    }
}
