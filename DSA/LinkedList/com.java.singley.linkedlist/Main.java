public class Main {

    /////////////////////// Create a Node Class //////////////////////////////////
    public static class Node {
        int data;
        Node next;

        public Node(int data){    // Create a Node Constructor 
            this.data=data;
        }
    }
    static Node head;    //Create a head Node;

    ////////////////////// Create a method for adding element in last position in linkedlist //////////////////////
    public static void addLast(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = new Node(data);
        }
    }

    /////////////////////////// Create Method for display the linkedlist ////////////////////////////////// 
    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        }

    /////////////////////// Create a method for adding element in First(head) position in linkedlist //////////////////////
    
    public static void addFirst(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node p = new Node(data);
            p.next=head;
            head=p;
        }
    }

    /////////////////////// Create a method for adding element in given index position in linkedlist /////////////////////// 
    public static void addIndex(int idx, int data){
        Node p = new Node(data);
        if(idx==0){
            // p.next = head;
            // head=p;          //first method
            // return;

            addFirst(data);         // second method by calling the addFirst() method
            return;
        }

            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            // Node p = new Node(data);
            p.next = temp.next;
            temp.next = p ;
            return;
    }

    //////////////////////// Create method for finding the element(node) to given index in linkedlist ///////////////////
    public static void getElementAt(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    //////////////////////Create method for delete the element(node) to given index in linkedlist //////////////////////////
    public static void deleteAtIndex(int idx){
        Node temp = head;
        if(idx==0){
            head=head.next;
        }
        else{
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return;

        }
    }

    /////////////////////Create a method for find the nth element from last///////////////////////
    public static int NthFromLast(int pos){
        int count = 0;
        Node temp = head;
        while(temp!=null){
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

        ///////////////////// 2nd method for find the nth element from last///////////////////////
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

    /////////////////////////Create a method for delete the nth element from last //////////////////
    public static void removeNthNodeLast(int t){
        Node fast=head;
        Node slow=head;

        for(int i=1;i<=t;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
    }

    ////////////////////Create a method for for finding the intersection element(node) inlinkedlist/////////////////
    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA; Node tempB=headB;
        int lenA = 0; int lenB = 0;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(lenA>lenB){
            for(int i=1;i<=lenA-lenB;i++){
                tempA=tempA.next;
            }
        }
        else{
            for(int i=1;i<=lenB-lenA;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }

    ///////////////////////////Create method for finding the middle element(node) in linkedlist////////////////// 
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
    
    ///////////////////////////Create method for finding the middle element(node) in linkedlist////////////////// 
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

    //////////////////Create a method for check the linkedlist is cyclic or not///////////////
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

    ////////////////////Create a method for finding the cyclic element(node) in likedlist/////////////////
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

    ////////////////////Create a method to merge two sorted LL with new LL ///////////////////////
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

    ////////////////////Create a method to merge two sorted LL without creating new LL ///////////////////////
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

    
 
    
public static void main(String[] args) {
    addLast(12);
    addLast(11);
    addLast(14);
    addLast(16);
    addLast(70);
    display();
    addFirst(50);
    addFirst(40);
    addLast(20);
    addLast(26);
    display();

    addIndex(0, 100);
    display();
    System.out.println();
    getElementAt(3);

    deleteAtIndex(0);
    display();

    System.out.println(NthFromLast(3));

    Node p= NthLastNodeByS_F(5);

    System.out.println(p.data);

    removeNthNodeLast(6);
    display();
    System.out.println(getMiddleNode());

    deleteMiddleNode();
    display();
}
    
}