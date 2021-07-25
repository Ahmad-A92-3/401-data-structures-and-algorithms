package TreesTest;

import Tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BinaryTreesTest {
    BinaryTree<Integer> binaryTest;
    @BeforeEach
    public void pickUp(){
        binaryTest= new BinaryTree<Integer>(5);
        binaryTest.getRoot().setLeft(3);
        binaryTest.getRoot().setRight(2);
        binaryTest.getRoot().getLeft().setRight(1);

    }

    @Test
    public void binaryTreeRootTest(){
        assertEquals(5,binaryTest.getRoot().getValue());
    }

    @Test
    public void addLeftTest(){
        assertEquals(3,binaryTest.getRoot().getLeft().getValue());
    }

    @Test
    public void addRightTest(){
        assertEquals(2,binaryTest.getRoot().getRight().getValue());
    }

    @Test
    void preOrderTest(){
        assertEquals("<<5<<3<<1<<2",binaryTest.preOrder(binaryTest.getRoot()));
    }

    @Test
    void inOrderTest(){
        assertEquals("<<3<<1<<5<<2",binaryTest.inOrder(binaryTest.getRoot()));
    }

    @Test
    void PostOrderTest(){
        assertEquals("<<1<<3<<2<<5",binaryTest.PostOrder(binaryTest.getRoot()));
    }
    @Test
    void maxTest(){
        assertEquals(5,binaryTest.max());
    }
}
