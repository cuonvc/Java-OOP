package lesson37;

import lesson37.LyThuyet.Student;

import java.util.ArrayList;

public class Exercises6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Cuong123"));
        students.add(new Student("Hoang321"));
        students.add(new Student("Manh031"));

        ArrayList<Float> avgGrade = new ArrayList<>();
        avgGrade.add(3.2f);
        avgGrade.add(3.5f);
        avgGrade.add(2.3f);

//        System.out.println("Sắp xếp danh sách sv theo thứ tự z-a: ");
//        sortByXDown(students);  //báo lỗi vì lớp Student chưa được implement Comparable
//        showList(students);
        System.out.println("Sắp xếp danh sách điểm trung bình từ cao đến thấp: ");
        sortByXDown(avgGrade);
        showList(avgGrade);
    }

    private static void showList(ArrayList<Float> element) {
        for (var elm : element) {
            System.out.print(elm + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable> void sortByXDown(ArrayList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > 0; j--) {
                if (list.get(j).compareTo(list.get(j - 1)) > 0) {  //nếu thằng sau mà lớn hơn thằng trước
                    //thì đổi chỗ
                    var x = list.get(j);
                    list.set(j, list.get(j - 1));  //phần tử thứ j sẽ có giá trị là j - 1
                    list.set(j - 1, x);  //phần tử tại j - 1 sẽ có giá tị là x
                }
            }
        }
    }
}
