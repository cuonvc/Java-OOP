package lesson37;

import java.util.ArrayList;

public class Exercises5 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Hoàng");
        students.add("An");
        students.add("Cường");
        students.add("Bình");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(12);

        System.out.println("Sắp xếp các phần tử của String theo thứ tự từ a-z");
        sortByX(students);
        showElement(students);
        System.out.println("Sắp xếp các phần tử của int theo thứ tự tăng dần");
        sortByX(numbers);
        showElement(numbers);
    }

    /**
     * hiển thị ra các phần tử
     * @param element
     */
    private static <T> void showElement(ArrayList<T> element) {
        for (var elm : element) {
            System.out.print(elm + " ");
        }
        System.out.println();
    }

    /**
     * Sắp xếp nổi bọt
     * được áp dụng cho các kiểu dữ liệu đã được implement Comparable
     * @param list
     * @param <T>
     */
    public static <T extends Comparable> void sortByX(ArrayList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > 0; j--) {
                if (list.get(j).compareTo(list.get(j - 1)) < 0) {  //nếu thằng sau nhỏ hơn thằng trước
                    //thì đổi chỗ
                    var x = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, x);
                }
            }
        }
    }
}
