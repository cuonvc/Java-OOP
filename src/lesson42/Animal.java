package lesson42;

public class Animal {
    private String color;
    private float age;

    public Animal() {
    }

    public Animal(String color, float age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
