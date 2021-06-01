package lesson29.Ex1;

public class Bird extends Animal {
    private String color;
    private String bestFood;  //thức ăn chính
    private float wingspan;  //sải cánh

    public Bird() {
    }

    public Bird(String name, String species, float height, float weight) {
        super(name, species, height, weight);
    }


    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getBestFood() {
        return bestFood;
    }

    public final void setBestFood(String bestFood) {
        this.bestFood = bestFood;
    }

    public final float getWingspan() {
        return wingspan;
    }

    public final void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }


    @Override
    void eat(String food) {
        System.out.println("Chim đang ăn " + food);
    }

    @Override
    void sleep() {
        System.out.println("Mấy con chim đang ngủ trong tổ");
    }

    @Override
    void move() {
        System.out.println("Chim di chuyển bằng cách bay");
    }

    @Override
    void relax() {
        System.out.println("Chim chơi đùa bằng cách lượn quanh bầu trời");
    }
}
