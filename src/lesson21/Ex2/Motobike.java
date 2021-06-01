package lesson21.Ex2;

import java.util.Date;

public class Motobike extends Transport{
    private int numberOfWheel;  //số bánh
    private String typeOfTire;  //loại lốp
    private int cylinderCapacity;  //dung tích xy lanh
    private String name;  //tên xe
    private String color;
    private long numberOfKilometerGone;  //số km đã đi
    private String typeOfEnergy;  //loại năng lượng sd


    public Motobike(int numberOfWheel, String typeOfTire, int cylinderCapacity,
                    String name, String color, long numberOfKilometerGone, String typeOfEnergy) {
        this.numberOfWheel = numberOfWheel;
        this.typeOfTire = typeOfTire;
        this.cylinderCapacity = cylinderCapacity;
        this.name = name;
        this.color = color;
        this.numberOfKilometerGone = numberOfKilometerGone;
        this.typeOfEnergy = typeOfEnergy;
    }

    public Motobike(String brand, Date manufactureYear, String someoneProduction, long price,
                    String size, int amount, String licensePlace, int numberOfWheel,
                    String typeOfTire, int cylinderCapacity, String name, String color,
                    long numberOfKilometerGone, String typeOfEnergy) {
        super(brand, manufactureYear, someoneProduction, price, size, amount, licensePlace);
        this.numberOfWheel = numberOfWheel;
        this.typeOfTire = typeOfTire;
        this.cylinderCapacity = cylinderCapacity;
        this.name = name;
        this.color = color;
        this.numberOfKilometerGone = numberOfKilometerGone;
        this.typeOfEnergy = typeOfEnergy;
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

    public final int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public final void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
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

    public final long getNumberOfKilometerGone() {
        return numberOfKilometerGone;
    }

    public final void setNumberOfKilometerGone(long numberOfKilometerGone) {
        this.numberOfKilometerGone = numberOfKilometerGone;
    }

    public final String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public final void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }
}
