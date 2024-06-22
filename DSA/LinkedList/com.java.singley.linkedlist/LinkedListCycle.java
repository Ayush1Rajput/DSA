public class LinkedListCycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head;

    public static boolean getCycleLinkedList(){
        Node slow = head;
        Node fast = head;
        if(head.next==null || head==null) return false;
        while(fast!=null){
            slow=slow.next;
            if(slow==null) return false;
            fast=fast.next.next;
            if (fast.next==null) return false;
            if(slow==fast){  
                return true;
            }
        }
        return false;
    }
    
}
