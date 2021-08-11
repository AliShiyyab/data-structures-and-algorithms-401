package CC10.CC10;

import java.util.*;

public class AnimalShelter<A> extends Queue {
    private String type;
    Queue animalQ = new Queue();

    //Constructor
    public AnimalShelter(String type){
        this.type = type;
    }
    public AnimalShelter(){
        this.type="cat";
    }

    //Getter and Setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    //EnQueue Function
    public String enqueue(String animals){
        String animal = animals.toLowerCase();
        if ((animal == "cat") || (animal == "dog")){
            animalQ.enQueue(animal);
            return animal + " Is Accepted because we needed only cat or dog";
        }
        else{
            return animal + " Reject, animal type is not cat or dog";
        }
    }

    //DeQueue
    public String dequeue(String pref){
        pref.toLowerCase();
        if (pref == "cat"){
            animalQ.deQueue();
            return "pref is CAT";
        }
        else if (pref == "dog"){
            animalQ.deQueue();
            return "pref is DOG";
        }
        return null;
    }

    //override toString Function

    @Override
    public String toString() {
        return animalQ.toString();
    }
}
