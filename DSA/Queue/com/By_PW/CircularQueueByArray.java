package DSA.Queue.com.By_PW;

public class CircularQueueByArray {
    public static class DeQueue{
        Integer[] arr;
        int front,rear;
        public DeQueue(int size){
            arr = new Integer[size];
            front = rear = -1;
        }

        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public boolean isFull(){
            return front == (rear + 1) % arr.length;
        }

        public Integer getFront() {
            if(isEmpty()){
                return null;
            }
            return arr[front];
        }

        public Integer getRear() {
            if(isEmpty()){
                return null;
            }
            return arr[rear];
        }

        public boolean insertAtFront(Integer data){
            if(isFull()){
                return false;
            }
            if (isEmpty()){
                front = rear = 0;
                arr[front] = data;
                return true;
            }
            if(front<1){
                front = arr.length-1;
            }
            else{
                front--;
            }
            arr[front] = data;
            return true;
        }

        public boolean insertAtRear(Integer data){
            if(isFull()){
                return false;
            }
            if (isEmpty()){
                front = rear = 0;
                arr[rear] = data;
                return true;
            }
            if(rear>1){
                rear = arr.length-1;
            }
            else{
                rear++;
            }
//            rear++;
            arr[rear] = data;
            return true;
        }

        public Integer deleteAtFront(){
            if(isEmpty()){
                return null;
            }
            if(front == rear){
                Integer val = arr[front];
                front = rear = -1;
                return val;
            }
            Integer val = arr[front];
            front = (front +1) % arr.length;
            return val;
        }

        public Integer deleteAtRear(){
            if(isEmpty()){
                return  null;
            }
            if(front == rear){
                Integer val = arr[rear];
                front = rear = -1;
                return val;
            }

            Integer val = arr[rear];

            if(rear < 1){
                rear = arr.length-1;
            } else{
                rear--;
            }
            return val;

        }
        public void display(){
            for(int i = front ;i!=rear;i=(i+1)%arr.length){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[rear]);
        }
    }

    public static void main(String[] args) {
        DeQueue dq = new DeQueue(30);
        dq.insertAtFront(10);
        dq.insertAtFront(19);
        dq.insertAtRear(15);
        dq.insertAtRear(16);
        dq.insertAtFront(50);

        dq.display(); 

    }

}
