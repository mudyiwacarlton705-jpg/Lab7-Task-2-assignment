package lab7.task2;

public class Mammal extends Animal {
    private String furColor;

    public Mammal() {}

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " is eating like a mammal.");
    }

    public void getVoice() {
        System.out.println(getName() + " makes mammal sounds.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    public String toString() {
        return super.toString() + ", furColor: " + furColor;
    }
}
