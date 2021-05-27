package lesson40;
/**
 * ArrayDeque cũng là Queue
 * nhưng thay vì nhét đít bắn đầu thì Arraydeque có thể nhét đầu hoặc đít, bắn đầu hoặc đít
 */

import java.util.ArrayDeque;

public class ArrayDequeExercises {
    public static void main(String[] args) {
        ArrayDeque<String> brands = new ArrayDeque<>();

        //thêm vào đầu danh sách
        brands.addFirst("Oppo");

        //thêm vào cuối danh sách
        brands.addLast("Xiaomi");

        //mặc định thêm vào cuối
        brands.add("Apple");

        //mặc định xóa ở đầu
        brands.remove();

        //lấy ở đầu danh sách
        brands.peekFirst();

        //lấy ở cuối danh sách
        brands.peekLast();

        //lấy và xóa phần tử đầu
        brands.removeFirst();

        //lấy và xóa phần tử cuối
        brands.removeLast();

        //...còn nhiều nữa
    }
}
