package lesson21.Ex1;

public class Cat extends Mammal{
    private int age;  //tuổi
    private String interests;  //sở thích
    private String eyeColor;  //màu mắt
    private String petName;  //tên gọi riêng

    public Cat(int age, String interests, String eyeColor, String petName) {
        this.age = age;
        this.interests = interests;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }

    public Cat(int footNumber, String color, int toothNumber, String behavior,
               int age, String interests, String eyeColor, String petName) {
        super(footNumber, color, toothNumber, behavior);
        this.age = age;
        this.interests = interests;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void relax() {
        super.relax();
    }


//getter và setter dạng final
    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getInterests() {
        return interests;
    }

    public final void setInterests(String interests) {
        this.interests = interests;
    }

    public final String getEyeColor() {
        return eyeColor;
    }

    public final void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public final String getPetName() {
        return petName;
    }

    public final void setPetName(String petName) {
        this.petName = petName;
    }
}
