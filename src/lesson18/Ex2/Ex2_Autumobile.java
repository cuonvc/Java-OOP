package lesson18.Ex2;

public class Ex2_Autumobile extends Ex2_Transport {
    private int numberOfWheel;  //số bánh xe
    private String engineType;  //loại động cơ
    private String name;   //tên xe
    private String color;  //màu xe
    private Owner owner;  //chủ sở hữu


//constructors
    public Ex2_Autumobile(String brand, String manufactureYear, String address, long price, float weight,
                          String id, int numberOfWheel, String engineType, String name, String color, Owner owner) {
        super(brand, manufactureYear, address, price, weight, id);
        this.numberOfWheel = numberOfWheel;
        this.engineType = engineType;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

//getter and setter
    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}


class Owner {  //lớp chứa các thông tin của chủ xe
    private String id;
    private String firstName;
    private String midName;
    private String lastName;

    //constructors
    public Owner(String id, String firstName, String midName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }
}