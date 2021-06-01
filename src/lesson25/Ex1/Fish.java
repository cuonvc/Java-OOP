package lesson25.Ex1;

public class Fish extends Animal{
    private String color;  //màu sắc
    private String food;  //thức ăn

    @Override
    protected void sleep() {
        System.out.println("Mấy con cá chắc không ngủ");
    }

    @Override
    protected void relax() {
        System.out.println("Mấy con cá đang cắn câu");
    }

    @Override
    protected void move() {
        System.out.println("Đàn cá đang bơi ngược dòng nước");
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
}
