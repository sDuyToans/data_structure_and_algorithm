package all_files.queue.shelter_animal;


import java.util.LinkedList;

public class AnimalQueue {
    public LinkedList<Dog> dogs = new LinkedList();
    public LinkedList<Cat> cats = new LinkedList();
    public int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order++);
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public int size(){
        return dogs.size() + cats.size();
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

    public Dog peekDog() {
        return dogs.peek();
    }

    public Cat peekCat() {
        return cats.peek();
    }

    // dequeue Any
    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        } else {
            if (dogs.peek().isOlderThan(cats.peek())) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
    }

    // peek any
    public Animal peekAny() {
        if (dogs.isEmpty()) {
            return peekCat();
        } else if (cats.isEmpty()) {
            return peekDog();
        } else {
            if (dogs.peek().isOlderThan(cats.peek())) {
                return peekDog();
            } else {
                return peekCat();
            }
        }
    }
}
