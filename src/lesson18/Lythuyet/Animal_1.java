package lesson18.lythuyet;
//  VÍ DỤ VỀ KẾ THỪA PHÂN CẤP (giống như đẻ ra hai ae cùng tuổi vậy)

public class Animal_1 {
    private String name;
    private float weight;

    public void move() {
        // do something...
    }

    public void eat() {
        // do something...
    }
}

// Cat_1 là lớp con của Animal nhưng chả liên quan gì đến lớp Dog_1
class Cat_1 extends Animal_1 {
    private String color;
    private String favoriteFood;

    public void catchMouse() {
        // do something...
    }

    public void washFace() {
        // do something...
    }
}

// Dog_1 là lớp con của Animal nhưng cũng chả liên quan gì đến lớp Cat_1
class Dog_1 extends Animal_1 {
    private String species;

    public void bark() {
        //...
    }

    public void biteOther() {
        //...
    }
}
