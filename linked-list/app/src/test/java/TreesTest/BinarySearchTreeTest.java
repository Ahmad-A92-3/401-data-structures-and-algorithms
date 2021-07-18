package TreesTest;

import Tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
   private BinarySearchTree binarySearchTree;

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
}
