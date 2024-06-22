package DSA.Trees.BinarySearchTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST t = new BST();
//        t.insert(25);
//        t.insert(15);
//        t.insert(30);

        t.root = BST.insert(t.root,25);
        t.root = BST.insert(t.root,15);
        t.root = BST.insert(t.root,30);
        t.root = BST.insert(t.root,40);
        t.root = BST.insert(t.root,50);


        BST.inOrder(t.root);
        System.out.println();

        System.out.println(BST.searchNode(t.root,15));

//        System.out.println(t.searchNode(13));

        System.out.println(t.search(13));

        t.preOrderTraversal();
        System.out.println();
        t.inOrderTraversal();




         ArrayList<Integer> al=new ArrayList<>();
         BST.inorder(t.root,al);
         System.out.println(al);
//
         int in=al.indexOf(2);
         System.out.println(in);
         System.out.println(BST.path(t.root, 20));
//
         Integer lca=BST.Findlca(t.root, 10, 15);
         System.out.println(lca);

         BST bst1=new BST();
         BST bst2=new BST();
         bst1.root=new TreeNode(0);
         bst1.root.left=new TreeNode(10);
         bst1.root.right=new TreeNode(20);
         bst2.root=new TreeNode(0);
         bst2.root.left=new TreeNode(10);
         bst2.root.right=new TreeNode(30);
         System.out.println(BST.isidentical(bst1.root,bst2.root));


//        System.out.println(t.mirror(t.root).val);   // it is not working properly
    }

}
