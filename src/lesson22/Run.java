package lesson22;

public class Run {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal fish = new Fish();
        Animal bird = new Bird();

        //gọi ra các phương thức override
        animal.move();
        cat.move();
        fish.move();
        bird.move();
    }
}
