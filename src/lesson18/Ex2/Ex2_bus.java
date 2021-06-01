package lesson18.Ex2;

public class Ex2_bus extends Ex2_Autumobile {
    private int numberOfSeat;  //số ghế ngồi
    private float maxPayload;  //tải trọng tối đa
    private float fuelCapacity;  //dung tích bình xăng
    private long shippedPerson;  //số khách đã trở


    public Ex2_bus(String brand, String manufactureYear, String address, long price, float weight, String id,
                   int numberOfWheel, String engineType, String name, String color, Owner owner, int numberOfSeat,
                   float maxPayload, float fuelCapacity, long shippedPerson) {
        super(brand, manufactureYear, address, price, weight, id, numberOfWheel, engineType, name, color, owner);
        this.numberOfSeat = numberOfSeat;
        this.maxPayload = maxPayload;
        this.fuelCapacity = fuelCapacity;
        this.shippedPerson = shippedPerson;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public float getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(float maxPayload) {
        this.maxPayload = maxPayload;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public long getShippedPerson() {
        return shippedPerson;
    }

    public void setShippedPerson(long shippedPerson) {
        this.shippedPerson = shippedPerson;
    }
}
