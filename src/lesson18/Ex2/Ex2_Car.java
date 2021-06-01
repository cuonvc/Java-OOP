package lesson18.Ex2;

public class Ex2_Car extends Ex2_Autumobile {
    private int numberOfdoor; //số cửa
    private int numberOfSeat;  //số chỗ ngồi
    private String type;  //loại xe
    private String fuelType;  //loại nhiên liệu

    public Ex2_Car(String brand, String manufactureYear, String address, long price, float weight, String id,
                   int numberOfWheel, String engineType, String name, String color, Owner owner, int numberOfdoor,
                   int numberOfSeat, String type, String fuelType) {
        super(brand, manufactureYear, address, price, weight, id, numberOfWheel, engineType, name, color, owner);
        this.numberOfdoor = numberOfdoor;
        this.numberOfSeat = numberOfSeat;
        this.type = type;
        this.fuelType = fuelType;
    }

    public int getNumberOfdoor() {
        return numberOfdoor;
    }

    public void setNumberOfdoor(int numberOfdoor) {
        this.numberOfdoor = numberOfdoor;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
