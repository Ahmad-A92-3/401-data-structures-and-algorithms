package LinkedList;

public class QueueLinkedLIst<T> {
    private NodeT<T> front;
    private NodeT<T> back;

    public void enqueue(T value){
         NodeT<T> newNode = new NodeT<T>(value);

        if (front == null){
             front= newNode;
             back=newNode;
         } else {
           NodeT<T> current  = back.getNext();
           current=newNode;
           back=newNode;
        }
     }
    public T dequeue(){
        if (front==null){
            return (T) "the Queue is empty";
        }else{
            NodeT<T> current = front;
            front=front.getNext();
            return current.getValue();
        }
   }
   public T peek(){
        if (front==null){
            return (T) "the Queue is empty";
        }else{
            return front.getValue();
        }
   }
   public boolean isEmpty(){
        return front==null;
   }

    @Override
    public String toString() {
        return "QueueLinkedLIst{" +
                "front=" + front.getValue() +
                ", back=" + back.getValue() +
                '}';
    }
}
