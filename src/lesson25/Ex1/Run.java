package lesson25.Ex1;

public class Run {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal cat = new Cat();


        bird.move();
        System.out.println("=====================");
        bird.relax();
        System.out.println("=====================");
        fish.relax();
        System.out.println("=====================");
        fish.move();
        System.out.println("=====================");
        cat.relax();
        System.out.println("=====================");
        cat.sleep();
    }
}
