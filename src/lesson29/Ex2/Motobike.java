package lesson29.Ex2;

public class Motobike extends Transport {
    private int numberOfWheel;  //số bánh xe
    private String typeOfTire;  //loại lốp
    private float cylinder;  //dung tích xi lanh
    private String name;  //tên xe
    private String color;  //màu sắc
    private double numberOfKilometUsed;  //số km đã đi
    private String energy; //loại năng lượng

    public Motobike(int numberOfWheel, String typeOfTire,
                    float cylinder, String name, String color,
                    double numberOfKilometUsed, String energy) {
        this.numberOfWheel = numberOfWheel;
        this.typeOfTire = typeOfTire;
        this.cylinder = cylinder;
        this.name = name;
        this.color = color;
        this.numberOfKilometUsed = numberOfKilometUsed;
        this.energy = energy;
    }

    public Motobike(String brand, int manufactureYear, String madeIn, Double price, float weight) {
        super(brand, manufactureYear, madeIn, price, weight);
    }

    public final int getNumberOfWheel() {
        return numberOfWheel;
    }

    public final void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public final String getTypeOfTire() {
        return typeOfTire;
    }

    public final void setTypeOfTire(String typeOfTire) {
        this.typeOfTire = typeOfTire;
    }

    public final float getCylinder() {
        return cylinder;
    }

    public final void setCylinder(float cylinder) {
        this.cylinder = cylinder;
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

    public final double getNumberOfKilometUsed() {
        return numberOfKilometUsed;
    }

    public final void setNumberOfKilometUsed(double numberOfKilometUsed) {
        this.numberOfKilometUsed = numberOfKilometUsed;
    }

    public final String getEnergy() {
        return energy;
    }

    public final void setEnergy(String energy) {
        this.energy = energy;
    }



    @Override
    void turnOn() {
        System.out.println("Xe mô tô khởi động");
    }

    @Override
    void turnOff() {
        System.out.println("Xe mô tô tắt máy");
    }

    @Override
    void speedUp() {
        System.out.println("Xe mô tô tăng tốc");
    }

    @Override
    void stop() {
        System.out.println("Xe mô tô dừng lại");
    }

    @Override
    void lightOn() {
        System.out.println("Xe mô tô bật đèn");
    }
}
