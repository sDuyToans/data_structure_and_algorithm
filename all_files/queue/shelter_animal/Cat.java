package all_files.queue.shelter_animal;

public class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }

    @Override
    public String name() {
        return "Cat: " + this.name;
    }
}
