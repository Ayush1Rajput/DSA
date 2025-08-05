package dsa.Queue.com.By_PW;

public class QueueByLL {


    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static class queueLL{

        Node head=null,tail=null;
        int size=0;
        public void add(int data){
            Node t = new Node(data);
            if(head==null){
                head =tail = t;
                size++;
            }
            else{
                tail.next=t;
                tail=t;
                size++;
            }
        }

        public Integer peek(){
            if(head==null){
                return null;
            }
            return head.data;
        }

        public int remove(){
            if(head==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.data;
            head=head.next;
            size--;
            return x;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.size);

    }
}
