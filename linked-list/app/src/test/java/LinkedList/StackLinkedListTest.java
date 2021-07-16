package LinkedList;


import Stack.StackLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackLinkedListTest {
    StackLinkedList<Integer> sl= new StackLinkedList<Integer>();
    @BeforeEach
    public  void starup(){
        sl.push(5);
        sl.push(6);

    }
    @Test
     public void pushTest1and2(){

        assertEquals("[ 6 ] << [ 5 ] <<  [null]",sl.content());
    }
    @Test
    public void popTest(){
        assertEquals(6,sl.pop());
    }
    @Test
    public void popTestEmpty(){
        sl.pop();
        sl.pop();
        assertTrue(sl.isEmpty());

    }

    @Test
    public void peekTest(){
        sl.push(5);
        sl.push(6);
        assertEquals(6,sl.peek());

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
