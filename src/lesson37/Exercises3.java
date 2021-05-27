package lesson37;

public class Exercises3 {
    public static void main(String[] args) {
        String[] accounts = new String[3];
        accounts[0] = "BIDV";
        accounts[1] = "Techcombank";
        accounts[2] = "Techcombank";

        Integer[] numbers = {4, 2, 5, 2, 2, 4, 2, 6, 7, 2};

        checkString(accounts);
        checkInteger(numbers);


    }

    private static void checkInteger(Integer[] numbers) {
        int number = 2;
        int indexInt = findX(numbers, number);
        if (indexInt != -1) {
            System.out.println("Tìm thấy vị trí cuối của " + number + " trong mảng là vị trí số " + (indexInt + 1));
        }
    }

    private static void checkString(String[] accounts) {
        String acc = "Techcombank";
        int indexString = findX(accounts, acc);
        if (indexString == -1) {
            System.out.println("Không tìm thấy " + acc + " trong mảng");
        } else {
            System.out.println("Tìm thấy vị trí cuối của " + acc + " trong mảng là vị trí số " + (indexString + 1));
        }
    }

    /**
     * phương thức dùng cho các kiểu dữ liệu thực thi Interface Comparable
     * @param arrays
     * @param <T>
     * @return
     */
    public static <T extends Comparable> int findX(T[] arrays, T x) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (arrays[i].compareTo(x) == 0) {
                return i;
            }
        }
        return -1;
    }
}
