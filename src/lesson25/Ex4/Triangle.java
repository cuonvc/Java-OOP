package lesson25.Ex4;

public class Triangle extends Geometry {
    private float a;  //cạnh thứ nhất
    private float b;   //cạnh thứ hai
    private float c;  //cạnh thứ ba


//    public Triangle(String name) {
//        setName(name);
//    }




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

    public final float getC() {
        return c;
    }

    public final void setC(float c) {
        this.c = c;
    }


    @Override
    protected void draw() {
        System.out.println("Vẽ hình tam giác");
    }

    @Override
    protected void resize() {
        System.out.println("thay đổi kích thước hình tam giác");
    }
}
