package dsa.Queue.com;

public class Queue {
    Integer[] items;
    int front;
    int rear;
    Queue(int size){
        items = new Integer[size];
        front = -1;
        rear = -1;
    }

    public  boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return front == 0 && rear == items.length-1;
    }

    public boolean enQueue(Integer data){
        if(isFull()) return false;

        if(isEmpty()){
            front=0;
            rear=0;
            items[rear] = data;
            return true;
        }
        items[++rear] = data;
        return true;
    }

    public Integer[] shiftLeft(Integer[] inputArray){
        if(inputArray == null){
            return null;
        }
        for(int i=1;i<=rear;i++){
            inputArray[i-1] = inputArray[i];
        }
        return inputArray;
    }

    public Integer deQueue(){
        if(isEmpty()){
            return null;
        }
        if(front==rear){
            Integer val = items[rear];
            rear = -1;
            front = -1;
        }
        Integer val = items[front];
        items = shiftLeft(items);
        rear--;
        return val;
    }



}
