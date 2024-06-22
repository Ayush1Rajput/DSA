package DSA.Trees_PW;

import java.util.*;

public class BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;
        }
    }

    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" => ");
        if(root.left!=null){
            System.out.print(root.left.val+" ");
        }
        if(root.right!=null){
            System.out.print(root.right.val+" ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }


    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        return root.val+sumOfNode(root.left)+sumOfNode(root.right);
    }

    public static int maxValue(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }

    public static int minValue(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }



    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            System.out.print(temp.val+" ");
            q.remove();
        }
    }

    public static void dfs(Node root){
        Stack<Node> st = new Stack<>();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        b.right=e;

        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println("Level Order ");
        display(root);
        System.out.print("The Size of Tree is = ");
        System.out.println(size(root));
        System.out.println("The of all Nodes is = "+sumOfNode(root));

        System.out.println("The maximum value of Tree is = "+maxValue(root));

        System.out.println("The Height of tree is = "+height(root));

        System.out.println("The minimum value of the tree is = "+minValue(root));

        System.out.print("The nth level is = " );
        nthLevel(root,2);
        System.out.println();
        System.out.println("The level of Tree is like as :");

        // Print all the level
        int len = height(root)+1;
        for(int i=1;i<=len;i++){
            nthLevel(root,i);
            System.out.println();
        }

        System.out.println("The BFS Method for level order traversal : ");
        bfs(root);
    }

    private static void nthLevel(Node root, int i) {
    }
}
