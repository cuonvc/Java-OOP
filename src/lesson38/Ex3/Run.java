package lesson38.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<RegisterStudent> registersList = new ArrayList<>();
        //tạo danh sách môn học
        Subject java = new Subject("s1", "JavaOOP", 5);
        Subject cpp = new Subject("s2", "C plus plus", 4);
        Subject py = new Subject("s3", "Python", 4);


        //tạo thông tin đăng kí (ghép cặp) cho từng môn (Môn học - số sv)
        RegisterStudent javaRegister = new RegisterStudent(java, 60);
        RegisterStudent cppRegister = new RegisterStudent(cpp, 75);
        RegisterStudent pythonRegister = new RegisterStudent(py, 43);


        //tạo danh sách ghép cặp môn học - sinh viên
        create(registersList, javaRegister);
        create(registersList, cppRegister);
        create(registersList, pythonRegister);


        //hiển thị danh sách
        showRegisterStudent(registersList);

    }

    private static void showRegisterStudent(List<RegisterStudent> registersList) {
//        System.out.printf("%-10s %-10s\n", "Môn học", "Số sv đăng kí");
//        for (var item : registersList) {
//            System.out.printf("%-10s %-10d\n", item.getSubject(), item.getNumberOfStudent());
//        }

        for (var item : registersList) {
            System.out.println(item);
        }
    }

    /**
     * tạo mới một danh sách cặp môn học - sv
     * @param XRegister đối tượng chứa thông tin đăng ký cần xem xét
     */
    private static void create(List<RegisterStudent> registersList, RegisterStudent XRegister) {
        if (!registersList.contains(XRegister)) {
            registersList.add(XRegister);
        } else {
            System.out.println("Đối tượng " + XRegister + " đã tồn tại");
        }
    }
}
