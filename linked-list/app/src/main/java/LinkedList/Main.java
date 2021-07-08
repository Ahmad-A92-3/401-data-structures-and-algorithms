package LinkedList;
import LinkedList.LinkedList;

public class Main {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new Main().getGreeting());

//        LinkedList list1 = new LinkedList();
//        list1.append("1");
//        list1.append("3");
//        list1.append("3");
//        list1.append("1");
//        System.out.println(list1.to_string());
//        System.out.println(list1.size()/2);
//        System.out.println(list1.palindrome());
//
//        LinkedList list2 = new LinkedList();
//        list2.append("5");
//        list2.append("9");
//        list2.append("4");
//        System.out.println(list2.to_string());
//
//        MergeLinkedList listZip= new MergeLinkedList();
//        listZip.zipLists(list1,list2);

        /* this is stackLinkedList*/

        StackLinkedList<Integer> sl= new StackLinkedList<Integer>();
        // pop+push method
        sl.push(5);
        sl.push(6);
        sl.content();
        System.out.println(sl.pop());
        System.out.println("sd"+sl.content());
        System.out.println(sl.pop());
        // is empty+ peek
        System.out.println(sl.isEmpty());
        sl.push(5);
        System.out.println(sl.isEmpty());
        System.out.println(sl.peek());












    }

}
