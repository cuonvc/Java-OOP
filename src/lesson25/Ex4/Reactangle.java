package lesson25.Ex4;

public class Reactangle extends Geometry {
    private float a;  //độ dài cạnh thứ nhất
    private float b;  //độ dài cạnh thứ hai


    public final float getA() {
        return a;
    }

    public final void setA(float a) {
        this.a = a;
    }

    public final float getB() {
        return b;
    }

    public final void setB(float b) {
        this.b = b;
    }


    @Override
    protected void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }

    @Override
    protected void resize() {
        System.out.println("Thay đổi kích thước hình chữ nhật");
    }
}
