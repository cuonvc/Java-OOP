package lesson25.Ex2;

public class Run {
    public static void main(String[] args) {
        Transpost autoMobile = new Automobile();
        autoMobile.speedUp();
        autoMobile.lightOn();

        Transpost motobike = new Motobike();
        motobike.turnOn();
        motobike.turnOff();

        Transpost car = new Car();
        car.speedUp();
        car.stop();
        car.turnOff();
    }
}
