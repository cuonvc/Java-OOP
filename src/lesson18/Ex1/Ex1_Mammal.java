package lesson18.Ex1;

public class Ex1_Mammal extends Ex1_Animal {
    //properties
    private int legNumber;  //số chân
    private String color;  //màu lông
    private int toothNumber;  //số răng
    private String behavior; //tập tính

//constructors

    public Ex1_Mammal(String name, String species, float hight, float weight, String habitat, String reproduction,
                  int legNumber, String color, int toothNumber, String behavior) {
        super(name, species, hight, weight, habitat, reproduction);
        this.legNumber = legNumber;
        this.color = color;
        this.toothNumber = toothNumber;
        this.behavior = behavior;
    }
}
