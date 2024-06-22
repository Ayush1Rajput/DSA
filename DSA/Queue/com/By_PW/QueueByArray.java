package DSA.Queue.com.By_PW;

public class QueueByArray {
    public static class QueueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[50];

        public void add(int data){
            if(rear==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front = rear = 0;
                arr[rear]=data;
            }
            else{
                arr[++rear]=data;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            size--;
            return arr[front++];
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
            }
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }


}
