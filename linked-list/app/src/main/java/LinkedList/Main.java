package LinkedList;
import LinkedList.LinkedList;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new Main().getGreeting());

        LinkedList linkedList = new LinkedList();
        linkedList.insert("2");
        linkedList.insert("3");
        linkedList.insert("4");
        linkedList.append("0");
        linkedList.insertBefore("2","1");
        linkedList.insertAfter("2","-1");

        System.out.println(linkedList.includes("2"));
        System.out.println(linkedList.to_string());

//        linkedList.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);


    }

}
