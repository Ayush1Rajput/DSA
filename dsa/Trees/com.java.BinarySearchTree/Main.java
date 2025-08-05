import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST t = new BST();

        t.root = BST.insert(t.root, 25);
        t.root = BST.insert(t.root, 15);
        t.root = BST.insert(t.root, 50);
        t.root = BST.insert(t.root,14);
        t.root = BST.insert(t.root, 32);
        t.root = BST.insert(t.root,63);
        t.root = BST.insert(t.root,12);

        ArrayList<Integer> arrayList = new ArrayList<>();
        BST.inOrder(t.root, arrayList);
        System.out.println(arrayList);

        System.out.println(BST.search(t.root, 15));

        System.out.println(BST.searchTreeNode(t.root, 15));

        System.out.println(BST.findPath(t.root,12));

    }
}
