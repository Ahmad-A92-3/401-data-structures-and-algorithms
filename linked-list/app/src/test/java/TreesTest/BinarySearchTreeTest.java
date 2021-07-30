package TreesTest;

import Tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
   private BinarySearchTree binarySearchTree;
   private BinarySearchTree binarySearchTree2;

    @BeforeEach
    public void pickUp(){
        binarySearchTree= new BinarySearchTree(5);
        binarySearchTree.Add(2);
        binarySearchTree.Add(7);
    }
    @Test
    public void addTest(){

        assertEquals(7,binarySearchTree.getRoot().getRight().getValue());
    }
    @Test
    public void ContainsTest(){

        assertTrue(binarySearchTree.Contains(7));
    }
    @Test

    void oddSumTest(){
        binarySearchTree2=new BinarySearchTree(8);
        binarySearchTree2.Add(3);
        binarySearchTree2.Add(10);
        binarySearchTree2.Add(1);
        binarySearchTree2.Add(6);
        binarySearchTree2.Add(14);
        binarySearchTree2.Add(4);
        binarySearchTree2.Add(7);
        binarySearchTree2.Add(13);
        int sum=0;
        assertEquals(24,binarySearchTree2.oddSum());

    }
}
