package lesson37.LyThuyet;

import java.util.ArrayList;

public class Bai37 {
    public static void main(String[] args) {
        //tạo danh sách bạn bè kiểu String
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Cường");
        friends.add("Hoàng");
        friends.add("Huy");
        friends.add("Đức");
        friends.add("Hưng");



        //tạo danh sách những con số kiểu Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(5);


        System.out.println("danh sách những người bạn: ");
        showArrayList(friends);
        System.out.println("Danh sách những con số: ");
        System.out.println(numbers);

        System.out.println("=================================================");
        Bai37 obj = new Bai37();
        System.out.println("phần tử ở giữa trong danh sách những người bạn là: " + obj.getMid(friends));
        System.out.println("Phần tử ở giữa trong danh sách những con số là: " + obj.getMid(numbers));


        System.out.println("===================================================");
        System.out.println("Người có tên cuối cùng trong danh sách theo bảng chữ cái là: " + obj.findMax(friends));
        System.out.println("Số lớn nhất trong danh sách là: " + obj.findMax(numbers));


        //bây giờ tạo ra một danh sách Student mới
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("a"));
//        students.add(new Student("b"));
//        students.add(new Student("c"));
//
//        //thì dòng này bị lỗi vì Student chưa được implement Comparable
//        System.out.println("Học sinh có tên sau cùng theo bảng chữ cái là: " + obj.findMax(students));


    }

    /**
     * phương thức dùng để hiển thị danh sách các phần tử của một kiểu bất kì nào đó
     */
    private static  <T> void showArrayList(ArrayList<T> list) {
        for (var e : list) {
            System.out.print(e + " ");
        }
        System.out.println();  //xuống dòng
    }


    /**
     * phương thức tìm ra phần tử chính giữa của một list bất kì
     * @param list
     * @param <T>
     * @return
     */
    private <T> T getMid(ArrayList<T> list) {
        int mid = list.size() / 2;
        return list.get(mid);
    }


    /**
     * phương thức tìm giá trị lớn nhất trong một danh sách
     * hoặc một tên có bảng chữ cái đứng sau cùng
     * @param list
     * @param <T>
     * @return
     */
    public <T extends Comparable> T findMax(ArrayList<T> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        var max = list.get(0);
        for (var e : list) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

}
