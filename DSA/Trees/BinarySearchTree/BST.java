package DSA.Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    TreeNode root;

    //  By the help of without Recursion
    // we create the code by itratively
    public void insert(int val){
        if(this.root == null){
            this.root = new TreeNode(val);
            return;
        }

        TreeNode current = this.root; // for holding the current node data
        TreeNode pre = null; // create this for store thw previous parent data

        while (true){
            pre = current;

            if(val < current.val){
                current = current.left;
                if(current == null){
                    pre.left = new TreeNode(val);
                    return;
                }
            }
            else if(val > current.val){
                current = current.right;
                if(current == null){
                    pre.right = new TreeNode(val);
                    return;
                }
            }
        }
    }


    //By the help of recursion code for insertion
    public static TreeNode insert(TreeNode node, int val){
        if(node == null) return new TreeNode(val);

        if(val < node.val){
            node.left = insert(node.left,val);
        }
        else if(val > node.val){
            node.right = insert(node.right,val);
        }
        return node;
    }

    public static void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.val+"->");
            inOrder(node.right);
        }
    }



    // Creating the code for searching the node by Recursion method
    public static Boolean searchNode(TreeNode node , int val){
        if(node == null) return false;

        if(node.val == val) return true;

        return searchNode(node.left, val)  || searchNode(node.right, val);
    }

    // Creating code for searching the node by Itration method

//    public boolean searchNode(int val){
//        if(this.root == null) return false;
//
//        TreeNode cur = this.root;
//        while(true) {
//            if (val < cur.val) {
//                cur = cur.left;
//                if (cur == null) {
//                    return false;
//                }
//            } else if (val > cur.val) {
//                cur = cur.right;
//                if (cur == null) {
//                    return false;
//                }
//            } else {
//                return true;
//            }
//        }
//    }

    // One another method for searching the node by Itrative method

    public boolean search(int val){
        if(root == null){
            return false;
        }
        TreeNode temp = root;
        while (temp!=null){
            if(temp.val == val){
                return true;
            } else if (val < temp.val) {
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

    public void preOrderTraversal(){
        if(root == null){
            return;
        }

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                st.push(temp.left);
            }
        }
    }

    public void inOrderTraversal(){
        if(root == null) return;

        Stack<TreeNode> st = new Stack<TreeNode>();
//        st.push(root);
        TreeNode current = root;
        while (!st.isEmpty()  || current!=null){

            while(current != null){
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            System.out.print(current.val+" ");
            current = current.right;
        }
    }

    public static void inorder(TreeNode temp, ArrayList<Integer> al){
        if(temp!=null){
            inorder(temp.left,al);
            al.add(temp.val);
            inorder(temp.right,al);
        }
    }
    public static ArrayList<TreeNode> path(TreeNode node,int val){
        if(node == null){
            return null;
        }
        ArrayList<TreeNode> al=new ArrayList<>();
        TreeNode temp =node;
        al.add(temp);
        while(temp!=null && temp.val != val){
            if(val<temp.val){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
            if(temp!=null) al.add(temp);

        }
        return al.get(al.size()-1).val==val?al:null;
    }
    public static Integer Findlca(TreeNode node,int val1,int val2){
        ArrayList<TreeNode> al1=path(node, val1);
        ArrayList<TreeNode> al2=path(node, val2);
        if(al1 ==null||al2==null){
            return null;
        }
        Integer lca=null;
        for(TreeNode n1:al1){
            for(TreeNode n2:al2){
                if(n1.val==n2.val){
                    lca=n1.val;
                }
            }
        }
        return lca;
    }
    public static boolean isidentical(TreeNode n1,TreeNode n2){
        if(n1==null ||n2==null){
            return false;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.offer(n1);
        q2.offer(n2);
        while(!q1.isEmpty()||!q2.isEmpty()){
            TreeNode temp1=q1.poll();
            TreeNode temp2=q2.poll();
            if(temp1.val!=temp2.val){
                return false;
            }
            if(temp1.left!=null){
                q1.offer(temp1.left);
            }
            if(temp1.right!=null){
                q1.offer(temp1.right);
            }
            if(temp2.left!=null){
                q2.offer(temp2.left);
            }
            if(temp2.right!=null){
                q2.offer(temp2.right);
            }
        }
        return true;
    }

    public  static TreeNode inOrderToTree(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) /2;

        TreeNode node = new TreeNode(arr[mid]);
        node.left = inOrderToTree(arr, start, mid -1);
        node.right = inOrderToTree(arr, mid+1, end);

        return node;
    }

    public TreeNode mirror(TreeNode node){
        if(node == null) return node;

        TreeNode left = mirror(node.left);
        TreeNode right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

}
