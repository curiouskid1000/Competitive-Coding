public class Intersectionofnodes  {
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
        }
    public Node getIntersectionNode(Node head1, Node head2){
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) 
            {if (temp == head2) {
                return head2;
            }
            temp = temp.next;
        }
        head2 = head2.next;
    }
    return null;
}
public static void main(String[] args){Solution list = new Solution();Node head1, head2;head1 = new Node(10);head2 = new Node(3);}
}
