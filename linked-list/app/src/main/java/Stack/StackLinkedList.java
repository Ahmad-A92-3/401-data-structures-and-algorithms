package Stack;

import LinkedList.NodeT;

public class StackLinkedList <T> {
    private NodeT<T> top;

    public void  push(T data){
        NodeT<T> newNode = new NodeT<>(data);
        if (top == null){
            top= newNode;
        }else{
            newNode.setNext(this.top);
            this.top=newNode;
        }
    }

    public String content(){
        NodeT<T> current = this.top;
        String commulative="";
        while (current != null){
            commulative += "[ "+current.getValue()+" ] << ";
            current= current.getNext();
        }
        commulative += " [null]";
        System.out.println(commulative);
        return commulative;
    }
    public T pop(){
        if (this.top == null){
            return (T)"The stack is empty ";

        }else {
            NodeT<T> oldTop= top;
            top = top.getNext();
            oldTop.setNext(null);
            return oldTop.getValue();
        }
    }
    public T peek(){
        if (top==null){
            return (T) "the stack is empty";
        } else{
            return top.getValue();
        }
    }
    public boolean isEmpty(){
        return top==null;
    }




}
