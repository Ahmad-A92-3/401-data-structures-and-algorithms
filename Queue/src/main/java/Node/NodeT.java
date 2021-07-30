package LinkedList;

public class NodeT <T> {
    private T value;
   private  NodeT<T> next;

    public NodeT(T d) {
        value = d;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public NodeT<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(NodeT<T> next) {
        this.next = next;
    }


}
