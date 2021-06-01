package lesson21.Ex1;

public class Fish extends Animal{
    private String color;
    private String food;

    public Fish(String color, String food) {
        this.color = color;
        this.food = food;
    }

    public Fish(String name, String species, float height, float weight,
                String habitat, String reproduction, String color, String food) {
        super(name, species, height, weight, habitat, reproduction);
        this.color = color;
        this.food = food;
    }



    @Override
    public void eat() {
        super.eat();    //gọi lại phương thức gốc của lớp cha
    }

    @Override
    public void move() {
        super.move();   //gọi lại phương thức gốc của lớp cha
    }

    @Override
    public void relax() {
        super.relax();   //gọi lại phương thức gốc của lớp cha
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
}
