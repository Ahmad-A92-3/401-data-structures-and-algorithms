package Animal;
import Queue.QueueLinkedLIst;

public class AnimalShelter {
     QueueLinkedLIst<AnimalEat> animalQueue= new QueueLinkedLIst<AnimalEat>() ;

    public void enqueue(AnimalEat animal){

        animalQueue.enqueue(animal);
    }
    public String toString(){
        return animalQueue.toString();
    }
     public String dequeue( String pref){

        if (animalQueue.isEmpty()){
            return "Sorry, the queue is empty";
        }

        if ( pref.equals("dog")){
            while(! animalQueue.isEmpty() ){
                AnimalEat popedValue =animalQueue.dequeue();
                if (popedValue instanceof Dog){
                    return  popedValue.getName();
                }
            }
            return "No Dog on the queue";

        } else if ( pref.equals("cat") ){
            while(! animalQueue.isEmpty() ){
                AnimalEat popedValue =animalQueue.dequeue();
                if (popedValue instanceof Cat){
                    return popedValue.getName();
                }
            }
            return "No Cat on the queue";
        } else {
            return null;
        }
     }



}
