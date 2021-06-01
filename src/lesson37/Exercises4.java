package lesson37;

import java.util.ArrayList;

public class Exercises4 {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        persons.add("Cường");
        persons.add("Huy");
        persons.add("An");
        persons.add("Huy");


        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(1);
        number.add(5);

        checkString(persons);
        checkInteger(number);

    }

    /**
     * kiểm tra lại và đưa ra kết quả
     * @param number
     */
    private static void checkInteger(ArrayList<Integer> number) {
        int numb = 1;
        var countInteger = countX(number, numb);
        if (countInteger > 0) {
            System.out.println("Có " + countInteger + " kết quả cho số \"" + numb + "\" trong danh sách");
        }
    }

    /**
     * kiểm tra lại và đưa ra kết qảu
     * @param persons
     */
    private static void checkString(ArrayList<String> persons) {
        String str = "Huy";
        var countString = countX(persons, str);
        if (countString > 0) {
            System.out.println("Có " + countString + " kết quả cho \"" + str + "\" trong danh sách");
        } else {
            System.out.println("Không có kết quả cho " + countString + " trong danh sách");
        }
    }


    /**
     * phương thức đếm số lần xuất hiện của phần tử trog danh sách
     * dùng cho các kiểu dữ liệu thực thi Interface Comparable
     * @param list
     * @param x
     * @param <T>
     * @return
     */
    public static <T extends Comparable> int countX(ArrayList<T> list, T x) {
        var count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(x) == 0) {
                count++;
            }
        }
        return count;
    }
}
