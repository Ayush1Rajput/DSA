public class MiddleNodeLinkedList {
        public static class Node {
            int data;
            Node next;
    
            public Node(int data){
                this.data=data;
            }
        }
        
        static Node head;
        public static int getMiddleNode(){
            Node slow =head;
            Node fast=head;
            while( fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.print("The middle Node data of LinkedList is : ");
            return slow.data;
        }
}
