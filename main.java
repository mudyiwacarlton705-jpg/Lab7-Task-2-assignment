package lab7.task2;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Rex", 5, 20.5, "brown", "terrier");
        animals[1] = new Dog("Bolt", "husky");

        animals[2] = new Pigeon("Sky", 2, 1.2, "grey", "rock");
        animals[3] = new Pigeon("Cloud", "city");

        animals[4] = new Blowfish("Bubble", 1, 0.7, "yellow", 15);
        animals[5] = new Blowfish("Spike", 25);

        for (Animal a : animals) {
            System.out.println(a.toString());
            a.eat();
            a.getVoice();
            System.out.println();
        }
    }
}
