package lesson21.Ex2;

import java.util.Date;

public class Automobile extends Transport{
    private int numberOfWheel;   //số bánh xe
    private String typeOfEngine;  //loại động cơ
    private String name;  //tên xe
    private String color;  //màu xe
    private String owner;  //chủ sở hữu

    public Automobile(int numberOfWheel, String typeOfEngine, String name, String color, String owner) {
        this.numberOfWheel = numberOfWheel;
        this.typeOfEngine = typeOfEngine;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public Automobile(String brand, Date manufactureYear, String someoneProduction,
                      long price, String size, int amount, String licensePlace,
                      int numberOfWheel, String typeOfEngine, String name, String color, String owner) {
        super(brand, manufactureYear, someoneProduction, price, size, amount, licensePlace);
        this.numberOfWheel = numberOfWheel;
        this.typeOfEngine = typeOfEngine;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public Automobile() {
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


//getter và setter dạng final
    public final int getNumberOfWheel() {
        return numberOfWheel;
    }

    public final void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public final String getTypeOfEngine() {
        return typeOfEngine;
    }

    public final void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
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

    public final String getOwner() {
        return owner;
    }

    public final void setOwner(String owner) {
        this.owner = owner;
    }
}
