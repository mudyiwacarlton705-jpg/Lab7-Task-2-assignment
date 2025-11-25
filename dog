package lab7.task2;

public class Dog extends Mammal {
    private String breed;

    public Dog() {}

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }

    public void getVoice() {
        System.out.println(getName() + " says: Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    public String toString() {
        return super.toString() + ", breed: " + breed;
    }
}
