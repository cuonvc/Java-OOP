package lesson29.Ex3;

import lesson29.Ex3.Comparator.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        do {
            System.out.println("1. Thêm mới một giảng viên vào danh sách");
            System.out.println("2. Thêm mới một sinh viên vào danh sách");
            System.out.println("3. Hiển thị danh sách giảng viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Sắp xếp danh sách giảng viên theo thứ tự từ z-a");
            System.out.println("6. Sắp xếp giảng viên theo mức lương giảm dần");
            System.out.println("7. Sắp xếp giảng viên theo số năm kinh nghiệm giảm dần");
            System.out.println("8. Săp xếp danh sách sinh viên từ a-z");
            System.out.println("9. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    var newTeacher = createTeacher(input);
                    teachers.add(newTeacher);
                    showNoti("Thêm thành công một giảng viên");
                    break;
                case 2:
                    var newStudent = createStudent(input);
                    students.add(newStudent);
                    showNoti("Thêm thành công một sinh viên");
                    break;
                case 3:
                    if (teachers.size() > 0) {
                        showNoti("Danh sách giảng viên");
                        showTeacher(teachers);
                    } else {
                        showNoti("Dánh sách trống");
                    }
                    break;
                case 4:
                    if (students.size() > 0) {
                        showNoti("Danh sách sinh viên");
                        showStudent(students);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 5:
                    if (teachers.size() > 0) {
                        showNoti("Danh sách giảng viên từ z-a");
                        Collections.sort(teachers, new SortByNameDown());
                        showTeacher(teachers);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (teachers.size() > 0) {
                        showNoti("Danh sách giảng viên theo mức lương giảm dần");
                        Collections.sort(teachers, new SortByWagesDown());
                        showTeacher(teachers);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 7:
                    if (teachers.size() > 0) {
                        showNoti("Danh sách giảng viên theo số năm kinh nghiệm giảm dần");
                        Collections.sort(teachers, new SortByExpDown());
                        showTeacher(teachers);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (students.size() > 0) {
                        showNoti("Danh sách sinh viên từ a-z");
                        Collections.sort(students, new SortByName());
                        showStudent(students);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 9:
                    if (students.size() > 0) {
                        showNoti("Danh sách sinh viên theo điểm trung bình giảm dần");
                        Collections.sort(students, new SortByAvgDown());
                        showStudent(students);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }

    /**
     * hiển thị danh sách sinh viên
     * @param students
     */
    private static void showStudent(ArrayList<Student> students) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-20s %-21s %-15s %-15s %-16s" +
                "%-18s %-17s %-18s %-12s %-20s %-15s\n",
                "Số thẻ căn cước", "Họ và Tên", "Địa chỉ",
                "Ngày sinh", "Email", "Số điện thoại", "Mã sinh viên",
                "Tên trường", "Tên lớp", "Chuyên ngành", "Điểm trng bình");
        for (var std : students) {
            System.out.printf("%-20s %-21s %-15s %-15s %-16s" +
                    "%-18s %-17s %-18s %-12s %-20s %-15.1f\n", std.getIdCard(),
                    std.getFullName(), std.getAddress(),
                    dateFormat.format(std.getDayOfBirth()), std.getEmail(),
                    std.getPhoneNumber(), std.getIdStudent(),
                    std.getUniversity(), std.getClasss(), std.getSpecialize(),
                    std.getAvgGrade());
        }
    }

    /**
     * hiển thị danh sách giảng viên
     * @param teachers
     */
    private static void showTeacher(ArrayList<Teacher> teachers) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-20s %-21s %-15s %-15s %-16s" +
                        " %-18s %-18s %-18s %-20s %-17s\n",
                "Số thẻ căn cước", "Họ và Tên", "Địa chỉ",
                "Ngày sinh", "Email", "Số điện thoại", "Mã giảng viên",
                "Chuyên môn", "Mức lương (VNĐ)", "Kinh nghiệm");
        for (var tch : teachers) {
            System.out.printf("%-20s %-21s %-15s %-15s %-16s %-18s %-18s" +
                    " %-18s %-20.2f %-17.1f\n", tch.getIdCard(),
                    tch.getFullName(), tch.getAddress(),
                    dateFormat.format(tch.getDayOfBirth()), tch.getEmail(),
                    tch.getPhoneNumber(), tch.getIdTeacher(),
                    tch.getSpecialize(), tch.getWages(), tch.getExperience());
        }
    }

    /**
     * phương thức tạo mới một sinh viên
     * @param input
     * @return
     */
    private static Student createStudent(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Số thẻ căn cước: ");
        var idCard = input.nextLine();
        System.out.println("Họ và tên: ");
        var name = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dob = new Date();  //nếu nhập sai định dạng mặc định là hôm nay
        }
        System.out.println("Email: ");
        var mail = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine();
        System.out.println("Tên trường: ");
        var uni = input.nextLine();
        System.out.println("Tên lớp: ");
        var classs = input.nextLine();
        System.out.println("Chuyên ngành: ");
        var specialize = input.nextLine();
        System.out.println("Điểm trung bình: ");
        var avg = Float.parseFloat(input.nextLine());
        Student student = new Student(idCard, name, address, dob, mail,
                phone, null, uni, classs, specialize, avg);
        return student;

    }

    /**
     * thêm mới một giảng viên
     * @param input
     * @return
     */
    private static Teacher createTeacher(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Số thẻ căn cước: ");
        var idCard = input.nextLine();
        System.out.println("Họ và tên: ");
        var name = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dob = new Date();  //nếu nhập sai định dạng mặc định là hôm nay
        }
        System.out.println("Email: ");
        var mail = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine();
        System.out.println("Chuyên môn: ");
        var specialize = input.nextLine();
        System.out.println("Mức lương: ");
        var wages = Float.parseFloat(input.nextLine());
        System.out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        Teacher teacher = new Teacher(idCard, name, address, dob, mail,
                phone, null, specialize, wages, exp);
        return teacher;
    }



    /**
     * hiển thị thông báo sau mỗi hành động
     * @param str nội dung thông báo
     */
    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
