package lesson40;
/**
 * stack có đặc điểm là vào trước ra sau (ống 1 đáy)
 */

import java.util.Stack;

public class StackExercises {
    public static void main(String[] args) {

        Stack<String> subjects = new Stack<>();
        //thêm mới một phần tử (phần tử thêm mới luôn đứng đầu)
        subjects.add("Toán");
        subjects.add("Văn");
        subjects.add("Anh");
        subjects.add("Tin học");


        //thêm phần tử vào đầu stack
        subjects.push("Hóa");

        //lấy và xóa phần tử ở đầu stack
        subjects.pop();

        //lấy phần tử ở đầu ra và không xóa
        subjects.peek();

        //kiểm tra stack có bị rỗng không
        subjects.empty();

        //tìm kiếm phần tử trong stack
        subjects.search("Văn");


    }
}
