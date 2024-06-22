// import org.w3c.dom.Node;

public class NthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head;

    

    public static int NthFromLast(int pos){

        int count = 0;
        Node temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }

        int m  = count - pos + 1;

        temp=head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        // System.out.println(temp.data);
        return temp.data;

    }

    public static Node NthLastNodeByS_F(int t){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<t;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    
    // public static int 
    public static void main(String[] args) {

        Main.addLast(12);
        Main.addFirst(12);
        Main.addLast(3);
        Main.addLast(15);
        
        System.out.println(NthFromLast( 2));
        
    }

    
}
