package lesson02;

public class Car02 {
    public static void main(String[] args) {

        //ứng với default constructor bên carSP28
        CarSP02 myCar = new CarSP02();

        //ứng với constructor có 1 tham số bên carSP28
        CarSP02 myCar1 = new CarSP02("Vinfast lux");

        //ứng với constructor có 2 tham số bên carSP28
        CarSP02 myCar2 = new CarSP02("Vinfast lux", 2.5f);

        //ứng với constructor có 3 tham số bên carSP28
        CarSP02 myCar3 = new CarSP02("Vinfast lux", 2.5f, 2021);

        //ứng với constructor có 4 tham số bên carSP28
        CarSP02 myCar4 = new CarSP02("Vinfast lux", 2.5f, 2021, "Vinfast");

    }
}
