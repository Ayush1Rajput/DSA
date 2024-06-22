package DSA.LinkedList;
class Del{
    Node head;
    public static class Node{
        int val;
        Node next;
        Node(int data){
            val=data;        }
    }
    public void addEnd(int data){
        Node temp = head;
        if(head==null) {
            head=new Node(data);
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data);
        }

    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteElement(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.next.val==data){
                temp.next=temp.next.next;
                break;

            }
            temp=temp.next;
        }

    }

}
public class delete_node {
    public static void main(String[] args) {
     Del ls = new Del();
     ls.addEnd(12);
     ls.addEnd(14);
     ls.addEnd(15);
     ls.addEnd(17);
     ls.addEnd(21);
     ls.display();
     ls.deleteElement(17);
     ls.display();

    }
}
