package lesson21.Ex1;

public class Mammal extends Animal {
    private int footNumber;  //số chân
    private String color;  //màu lông
    private int toothNumber;  //số răng
    private String behavior;  //tập tính

    public Mammal() {

    }

    public Mammal(int footNumber, String color, int toothNumber, String behavior) {
        this.footNumber = footNumber;
        this.color = color;
        this.toothNumber = toothNumber;
        this.behavior = behavior;
    }

    public Mammal(String name, String species, float height,
                  float weight, String habitat, String reproduction, int footNumber,
                  String color, int toothNumber, String behavior) {
        super(name, species, height, weight, habitat, reproduction);
        this.footNumber = footNumber;
        this.color = color;
        this.toothNumber = toothNumber;
        this.behavior = behavior;
    }


    public Mammal(String name, String species, float height, float weight, String habitat, String reproduction) {
        super(name, species, height, weight, habitat, reproduction);
    }

    @Override
    public void eat() {
        super.eat();   //gọi lại phương thức gốc của lớp cha
    }

    @Override
    public void move() {
        super.move();    //gọi lại phương thức gốc của lớp cha
    }

    @Override
    public void relax() {
        super.relax();    //gọi lại phương thức gốc của lớp cha
    }


//các getter và setter ở dạng final
    public final int getFootNumber() {
        return footNumber;
    }

    public final void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getToothNumber() {
        return toothNumber;
    }

    public final void setToothNumber(int toothNumber) {
        this.toothNumber = toothNumber;
    }

    public final String getBehavior() {
        return behavior;
    }

    public final void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
