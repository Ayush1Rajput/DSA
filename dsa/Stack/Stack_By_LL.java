package dsa.Stack;
class Stack_By_LL {
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    Node head=null;
    int size = 0;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
        size++;
    }

    void displayRev(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int pop(){
        Node temp = head;
        Node t = head;
        head  = temp.next;
        size--;
        return t.data;
    }

    int size(){
        return size;
    }

    public Integer peek(){
        if(head==null) return null;
        return head.data;
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

//    void displayrec(Node h){
//        if(h==null) return;
//        displayrec(h.next);
//        System.out.print(h.data+" ");
//    }
//    void display(){
//        displayrec(head);
//        System.out.println();
//    }

}
