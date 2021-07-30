import Animal.AnimalShelter;
import Animal.Cat;
import Animal.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnimalTest {
    private AnimalShelter shelter;
    @BeforeEach
    void pickUp(){
        Cat cat1= new Cat("chery","cherasy","black");
        Cat cat2= new Cat("chery2","cherasy","black");
        Dog dog1= new Dog("boob","unknow",10,2);
        Dog dog2= new Dog("boob2","unknow",10,2);
        shelter= new AnimalShelter();
        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
    }
    @Test
    void dequeueTest(){
        assertEquals("chery",shelter.dequeue("cat"));
    }
    @Test
    void dequeueTest2(){
        shelter.dequeue("cat");
        assertEquals("chery",shelter.dequeue("cat"));
    }


}
