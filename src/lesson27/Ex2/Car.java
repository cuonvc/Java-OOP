package lesson27.Ex2;

import java.util.Date;

public class Car extends Transpost {
    private Owner owner;   //chủ sở hữu
    private String idCar;   //biển số xe
    private Date signUpDate;   //ngày đăng ký
    private String idFremes;   //số khung
    private String idEngine;   //số máy
    private String engineType;  //loại động cơ
    private int numberOfSeat;    //số ghế ngồi


    public Car() {
    }


    public Car(Owner owner, String idCar, Date signUpDate, String idFremes,
               String idEngine, String engineType, int numberOfSeat) {
        this.owner = owner;
        this.idCar = idCar;
        this.signUpDate = signUpDate;
        this.idFremes = idFremes;
        this.idEngine = idEngine;
        this.engineType = engineType;
        this.numberOfSeat = numberOfSeat;
    }

    public Car(String brand, String manufactureYear, String name, double price, float weight,
               String type, Owner owner, String idCar, Date signUpDate, String idFremes,
               String idEngine, String engineType, int numberOfSeat) {
        super(brand, manufactureYear, name, price, weight, type);
        this.owner = owner;
        this.idCar = idCar;
        this.signUpDate = signUpDate;
        this.idFremes = idFremes;
        this.idEngine = idEngine;
        this.engineType = engineType;
        this.numberOfSeat = numberOfSeat;
    }


    public final Owner getOwner() {
        return owner;
    }

    public final void setOwner(Owner owner) {
        this.owner = owner;
    }

    public final String getIdCar() {
        return idCar;
    }

    public final void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public final Date getSignUpDate() {
        return signUpDate;
    }

    public final void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public final String getIdFremes() {
        return idFremes;
    }

    public final void setIdFremes(String idFremes) {
        this.idFremes = idFremes;
    }

    public final String getIdEngine() {
        return idEngine;
    }

    public final void setIdEngine(String idEngine) {
        this.idEngine = idEngine;
    }

    public final String getEngineType() {
        return engineType;
    }

    public final void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public final int getNumberOfSeat() {
        return numberOfSeat;
    }

    public final void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }



    class Owner {
        private String idCard;  //số cmnd
        private String fullName;  //họ và tên
        private String age;  //tuổi
    }


    @Override
    public void startEngine() {
        System.out.println("Xe " + getName() + " đang khởi động");
    }

    @Override
    public void shutdown() {
        System.out.println("Xe " + getName() + " đã tắt máy");
    }

    @Override
    public void stop() {
        System.out.println("Xe " + getName() + " đã dừng lại");
    }

    @Override
    public void speedUp() {
        System.out.println("Xe " + getName() + " đang tăng tốc");
    }

    @Override
    public void lightOn() {
        System.out.println("Xe " + getName() + " vừa bâkt đèn");
    }

    public void refuel() {
        System.out.println("xe " + getName() + " đang đổ xăng");
    }
}
