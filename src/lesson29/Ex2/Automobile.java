package lesson29.Ex2;

public class Automobile extends Transport {
    private int numberOfWheel;  //số bánh xe
    private String typeOfEngine;  //loại động cơ
    private String name;  //tên xe
    private String color;  //màu xe
    private Owner owner;  //chủ sở hữu

    public Automobile() {
    }

    public Automobile(int numberOfWheel, String typeOfEngine,
                      String name, String color, Owner owner) {
        this.numberOfWheel = numberOfWheel;
        this.typeOfEngine = typeOfEngine;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public Automobile(String brand, int manufactureYear, String madeIn, Double price, float weight) {
        super(brand, manufactureYear, madeIn, price, weight);
    }

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

    public final Owner getOwner() {
        return owner;
    }

    public final void setOwner(Owner owner) {
        this.owner = owner;
    }


    class Owner {
        private String idCard;  //số cmnd
        private int age; //tuổi
        private String fullName; //họ và tên

        public Owner(String idCard, int age, String fullName) {
            this.idCard = idCard;
            this.age = age;
            this.fullName = fullName;
        }

        public final String getIdCard() {
            return idCard;
        }

        public final void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public final int getAge() {
            return age;
        }

        public final void setAge(int age) {
            this.age = age;
        }

        public final String getFullName() {
            return fullName;
        }

        public final void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

    @Override
    void turnOn() {
        System.out.println("xe ô tô khởi động");
    }

    @Override
    void turnOff() {
        System.out.println("Xe ô tô tắt máy");
    }

    @Override
    void speedUp() {
        System.out.println("Xe ô tô tăng tốc");
    }

    @Override
    void stop() {
        System.out.println("Xe ô tô phanh lại");
    }

    @Override
    void lightOn() {
        System.out.println("Xe ô tô bật đèn");
    }
}
