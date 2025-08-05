package dsa.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
    TreeNode root;

    public void levelOrderInsert(int data){
        TreeNode newNode = new TreeNode(data);
        if(root==null) {
            this.root = newNode;
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.offer(this.root); // add item

        while (true){
            TreeNode temp = queue.poll();

            if(temp.left!=null){
                queue.offer(temp.left);
            }else{
                temp.left = newNode;
                break;
            }

            if(temp.right!=null){
                queue.offer(temp.right);
            }else{
                temp.right = newNode;
                break;
            }
        }
    }

    public void levelOrderTraversal(){

        if(this.root==null) return;

        Queue<TreeNode> queue = new LinkedList<>() ;

        queue.offer(this.root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }

    public void preOrder(TreeNode node){
        if(node != null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(TreeNode node){
        if(node != null){

            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    public void postOrder(TreeNode node){
        if(node != null){

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    public int height(TreeNode node){
        if(node==null) return 0;

        return  Math.max(height(node.left),height(node.right)) + 1;
    }

    public int countLeafNode(TreeNode node){
        if(node == null) return 0;

        if(node.left==null && node.right==null) return 1;

        return countLeafNode(node.left) + countLeafNode(node.right);
    }

    public static int countNode(TreeNode node){
        if(node == null) return  0;
        return 1 + countNode(node.left) + countNode(node.right);
    }

    public  int leafNodeSum(TreeNode node){
        if(node==null) return 0;

        if(node.left==null && node.right==null) {
            return node.data;
        }

        return leafNodeSum(node.left) + leafNodeSum(node.right) ;
    }

    public boolean isBalance(TreeNode node){
        if(node == null) return true;
        int lh = height(node.left);
        int rh = height(node.right);

        int res = Math.abs(lh - rh);

        if(res > 1){
            return false;
        }
        return isBalance(node.left) && isBalance(node.right) ;
    }

    public boolean searchNode(TreeNode node , int val){
        if(node == null) return false;

        if(node.data == val) return true;

        return searchNode(node.left,val) || searchNode(node.right,val);
    }
}