package lab7.task2;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {}

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name);
        this.species = species;
    }

    public void eat() {
        System.out.println(getName() + " is eating crumbs.");
    }

    public void getVoice() {
        System.out.println(getName() + " says: Coo!");
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public String toString() {
        return super.toString() + ", species: " + species;
    }
}
