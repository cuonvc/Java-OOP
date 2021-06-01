package lesson18.lythuyet;
//kế thừa đơn

public class Animal {
    //thường thì các thuộc tính luôn để private, nếu cần sd ở lớp khác thì thông qua set, get
    private String name;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void move() {
        // do something...
    }

    public void eat() {
        // do something...
    }
}

//Cat là lớp con của lớp Animal
class Cat extends Animal {
    private String color;
    private String favoriteFood;

    public void catchMouse() {
        System.out.println(getName() + " đang bắt chuột ");
        //getName không có trong lớp Cat nhưng được dùng từ lớp cha là lớp Animal
    }

    public void washFace() {
        // do something...
    }
}
