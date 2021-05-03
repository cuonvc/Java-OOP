package lesson18.Ex1;

public class Ex1_Bird extends Ex1_Animal {
    private String color;  //màu lông
    private String food;  //thức ăn
    private float wingspan;  //độ rộng sải cánh

    public Ex1_Bird(String name, String species, float hight, float weight, String habitat, String reproduction,
                String color, String food, float wingspan) {
        super(name, species, hight, weight, habitat, reproduction);
        this.color = color;
        this.food = food;
        this.wingspan = wingspan;
    }
}
