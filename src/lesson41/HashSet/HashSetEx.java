package lesson41.HashSet;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        Animal a1 = new Animal("vàng", 7);
        Animal a2 = new Animal("Trắng", 5.2f);
        Animal a3 = new Animal("Đen", 2);
        Animal a4 = new Animal("Nâu", 5);

//HashSet sắp xếp các phần tử một cách ngẫu nhiên, ko theo thứ tự
        //nhưng ưu điểm là những kiểu mà nó lưu trữ thì không cần phải implement Comparable như treeSet

        //lưu trữ kiểu String
        HashSet<String> hashSet = new HashSet<>();
        //đặc điểm của những kiểu set là khi add một phần tử vào mà bị trùng thì nó sẽ bỏ qua phần tử đó
        hashSet.add("abc");
        hashSet.add("xyz");
        hashSet.add("hsdhfdf");
        hashSet.add("abc");
        hashSet.add("xyz");
        hashSet.add("hsdhfdf");

        //lưu trữ kiểu Animal
        HashSet<Animal> hashSet1 = new HashSet<>();
        hashSet1.add(a1);
        hashSet1.add(a2);
        hashSet1.add(a1);
        hashSet1.add(a2);
        //..


        for (var e : hashSet) {
            System.out.println(e);
        }

        for (var e : hashSet1) {
            System.out.println(e);
        }



    }
}
