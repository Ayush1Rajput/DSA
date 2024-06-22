public class MergeTwoSortedLL_II {
    
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head;

    static Node head1;
    static Node head2;

    public static Node mergeTwoSortedLLII(){
        Node t1 = head1;
        Node t2 = head2;
        Node h = new Node(2);
        Node t = h;

        while (t1!=null && t2!=null) {
            if(t1.data<t2.data){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }
        else{
            t.next=t1;
        }
        return h.next;
    }
}
