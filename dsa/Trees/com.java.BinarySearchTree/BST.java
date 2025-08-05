import java.util.ArrayList;

public class BST {
    TreeNode root;
    
        public  static TreeNode insert(TreeNode node, int val){
            
            if(node == null) return new TreeNode(val);
    
            if(val < node.data){
                node.left = insert(node.left,val);
            }
            else if(val > node.data){
                node.right = insert(node.right,val);
            }
            return node;
    
            // TreeNode temp = node;
            // TreeNode parent = null;
    
            // while (temp != null) {
            //     parent = temp ;
            //     if(val < temp.data) {
            //         temp = temp.left;
            //         if(temp == null){
            //             parent.left = new TreeNode(val);
            //             break;
            //         }
            //     }
            //     if(val > temp.data) {
            //         temp = temp.right;
            //         if(temp == null){
            //             parent.right = new TreeNode(val);
            //             break;
            //         }
            //     }
            // }
            // return node;

        }
        
    
    
        // public static void inOrder(TreeNode node){
        //     if(node!=null){
        //         inOrder(node.left);
        //         System.out.print(node.data+"->");
        //         inOrder(node.right);
        //     }
        // }


        public static ArrayList<Integer> inOrder(TreeNode node, ArrayList<Integer> al){
            if(node != null){
                inOrder(node.left, al);
                al.add(node.data);
                inOrder(node.right, al);
            }
            return al;
        }

        public static boolean search(TreeNode node, int val){
            if(node == null) return false;

            TreeNode temp = node;

            while (temp!=null) {
                if(val == temp.data) return true;

                if(val < temp.data){
                    temp = temp.left;
                }
                else if(val > temp.data){
                    temp = temp.right;

                }
            }
            return false;
        }

        public static TreeNode searchTreeNode(TreeNode node, int val){
            if(node == null) return null;

            TreeNode temp = node;

            while (temp!=null) {
                if(val == temp.data) return temp;

                if(val < temp.data){
                    temp = temp.left;
                }
                else if(val > temp.data){
                    temp = temp.right;

                }
            }
            return temp;
        }

        public static ArrayList<Integer> findPath(TreeNode node , int val){
            if(node == null) return null;

            ArrayList<Integer> al = new ArrayList<>();

            TreeNode temp = node;

            while (temp!=null) {
                al.add(temp.data);
                if(val == temp.data){
                    break;
                }

                if(val < temp.data){
                    temp = temp.left;
                }
                else if(val > temp.data){
                    temp = temp.right;

                }

            }

            return al;
        }

        public static ArrayList<Integer> sumOfTwoNode(TreeNode node,int val){
            ArrayList<Integer> al = new ArrayList<>();

            TreeNode temp = node;

            TreeNode parent = null;
    
            while (temp != null) {
                parent = temp ;
                if(val < temp.data) {
                    temp = temp.left;
                    if(temp == null){
                        parent.left = new TreeNode(val);
                        break;
                    }
                }
                if(val > temp.data) {
                    temp = temp.right;
                    if(temp == null){
                        parent.right = new TreeNode(val);
                        break;
                    }
                }
            }


                // if(node.data + node.left.data == val){
                //     al.add(node.data);
                //     al.add(node.left.data);
                //     return al;
                // }
                // else if(node.data + node.right.data == val){
                //     al.add(node.data);
                //     al.add(node.right.data);
                //     return al;
                // }
            
            return al;
        }
}
