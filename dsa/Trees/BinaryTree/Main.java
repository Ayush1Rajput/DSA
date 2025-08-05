
package dsa.Trees.BinaryTree;
//
public class Main {

    public static void main(String[] args) {

        Binarytree t = new Binarytree();
        t.root = new TreeNode(10);
        t.root.left = new TreeNode(20);
        t.root.right = new TreeNode(30);
//        t.root.left.left = new TreeNode(23);
        t.root.right.right = new TreeNode(11);
        t.root.right.right.right = new TreeNode(14);

//        t.levelOrderInsert(25);
//
//        t.levelOrderInsert(15);
//        t.levelOrderInsert(50);
//
//        t.levelOrderInsert(10);
//        t.levelOrderInsert(22);
//
//        t.levelOrderInsert(35);
//        t.levelOrderInsert(70);
//
//        t.levelOrderInsert(4);
//        t.levelOrderInsert(12);
//
//        t.levelOrderInsert(18);
//        t.levelOrderInsert(24);
//
//        t.levelOrderInsert(31);
//        t.levelOrderInsert(44);
//
//        t.levelOrderInsert(66);
//        t.levelOrderInsert(90);


        t.levelOrderTraversal();
        System.out.println();

        t.preOrder(t.root);
        System.out.println();

        t.postOrder(t.root);
        System.out.println();

        t.inOrder(t.root);
        System.out.println();

        System.out.println("the Height of Tree is : "+ t.height(t.root));

        System.out.println("The number of leaf node : "+t.countLeafNode(t.root));

        System.out.println("The total nodes in a tree is : "+Binarytree.countNode(t.root));

        System.out.println("The sum of leaf node is : "+t.leafNodeSum(t.root));

        System.out.println("The tree is Balance : "+t.isBalance(t.root));

        System.out.println("The given element in the tree has : "+t.searchNode(t.root,10));

    }
}
