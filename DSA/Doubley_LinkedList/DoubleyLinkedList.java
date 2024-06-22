package DSA.Doubley_LinkedList;

 class DoubleyLinkedList {
    private static class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data=data;
        }
    }
    Node head,tail;
    int length=0;
//     void insertFirst(int data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = tail = newNode;
//            return ;
//        }
//        newNode.next=head;
//        head.previous=newNode;
//        head=newNode;
//        return ;
//
//    }
    public void addAtEnd(int data){
        if(head==null){
            head = tail = new Node(data);
            return;
        }
        Node p = new Node(data);
        p.previous = tail;
        tail.next = p ;
        tail = p;
        return;
    }
    void addHead(int data){
        if(head==null){
            head = tail = new Node(data);
            return;
        }
        else{
            Node p = new Node(data);
            head.previous = p;
            p.next=head;
            head=p;
            return;
        }
    }

    void addTail(int data){
        if(head == null){
            head = tail = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t = new Node(data);
        temp.next= t;
        t.previous = temp;
        return;

    }

    void insertAtIndex(int idx,int data){
        Node temp = head;
        Node t = new Node(data);
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next.previous = t ;
        t.previous = temp;
        t.next = temp.next;
        temp.next=t;
        return;
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
        return ;

    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public void displayRev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.previous;
        }
        System.out.println();
    }

    public void deleteLast(){
        if (head == null) return;

        if (head == tail){
            head = tail = null;
            return;
        }
        Node p = tail.previous;
        p.next = null;
        tail.previous = null;
        tail = p ;
        return;
    }

    public void deleteFirst(){
        if (head == null) return;

        if (head == tail){
            head = tail = null;
            return;
        }

        Node p = head.next;
        p.previous = null;
        head.next = null;
        head = p;
        return;

    }

//    Delete element by using with tail only use head
    public static Node deleteAtMid(Node head){
         if(head==null) return null;

         if(head.next==null){
             head = null;
             return null;
         }

         Node slow = head;
         Node fast = head;
         Node pre = null;

         while (fast != null && fast.next !=null){
             pre = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
         pre.next = pre.next.next;
         pre.next.previous = pre;

         return null;
    }

    public void deleteAtIndex(int idx){
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
    }


    public void shiftListLeft(int n){

    }

}


//all the methods are called in node.java file

