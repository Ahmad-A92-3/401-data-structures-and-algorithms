package LinkedList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackLinkedListTest {
    StackLinkedList<Integer> sl= new StackLinkedList<Integer>();
    @BeforeEach
    public  void starup(){

    }
    @Test
     public void pushTest1and2(){
        sl.push(5);
        sl.push(6);
        assertEquals("[ 6 ] << [ 5 ] <<  [null]",sl.content());
    }
    @Test
    public void popTest(){
        starup();
        assertEquals(6,sl.pop());
    }
    @Test
    public void popTestEmpty(){
        sl.push(5);
        sl.push(6);
        sl.pop();
        sl.pop();
        assertEquals("The stack is empty",sl.pop());
    }




//    // pop+push method
//
//        sl.content();
//        System.out.println(sl.pop());
//        System.out.println(sl.pop());
//    // is empty+ peek
//        System.out.println(sl.isEmpty());
//        sl.push(5);
//        System.out.println(sl.isEmpty());
//        System.out.println(sl.peek());

}
