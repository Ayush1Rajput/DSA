package dsa.Stack;

public class Stack_By_Array {
    private Integer[] arr = new Integer[10];
    int top =0;
    void push(int data){
        arr[top]=data;
        top++;
    }

    int peek(){
        if(top==0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    int pop(){
        if(top == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = arr[top];
        arr[top--]=0;
        return temp;
    } 
}
