package lesson18.Ex1;

public class Ex1_Cat extends Ex1_Animal {
    private int age;
    private String interests;  //sở thích
    private String eyeColor;  //màu mắt
    private String petName;  //tên của con mèo


    //constructors

    public Ex1_Cat(String name, String species, float hight, float weight,
                   String habitat, String reproduction, int age, String interests,
                   String eyeColor, String petName) {
        super(name, species, hight, weight, habitat, reproduction);
        this.age = age;
        this.interests = interests;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }
}
