package lesson25.Ex1;

public class Mammal extends Animal{
    private int foot;  //số chân
    private String color;  //màu lông
    private int teeth;  //số răng
    private String character;  //tập tính


//các phương thức được implement từ lớp abstract Animal
    @Override
    protected void sleep() {
        System.out.println("mấy con cá đang ngủ");
    }

    @Override
    protected void relax() {
        System.out.println("mấy con cá đang cắn câu");
    }

    @Override
    protected void move() {
        System.out.println("mấy con cá đang đi kiếm ăn");
    }




    public final int getFoot() {
        return foot;
    }

    public final void setFoot(int foot) {
        this.foot = foot;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getTeeth() {
        return teeth;
    }

    public final void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public final String getCharacter() {
        return character;
    }

    public final void setCharacter(String character) {
        this.character = character;
    }
}
