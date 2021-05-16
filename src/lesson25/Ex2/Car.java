package lesson25.Ex2;

public class Car extends Automobile {
    private int numberOfDoor;   //số cửa
    private int numberOfSeat;  //số ghế ngồi
    private String type;  //loại xe
    private String energy;   //năng lương sử dụng



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


    @Override
    public void turnOn() {
        System.out.println("Xe hơi nổ máy");
    }

    @Override
    public void turnOff() {
        System.out.println("xe hơi tắt máy");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe hơi tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Xe hơi dừng lại");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe hơi bật đèn");
    }


}
