package DSA.LinkedList;

import java.sql.SQLOutput;

class List{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;   /////////////Declare the node type Head///////
    Node tail;
    public void addEnd(int data){
        Node temp=head;
        if(temp==null){
            head = new Node(data);
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data);
            tail=temp.next;
        }
    }

    public void addFirst(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node temp = new Node(data);
            temp.next = head;
            head=temp;

        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public void addElementIndex(int idx,int data){
        Node temp = head;
        if(idx<=0){
          Node p = new Node(data);
          p.next=head;
          head=p;
          return;
        }
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        if(temp!=null){
            Node p = new Node(data);
            p.next=temp.next;
            temp.next=p;
        }
    }

    public boolean searchByValue(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==(data)){
                System.out.println("true");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("false");
        return false;
    }
    public int length(){
        Node temp = head;
        int size = 0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    public void deleteByValue(int data){
        Node temp =head;
        while(temp!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return;
    }

    public void sortLL(){
        Node temp = head;
        while (temp!=null){
            Node temp2= head;
            while(temp2!=null && temp2.next!=null){
                if(temp2.data>temp2.next.data){
                    int t = temp2.data;
                    temp2.data= temp2.next.data;
                    temp2.next.data = t;

                }
                temp2=temp2.next;
            }
            temp=temp.next;

        }
        return;
    }




}
public class Practice {
    public static void main(String[] args) {
    List ls = new List();
    ls.addEnd(12);
    ls.addEnd(10);
    ls.addEnd(15);
    ls.addEnd(21);

    System.out.print("Adding elements in  last : ");
    ls.display();
        System.out.print("By Adding element in First : ");
    ls.addFirst(30);
    ls.display();
        System.out.print("By the Adding element by indexing :  ");
    ls.addElementIndex(2,25);
    ls.display();
    ls.searchByValue(13);

        System.out.println("the size of the linkedlist is "+ ls.length());
    ls.deleteByValue(10);
        System.out.print("After deleting the given value the linkedlist is : ");
    ls.display();

        System.out.print("After use the sort method for sort the Linkedlist : ");
    ls.sortLL();
    ls.display();
    }
}
