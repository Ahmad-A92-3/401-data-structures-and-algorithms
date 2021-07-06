package LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MergeLinkedListTest {
    @Test
    public  void mergeTest(){
        LinkedList list1 = new LinkedList();
        list1.append("1");
        list1.append("3");
        list1.append("2");

        LinkedList list2 = new LinkedList();
        list2.append("5");
        list2.append("9");
        list2.append("4");

        MergeLinkedList listZip= new MergeLinkedList();
        listZip.zipLists(list1,list2);

        assertEquals("1<<5<<3<<9<<2<<4",listZip.to_string()  );
    }

}
