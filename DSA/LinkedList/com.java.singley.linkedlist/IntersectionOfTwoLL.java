public class IntersectionOfTwoLL {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    static Node head;
    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA; Node tempB=headB;
        int lenA = 0; int lenB = 0;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(lenA>lenB){
            for(int i=1;i<=lenA-lenB;i++){
                tempA=tempA.next;
            }
        }
        else{
            for(int i=1;i<=lenB-lenA;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}
