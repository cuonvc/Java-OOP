package lesson25.Ex2;

public class Motobike extends Transpost {
    private int numberOfWheel;  //số bánh xe
    private String typeOfWheel;  //loại lốp xe
    private float capacityCylinder;  //dung tích xi lanh
    private String name;  //tên xe
    private String color;  //màu sắc
    private String kilometed;  //số km đã đi
    private String energy; //loại năng lượng sd




    public final int getNumberOfWheel() {
        return numberOfWheel;
    }

    public final void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public final String getTypeOfWheel() {
        return typeOfWheel;
    }

    public final void setTypeOfWheel(String typeOfWheel) {
        this.typeOfWheel = typeOfWheel;
    }

    public final float getCapacityCylinder() {
        return capacityCylinder;
    }

    public final void setCapacityCylinder(float capacityCylinder) {
        this.capacityCylinder = capacityCylinder;
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

    public final String getKilometed() {
        return kilometed;
    }

    public final void setKilometed(String kilometed) {
        this.kilometed = kilometed;
    }

    public final String getEnergy() {
        return energy;
    }

    public final void setEnergy(String energy) {
        this.energy = energy;
    }





    @Override
    public void turnOn() {
        System.out.println("Xe Moto khởi động");
    }

    @Override
    public void turnOff() {
        System.out.println("Xe moto tắt máy");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe moto tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Xe mô tô dừng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe moto bật đèn");
    }
}
