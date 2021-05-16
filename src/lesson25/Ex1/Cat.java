package lesson25.Ex1;

public class Cat extends Mammal{
    private String age;  //tuổi
    private String hobby;  //sở thích
    private String eyeColor;  //màu mắt
    private String petName;   //tên gọi


    @Override
    protected void sleep() {
        System.out.println("Con mèo đang ngủ");
    }

    @Override
    protected void relax() {
        System.out.println("Con mèo đang nô ngoài sân");
    }

    @Override
    protected void move() {
        System.out.println("Con mèo đang di chuyển");
    }





    public final String getAge() {
        return age;
    }

    public final void setAge(String age) {
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
