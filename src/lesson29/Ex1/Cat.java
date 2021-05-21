package lesson29.Ex1;

public class Cat extends Mammal {
    private int age;
    private String hobby;  //sở thích
    private String eyeColor;  //màu mắt
    private String petName;  //tên gọi

    public Cat() {
    }

    public Cat(int age, String hobby, String eyeColor, String petName) {
        this.age = age;
        this.hobby = hobby;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }


    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getHobby() {
        return hobby;
    }

    public final void setHobby(String hobby) {
        this.hobby = hobby;
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
