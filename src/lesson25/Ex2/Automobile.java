package lesson25.Ex2;

public class Automobile extends Transpost{
    private int wheel;   //số bánh xe
    private String typeOfEngine;  //loại động cơ
    private String name;   //tên xe
    private String color;  //màu xe
    private String owner;  //chủ sở hữu


    public final int getWheel() {
        return wheel;
    }

    public final void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public final String getTypeOfEngine() {
        return typeOfEngine;
    }

    public final void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getOwner() {
        return owner;
    }

    public final void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public void turnOn() {
        System.out.println("Khởi động ô tô");
    }

    @Override
    public void turnOff() {
        System.out.println("Ô tô tắt máy");
    }

    @Override
    public void speedUp() {
        System.out.println("Ô tô tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Ô tô dừng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Ô tô bật đèn");
    }
}
