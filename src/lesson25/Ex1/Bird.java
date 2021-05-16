package lesson25.Ex1;

public class Bird extends Animal{
    private String color;  //màu lông
    private String food;  //thức ăn
    private float  wing;  //sải cánh

    @Override
    protected void sleep() {
        System.out.println("Mấy con chim đang ngủ");
    }

    @Override
    protected void relax() {
        System.out.println("Mấy con chim đang bắt sâu");
    }

    @Override
    protected void move() {
        System.out.println("Mấy con chim đang bay");
    }




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

    public final float getWing() {
        return wing;
    }

    public final void setWing(float wing) {
        this.wing = wing;
    }
}
