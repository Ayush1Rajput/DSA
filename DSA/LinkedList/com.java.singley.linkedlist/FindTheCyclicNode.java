public class FindTheCyclicNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head;

    public static Node getCycleNode(){
        Node slow = head;
        Node fast = head;
    
        while(fast!=null){
            slow=slow.next;
            
            fast=fast.next.next;
            
            if(slow==fast){  
               break;
            }
        }

        Node temp = head;
        while (temp!=slow) {
            temp=temp.next;
            slow=slow.next;
            
        }
        return slow;
    }
}
