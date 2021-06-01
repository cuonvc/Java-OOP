package lesson29.Ex2;

public class Bus extends Automobile {
    private int numberOfSeat;  //số ghế ngồi
    private float maxTunnage;  //trọng tải tối đa
    private float capacityEnergy;  //dùng tích nhiên liệu
    private long shippedPerson;  //số khách đã chở được

    public Bus(int numberOfSeat, float maxTunnage,
               float capacityEnergy, long shippedPerson) {
        this.numberOfSeat = numberOfSeat;
        this.maxTunnage = maxTunnage;
        this.capacityEnergy = capacityEnergy;
        this.shippedPerson = shippedPerson;
    }

    public Bus(int numberOfWheel, String typeOfEngine, String name,
               String color, Owner owner, int numberOfSeat, float maxTunnage,
               float capacityEnergy, long shippedPerson) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.numberOfSeat = numberOfSeat;
        this.maxTunnage = maxTunnage;
        this.capacityEnergy = capacityEnergy;
        this.shippedPerson = shippedPerson;
    }

    public final int getNumberOfSeat() {
        return numberOfSeat;
    }

    public final void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public final float getMaxTunnage() {
        return maxTunnage;
    }

    public final void setMaxTunnage(float maxTunnage) {
        this.maxTunnage = maxTunnage;
    }

    public final float getCapacityEnergy() {
        return capacityEnergy;
    }

    public final void setCapacityEnergy(float capacityEnergy) {
        this.capacityEnergy = capacityEnergy;
    }

    public final long getShippedPerson() {
        return shippedPerson;
    }

    public final void setShippedPerson(long shippedPerson) {
        this.shippedPerson = shippedPerson;
    }
}
