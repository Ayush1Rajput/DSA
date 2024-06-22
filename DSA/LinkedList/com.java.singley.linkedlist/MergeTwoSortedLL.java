public class MergeTwoSortedLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    
    static Node head1;
    static Node head2;

    public static Node mergeTwoSortedLL(){
        Node temp1=head1;
        Node temp2=head2;
        Node newNode = new Node(20);
        Node temp = newNode;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a = new Node(temp1.data);
                temp.next=a;
                a=temp;
                temp1=temp1.next;
            }
            else{
                Node a = new Node(temp1.data);
                temp.next=a;
                a=temp;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return newNode.next;
    }
}
