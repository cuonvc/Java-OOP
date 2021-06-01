package lesson29.Ex2;

public class Car extends Automobile {
    private int numberOfDoor;  //số cửa
    private int numberOfSeat;  //số ghế ngồi
    private String type;  //loại xe
    private String energy;  //loại nhiên liệu


    public Car(int numberOfDoor, int numberOfSeat,
               String type, String energy) {
        this.numberOfDoor = numberOfDoor;
        this.numberOfSeat = numberOfSeat;
        this.type = type;
        this.energy = energy;
    }

    public Car(int numberOfWheel, String typeOfEngine, String name,
               String color, Owner owner, int numberOfDoor, int numberOfSeat,
               String type, String energy) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.numberOfDoor = numberOfDoor;
        this.numberOfSeat = numberOfSeat;
        this.type = type;
        this.energy = energy;
    }

    public final int getNumberOfDoor() {
        return numberOfDoor;
    }

    public final void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public final int getNumberOfSeat() {
        return numberOfSeat;
    }

    public final void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }

    public final String getEnergy() {
        return energy;
    }

    public final void setEnergy(String energy) {
        this.energy = energy;
    }
}
