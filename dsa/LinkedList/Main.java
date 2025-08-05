package dsa.LinkedList;

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data ) { // create a Constructer
        this.data = data;
    }
}

////////////////////////////////////////////////////////////
class LinkedList{
     Node head;

    //////// code for add elements in last ///////////
    public void addLast(int data){

        if(head == null){
            head = new Node(data);
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    //////// code for add elements in first ///////////
    public void addFirst(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node p = new Node(data);
            p.next = head;
            head = p;
        }
    }


    //////// code for Search element in LinkedList///////////
    public boolean SearchByValue(int data){
        Node temp = head;
        while(temp!=null){
           if(temp.data==(data)){
               return true;
        }
            temp = temp.next;
        }
        return false;
    }


    //////////Add element in index //////
    public void addAtIndex(int index,int data){
        Node temp = head;
        if(index<=0){
            Node p = new Node(data);
           p.next = head;
           head = p;
        }
//        Node temp = head;
        for(int i=1;i<index;i++){
            System.out.println(temp.next);
            temp=temp.next;
        }

        if(temp != null){
            Node p = new Node(data);
            p.next = temp.next;
            temp.next = p;
        }
    }

//////////////////////Delete element by Value/////////////////////////

    public boolean deleteByValue(int data){
        Node temp = head, pre = null;
        while(temp != null){
            if(temp.data==data){     // if Data is String type then check by this (temp.data.equals(data));
                pre.next = temp.next;
                return true;
            }
            pre = temp ;
            temp = temp.next;
        }
        return false;
    }

    ////////////////////Sort the LinkedList/////////////
    public void sort(){
        Node temp = head;
        while(temp!=null){

            Node temp2 = head;
            while(temp2!=null && temp2.next!=null){
                if(temp2.next.data<temp2.data){
                    int t = temp2.data;
                    temp2.data = temp2.next.data;
                    temp2.next.data=t;
                }
                temp2=temp2.next;
            }
            temp=temp.next;
        }
    }

    public void reverse(Node head){
        Node temp = head;
        if(temp==null){
            return ;
        }
        reverse(temp.next);
        System.out.print(temp.data+"  ");
    }



    //////////////For Find the length of given LinkedList/////////////////////
    public int size(){
        int len = 0;
        Node temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    

    ///////////Code for find the midNode////////////
    public Node midNode(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    //////// code for Display the elements ///////////
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void RotateOnce() {
        Node temp = head;
        Node pre = null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        temp.next = head;
        head = temp;
    }

    public void RotateOnceReverse() {
        Node temp = head;
        Node temp1 = temp.next;
        Node s=temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next=s;
        s.next=null;
        head=temp1;

    }

    public void ShiftRight(int data) {
        while (data != 0) {
            RotateOnce();
            data--;
        }
    }

    public void ShiftLeft(int data) {
        while (data != 0) {
            RotateOnceReverse();
            data--;
        }
    }

//    public void oddDisplay(){
//        Node temp = head;
//        while(temp.next!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next.next;
//        }
//        System.out.println();
//    }

}

/////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        Scanner sc = new Scanner(System.in);
//        ls.addLast(10);
//        ls.addLast(30);
//        ls.addLast(20);
//        ls.addLast(70);
//        ls.addLast(40);


        //This is the way to enter the data of linkedlist  by the user

        System.out.print("Enter the length of linkedList : ");
        int n = sc.nextInt();
        while(n>0){
            ls.addLast(sc.nextInt());
                n--;
        }



//        ls.oddDisplay();

//        ls.addLast(60);
//        System.out.print("Enter the length: ");
//        int n = sc.nextInt();
//        System.out.println("Enter Values :");
//        for(int i=0;i<n;i++){
//            ls.addLast(sc.nextInt());
//        }
        System.out.print("Given Data is here : ");
        ls.display();

//        System.out.println("Enter Values :");
//        for(int i=0;i<n;i++){
//            ls.addFirst(sc.nextInt());
//        }

//        System.out.print("Given Data is here : ");
//        ls.display();

//        Call the Method of SeachByValue

//        if(ls.SearchByValue(5)!=null){
//            System.out.println(ls.SearchByValue(4).data);
//        }
//        else{
//            System.out.println("Data Not Found");
//        }


//        Add element by Index

//        ls.addAtIndex(-1,12);
//        ls.display();

//        delete elements by searching the value

//        ls.deleteByValue(2);
//        ls.display();

        //        For find the length
        System.out.println("Size of LinkedList is :"+ls.size());


        //  For print the midNode

        System.out.println("The Mid Node is : "+ls.midNode().data);

//        ls.sort();
        ls.display();

//        called the sort method
        ls.sort();
        System.out.print("The sorted order LinkedList is : ");
        ls.display();


//        ls.midElement();

        ls.reverse(ls.head);

    }
}
