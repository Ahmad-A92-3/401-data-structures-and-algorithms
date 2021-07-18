package Tree;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(T value) {
        Node<T> left= new Node<>(value);
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(T value) {
        Node<T> right=new Node<>(value);
        this.right = right;
    }
}
