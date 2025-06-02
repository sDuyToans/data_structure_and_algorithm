package all_files.queue.shelter_animal;

public class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }
    @Override
    public String name() {
        return "Dog: " + this.name;
    }
}
