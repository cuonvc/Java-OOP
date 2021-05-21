package lesson29.Ex1;

public class Mammal extends Animal {
    private int numberOfLeg;  //số chân
    private String color;  //màu lông
    private int numberOfTooth;  //số răng
    private String behavior;  //tập tính

    public Mammal() {
    }

    public Mammal(String name, String species, float height, float weight) {
        super(name, species, height, weight);
    }


    public final int getNumberOfLeg() {
        return numberOfLeg;
    }

    public final void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getNumberOfTooth() {
        return numberOfTooth;
    }

    public final void setNumberOfTooth(int numberOfTooth) {
        this.numberOfTooth = numberOfTooth;
    }

    public final String getBehavior() {
        return behavior;
    }

    public final void setBehavior(String behavior) {
        this.behavior = behavior;
    }


    @Override
    void eat(String food) {
        System.out.println("Động vật có vú đa phần ăn thịt");
    }

    @Override
    void sleep() {
        System.out.println("đang ngủ");
    }

    @Override
    void move() {
        System.out.println("Chúng đang di chuyển theo bầy đàn");
    }

    @Override
    void relax() {
        System.out.println("Những con con đang chơi đùa");
    }
}
