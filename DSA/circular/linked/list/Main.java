package DSA.circular.linked.list;

class Node{
    int data;
    Node next;
    public Node(int data){

        this.data=data;
    }
}
class circularLinkedList{
    Node head;
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
        }
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next= newNode;
        newNode.next=head;
        head = newNode;
        return;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
        }
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.next = head;



//        temp.next= newNode;
//        newNode.next=head;
//        head = newNode;
//        return;
    }
    public void display(){
        Node temp = head;
        while(temp.next !=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
        System.out.println("null");
    }

}
public class Main {
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        cll.insertLast(10);
        cll.insertLast(20);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.display();
        cll.insertFirst(50);
        cll.display();
    }

}
