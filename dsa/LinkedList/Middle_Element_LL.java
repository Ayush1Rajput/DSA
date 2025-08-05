package dsa.LinkedList;

class list{
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public int size(){
        Node temp = head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void addLast(int data){
        Node temp = head;
        if(head==null) head = new Node(data);

        while(temp!=null){
            temp=temp.next;
        }
        temp=new Node(data);
    }
    public int midElement(){
        Node temp = head;
        if((size()/2)%2==0){
            for(int i=0;i<=size();i++){
                temp=temp.next;
            }
            return temp.data;
        }
        else {
            for(int i=0;i<size();i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }



}

public class Middle_Element_LL {
    public static void main(String[] args) {
        list ls = new list();
        ls.addLast(12);
        ls.addLast(14);
        ls.addLast(16);
        ls.addLast(18);
        ls.addLast(20);
        ls.display();


    }
}
