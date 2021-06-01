package lesson38.LyThuyet;

import java.util.ArrayList;

/**
 * Ví dụ về giới hạn trên
 */
public class UpperBroundWildcard {
    public static double averageValue(ArrayList<? extends Number> list) {  //ví dụ về giới hạn trên
        //khi extends Number là lớp lớn nhất trong kiểu số thì
        // ngoài các kiểu int, float, long, dounle ra không có kiểu nào có thể sử dụng được
        if (list == null || list.size() <= 0) {
            return 0;
        }
        double sum = 0;
        for (var item : list) {
            sum += item.doubleValue();
        }
        return sum / list.size();
    }


    public static void main(String[] args) {
        ArrayList<Integer> numberInt = new ArrayList<>();
        numberInt.add(1);
        numberInt.add(3);
        numberInt.add(4);
        numberInt.add(7);



        ArrayList<Float> numberFloat = new ArrayList<>();
        numberFloat.add(1.2f);
        numberFloat.add(3.1f);
        numberFloat.add(4.2f);


        ArrayList<String> str = new ArrayList<>();
        str.add("abc");
        str.add("xyz");
        str.add("fghjsf");

        System.out.println("Giá trị trung bình của các số nguyên là: " + averageValue(numberInt));
        System.out.println("Giá trị trung bình của các số thực là: " + averageValue(numberFloat));
//        System.out.println("Thử add kiểu String xem sao: " + averageValue(str));  //lập tức báo lỗi
    }
}
