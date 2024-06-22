public class DeletemiddleNode {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head;
    
    public static void deleteMiddleNode(){
        Node slow =head;
        Node fast=head;
        if(head.next==null) return;
        // return null;
        while( fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        
    }
}
