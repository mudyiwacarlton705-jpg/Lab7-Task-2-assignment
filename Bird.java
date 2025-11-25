package lab7.task2;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " is pecking grains.");
    }

    public void getVoice() {
        System.out.println(getName() + " chirps.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    public String toString() {
        return super.toString() + ", featherColor: " + featherColor;
    }
}
