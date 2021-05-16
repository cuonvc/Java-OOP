package lesson25.Ex4;

public class Run {
    public static void main(String[] args) {
        Geometry triangle = new Triangle();
        triangle.draw();
        System.out.println("=================================");
        Geometry circle = new Circle();
        circle.draw();
        circle.resize();

    }
}
