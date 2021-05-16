package lesson21.Ex1;

public class Bird extends Animal {
    private String color;  //màu lông
    private String food;  //thức ăn
    private float wingspan;   //độ sải cánh


    public Bird(String color, String food, float wingspan) {
        this.color = color;
        this.food = food;
        this.wingspan = wingspan;
    }

    public Bird(String name, String species, float height,
                float weight, String habitat, String reproduction,
                String color, String food, float wingspan) {
        super(name, species, height, weight, habitat, reproduction);
        this.color = color;
        this.food = food;
        this.wingspan = wingspan;
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


//getter và setter dạng final
    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getFood() {
        return food;
    }

    public final void setFood(String food) {
        this.food = food;
    }

    public final float getWingspan() {
        return wingspan;
    }

    public final void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }
}
