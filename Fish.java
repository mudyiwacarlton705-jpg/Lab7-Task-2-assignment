package lab7.task2;

public class Fish extends Animal {
    private String scaleColor;

    public Fish() {}

    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " is eating underwater.");
    }

    public void getVoice() {
        System.out.println(getName() + " cannot produce voice.");
    }

    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    public String toString() {
        return super.toString() + ", scaleColor: " + scaleColor;
    }
}
