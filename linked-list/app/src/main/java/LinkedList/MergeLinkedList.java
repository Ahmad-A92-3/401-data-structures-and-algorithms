package LinkedList;

public class MergeLinkedList extends LinkedList{
    public Object zipLists(LinkedList list1, LinkedList list2){
//        LinkedList listZip = new LinkedList();
        if (list1.size() != list2.size()){
            return "to use this method the the two list should have the same length";
        }
        Node current1= list1.head;
        Node current2= list2.head;

        while (current1 != null){
            this.append(current1.value);
            this.append(current2.value);
            current1=current1.getNext();
            current2=current2.getNext();
        }
        System.out.println(this.to_string());
        return this;
    }

}
