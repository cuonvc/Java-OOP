package lesson27.Ex1;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog("abc");
        dog.setColor("Đen");
        dog.setAge(7);

        System.out.println("Màu lông con chó là màu " + dog.getColor());
        System.out.println("Tuổi: " + dog.getAge() + " tuổi");

        dog.eat("fish");
        dog.bark();
    }
}
