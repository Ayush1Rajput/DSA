public class RemoveNthNodeLast {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    static Node head;

    public static void removeNthNodeLast(int t){
        
        Node fast=head;
        Node slow=head;

        for(int i=1;i<=t;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
    }
}
