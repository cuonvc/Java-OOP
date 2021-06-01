package lesson37;

public class Exercises2 {
    public static void main(String[] args) {
        Integer[] numbers = {4, 6, 2, 4, 6, 7, 3, 3, 9, 0};
        String[] students = new String[3];
        students[0] = "Cường";
        students[1] = "Hoàng";
        students[2] = "Hải";

        checkInteger(numbers);
        checkString(students);
    }

    /**
     * phương thức kiểm duyệt dành cho students kiểu String
     * @param students
     */
    private static void checkString(String[] students) {
        String std = "Hoàng";
        int indexOfString = searchByValue(students, std);
        if (indexOfString != -1) {
            System.out.println("Tìm thấy " + std + " ở vị trí số " + (indexOfString + 1));
        } else {
            System.out.println("Không tìm thấy \"" + std + "\" trong mảng");
        }
    }

    /**
     * phương thức kiểm duyệt dành cho số kiểu int
     * @param numbers
     */
    private static void checkInteger(Integer[] numbers) {
        Integer x = 3;
        int indexOfInteger = searchByValue(numbers, x);
        if (indexOfInteger != -1) {
            System.out.println("Tìm thấy " + x + " trong mảng ở vị trí số " + (indexOfInteger + 1));
        } else {
            System.out.println("không tìm thấy vị trí của " + x + " trong mảng");
        }
    }

    /**
     * phương thức dùng cho các kiểu dữ liệu thực thi Interface Comparable
     * @param arrays
     * @param number
     * @param <T>
     * @return -1 nếu không tìm thấy hoặc tìm thấy vị trí đầu tiên
     */
    public static <T extends Comparable> int searchByValue(T[] arrays, T number) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].compareTo(number) == 0) {
                return i;
            }
        }
        return -1;
    }
}
