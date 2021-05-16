package lesson25.Ex4;

public class Circle extends Geometry {
    private String center;  //tam đường tròn
    private float radius;  //bán kính



    public final String getCenter() {
        return center;
    }

    public final void setCenter(String center) {
        this.center = center;
    }

    public final float getRadius() {
        return radius;
    }

    public final void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    protected void draw() {
        System.out.println("Vẽ đường tròn");
    }

    @Override
    protected void resize() {
        System.out.println("Thay đổi kích thước đường tròn");
    }
}
