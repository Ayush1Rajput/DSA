package dsa.LinkedList;

import java.util.Scanner;



public class Nth_Node_FromLast {

    public static void addLast(int data){

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
    public static int NthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m = size-n+1;
    temp=head;
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        addLast(10);
        addLast(30);
        addLast(20);
        addLast(70);
        addLast(40);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last index value: ");
        int n=sc.nextInt();


        System.out.print(n+" Node is : ");
        System.out.println(NthNode(head,n));;
    }
}
