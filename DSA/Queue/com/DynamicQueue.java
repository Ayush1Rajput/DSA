package DSA.Queue.com;

public class DynamicQueue {
    public static class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data=data;
        }
    }

    Node front,rear;

    public boolean isEmpty(){
        return front==rear;
    }

    public void enQueue(Integer data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front=rear=newNode ;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        return;
    }

    public Integer deQueue(){
        if(isEmpty()){
            return null;
        }
        if(front == rear){
            Integer val = front.data;
            front=null;
            rear=null;
            return val;
        }
        Integer val = front.data;
        front=front.next;
        return val;
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        Integer val = front.data;
        return val;
    }

    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue();
        dq.enQueue(12);
        dq.enQueue(14);
        System.out.println(dq.peek());
        dq.peek();
    }

}
