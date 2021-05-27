package lesson37;

import java.util.ArrayList;

public class Exercises8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);

        ArrayList<String> students = new ArrayList<>();
        students.add("Cường");
        students.add("Huy");
        students.add("Cường");
        students.add("An");

        checkByInteger(numbers);
        checkByString(students);

    }

    private static void checkByString(ArrayList<String> students) {
        var beforeStudent = "Cường";  //đại diện cho x
        var afterStudent = "Hoàng";  //đại diện cho y
        realaceX(students, beforeStudent, afterStudent);
            System.out.println("Thay thế thành công " + beforeStudent + " thành " + afterStudent);
            showList(students);
    }

    private static void checkByInteger(ArrayList<Integer> numbers) {
        var beforeNumber = 1;  //đại diện cho x
        var afterNumber = 3;  //đại diện cho y
        realaceX(numbers, beforeNumber, afterNumber);
            System.out.println("Thay thế thành công " + beforeNumber + " thành " + afterNumber);
            showList(numbers);
    }



    /**
     * hiển thị các phần tử của mảng để đối chiếu
     * @param elements
     */
    private static <T> void showList(ArrayList<T> elements) {
        for (var elm : elements) {
            System.out.print(elm + " ");
        }
        System.out.println();
    }

    /**
     * phương thức thay thế các phần tử trong list mà = x  thì thay thành y
     * @param elements
     * @param x giá trị trung gian = giá trị cần thay thế
     * @param y giá trị sau thay thế
     * @param <T>
     * @return
     */
    public static <T extends Comparable> void realaceX(ArrayList<T> elements, T x, T y) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(x)) { //nếu phần tủ trong chuỗi mà giống với x
                //thì thay bằng y
                elements.set(i, y);
            }
        }
    }
}
