package lesson40;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * tính chất của Queue là vào trước ra trước
 * tương tự cái ống 2 đầu rỗng vậy,
 * nạp đạn ở đít, bắn ra ở đầu
 */
public class QueueExercises {
    public static void main(String[] args) {
        Queue<String> animals = new ArrayDeque<>();

        //thêm phần tử vào cuối Queue
        animals.add("Chó");
        animals.add("Gà");

        //xóa bỏ phần tử ở đầu Queue
        animals.remove();

        //lấy phần tử ở đầu Queue nhưng không xóa
        animals.peek();
    }
}
