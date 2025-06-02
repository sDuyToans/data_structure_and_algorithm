package all_files.queue.shelter_animal;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enqueue(new Cat("Cat 1"));
        animalQueue.enqueue(new Cat("Cat 2"));
        animalQueue.enqueue(new Dog("Dog 1"));
        animalQueue.enqueue(new Dog("Dog 2"));
        animalQueue.enqueue(new Dog("Dog 3"));
        animalQueue.enqueue(new Cat("Cat 3"));

        System.out.println(animalQueue.dequeueAny().name);
        System.out.println(animalQueue.dequeueDog().name);
        System.out.println(animalQueue.dequeueDog().name);
    }
}
