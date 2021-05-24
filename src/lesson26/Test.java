package lesson26;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class Test {
//ví dụ về các interface đã được định sẵn
    //MouseListener   (Ctrl + left click để biết thêm chi tiết)
    //KeyListener    (tương tự như trên)
    //...v.v...

    public static void main(String[] args) {
        Shape shape = new Shape(200, 100);


        System.out.println("Tọa độ trước khi vẽ: " + shape);
        shape.draw();
        System.out.println("Tọa độ sau khi vẽ: " + shape);
    }
}
