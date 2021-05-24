package lesson29.Ex1;

public class Fish extends Animal {
    private String color;
    private String food;

    public Fish() {
    }

    public Fish(String color, String food) {
        this.color = color;
        this.food = food;
    }

    public Fish(String name, String species, float height, float weight) {
        super(name, species, height, weight);
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getFood() {
        return food;
    }

    public final void setFood(String food) {
        this.food = food;
    }

    @Override
    public void eat(String food) {
        System.out.println("Cá ăn " + food);
    }

    @Override
    void sleep() {
        System.out.println("Cá ngủ bằng cách bơi đứng im");
    }

    @Override
    void move() {
        System.out.println("Cá di chuyển ở dưới nước");
    }

    @Override
    void relax() {
        System.out.println("Mấy con cá nhỏ đuổi nhau");
    }
}
