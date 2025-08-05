package dsa.Queue.com;

public class Main {
    public static void main(String[] args) {
        DynamicQueue dq = new DynamicQueue();
        dq.enQueue(12);
        dq.enQueue(13);
        System.out.println(dq.deQueue());
        System.out.println(dq.peek());


    }
}
