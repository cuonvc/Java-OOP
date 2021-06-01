package lesson18.Ex2;

public class Ex2_MotoBike extends Ex2_Transport {
    private String tireType;  //loại lốp
    private int cylinderCapacity;  //dung tích xi lanh
    private String name;
    private String color;
    private long numberOfKm;  //số km đã đi

    public Ex2_MotoBike(String brand, String manufactureYear, String address, long price, float weight, String id,
                        String tireType, int cylinderCapacity, String name, String color, long numberOfKm) {
        super(brand, manufactureYear, address, price, weight, id);
        this.tireType = tireType;
        this.cylinderCapacity = cylinderCapacity;
        this.name = name;
        this.color = color;
        this.numberOfKm = numberOfKm;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getNumberOfKm() {
        return numberOfKm;
    }

    public void setNumberOfKm(long numberOfKm) {
        this.numberOfKm = numberOfKm;
    }
}
