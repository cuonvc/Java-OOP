package lesson27.Ex3;

public abstract class Smartphone implements ElectronicDeviceAction {
    private String seri;  //số sê ri
    private String brand;  //hãng
    private String name;  //tên máy
    private float weight;  //trọng lượng
    private float batteryCapacity;  //dung lượng pin
    private float inch;  //kích thước bn inch

    public Smartphone() {
    }

    public Smartphone(String seri, String brand, String name, float weight, float batteryCapacity, float inch) {
        this.seri = seri;
        this.brand = brand;
        this.name = name;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.inch = inch;
    }


    public final String getSeri() {
        return seri;
    }

    public final void setSeri(String seri) {
        this.seri = seri;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final float getBatteryCapacity() {
        return batteryCapacity;
    }

    public final void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public final float getInch() {
        return inch;
    }

    public final void setInch(float inch) {
        this.inch = inch;
    }



    @Override
    public void reset() {
        System.out.println("reset điện thoại");
    }

    @Override
    public void turnOn() {
        System.out.println("Mở điện thoại lên");
    }

    @Override
    public void turnOff() {
        System.out.println("Tắt điện thoại đi");
    }

    @Override
    public void turnOffScreen() {
        System.out.println("Tắt màn hình");

    }

    @Override
    public void volumUp() {
        System.out.println("Tăng âm lượng");
    }

    @Override
    public void volumDown() {
        System.out.println("Giảm âm lượng");
    }

    @Override
    public void lightUp() {
        System.out.println("Tăng độ sáng");
    }

    @Override
    public void lightDown() {
        System.out.println("Giảm độ sáng");
    }

    @Override
    public void connect(String something) {
        System.out.println("Kết nối với thiết bị " + something);
    }

    public void unlockWithPassword(String password) {
        System.out.println("Nhập " + password + " để mở máy");
    }
}
