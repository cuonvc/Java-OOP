package lesson25.Ex4;

public abstract class Geometry {
    private String name;  //tên hình
    private float x;  //hoành độ
    private float y;  //tung độ

    public Geometry() {

    }






    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getX() {
        return x;
    }

    public final void setX(float x) {
        this.x = x;
    }

    public final float getY() {
        return y;
    }

    public final void setY(float y) {
        this.y = y;
    }



    protected abstract void draw();  //vẽ hình
    protected abstract void resize();  //thay đổi kích thước

}
