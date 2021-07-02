package LinkedList;

public class Node {
    String value;
    Node next;

    Node(String d) {
        value = d;
        next = null;
    }
    public String getData(){
        return this.value;
    }
    public Node getNext(){
       return this.next;
    }
}
