package lesson26;

interface Drawable {
    void draw();   //vẽ

    void erase();  //tẩy xóa
}


interface Movable {
    void up();   //di chuyển lên theo trục Y
    void down();  //di chuyển xuống theo trục Y
    void left();  //di chuyển sang trái theon trục X
    void right();  //di chuyển sang phải thoe trục X

}


interface SharpDrawer {

}




// nếu Class mà muốn làm lớp con của 1 hay nhiều Interface thì thay từ khóa "extends" = "implement"

//khi lớp này kế thừa từ các lớp cha interface (bản chất là abstract class) thì lớp này
// cũng sẽ trở thành abstrac Class nên phải implement tất cả các method từ lớp cha (interface)
//hoặc thêm keyword "abstrac" trước "class" thì có thể không cần phải implement hết
class Shape implements Drawable, Movable {
    private int x;  //toạ độ X
    private int y;  //tọa độ Y

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }




//giả sử coi gốc tọa độ là góc dưới bên trái màn hình ta sẽ có các phương thức được thực thi như sau
    @Override
    public void draw() {   //vẽ
        //vẽ vài đường cơ bản nào =))
        up();
        right();
        down();
        left();
        //  ==> thành hình chữ nhật
    }

    @Override
    public void erase() {    //xóa
        //cái này là xóa, làm tương tự như vẽ
    }

    @Override
    public void up() {   //vẽ lên trên (Y tăng)
        y++;
    }

    @Override
    public void down() {  //vẽ xuống dưới  (Y giảm)
        y--;
    }

    @Override
    public void left() {  //vẽ sang trái  (X giảm)
        x--;
    }

    @Override
    public void right() {   //vẽ sang phải   (X tăng)
        x++;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
