package lesson41.TreeSet;

import java.util.TreeSet;

public class TreeSetEx {
    //đối với thằng treeSet thì những kiểu mà nó lưu trữ phải được implement Comparable nếu ko sẽ lỗi
    //Đối với kiểu lưu trữ là String thì mặc định nó luôn implement Comparable rồi nên ko cần quan tâm
    //ở trường hợp này là lớp Car (phải implement Comparable)
    //còn việc sắp xếp thế nào phụ thuộc vào cái Comparable
    public static void main(String[] args) {
        Car c1 = new Car("Vinfast");
        Car c2 = new Car("Audi");
        Car c3 = new Car("BMW");
        Car c4 = new Car("Mec");


        //kiểu lưu trữ là Car (đã implement Comparable)
        TreeSet<Car> treeSet = new TreeSet<>();
        //đặc điểm của những kiểu set là khi add một phần tử vào mà bị trùng thì nó sẽ bỏ qua phần tử đó
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c1);
        treeSet.add(c2);

        //kiểu lưu trữ là String
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("abc");
        treeSet1.add("djđ");
        treeSet1.add("abc");
        treeSet1.add("djđ");


        for (var e : treeSet) {
            System.out.println(e);
        }

        for (var e : treeSet1) {
            System.out.println(e);
        }



    }
}
