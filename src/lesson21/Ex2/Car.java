package lesson21.Ex2;

public class Car extends Automobile{
    private int numberOfDoor;  //số cửa
    private int numberOfChair;  //số ghế
    private String energy;  //nhiên liẹu sử dụng


    public Car(int numberOfDoor, int numberOfChair, String engine) {
        this.numberOfDoor = numberOfDoor;
        this.numberOfChair = numberOfChair;
        this.energy = engine;
    }

    public Car(int numberOfWheel, String typeOfEngine, String name, String color,
               String owner, int numberOfDoor, int numberOfChair, String engine) {
        super(numberOfWheel, typeOfEngine, name, color, owner);
        this.numberOfDoor = numberOfDoor;
        this.numberOfChair = numberOfChair;
        this.energy = engine;
    }


    @Override
    public void active() {
        super.active();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void turnOnLight() {
        super.turnOnLight();
    }


    public final int getNumberOfDoor() {
        return numberOfDoor;
    }

    public final void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public final int getNumberOfChair() {
        return numberOfChair;
    }

    public final void setNumberOfChair(int numberOfChair) {
        this.numberOfChair = numberOfChair;
    }

    public final String getEngine() {
        return energy;
    }

    public final void setEngine(String engine) {
        this.energy = engine;
    }
}
