package lesson21.Ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) throws ParseException {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        Person person = new Person("1234567789343", "Nguyễn Văn Cường", "Hung Yen",
                dateFormat.parse("05/08/2002"), "Cuongnvc5802@gmail.com", "012344782742");
        System.out.println(">>>>> Thông Tin Người <<<<<");
        showPerson(person, dateFormat);
        person.sleep();
        person.work("viết code");
        //...


        System.out.println("================================================");
        Teacher teacher = new Teacher("1234567789343", "Nguyễn Văn Cường", "Hung Yen",
                dateFormat.parse("05/08/2002"), "Cuongnvc5802@gmail.com", "012344782742",
                "TC123", "Toán cao cấp", 10000000, 4.5f);
        System.out.println(">>>>> Thông Tin Giảng Viên <<<<<");
        showTeacher(teacher);
        teacher.joinMeeting();
        teacher.relax();
        //...


        System.out.println("================================================");
        Student student = new Student("1234567789343", "Nguyễn Văn Cường", "Hung Yen",
                dateFormat.parse("05/08/2002"), "Cuongnvc5802@gmail.com", "012344782742",
                "SV123", "Kiến Trúc Hà Nội", "Công Nghệ Thông Tin", "20CN2", 3.2f);
        System.out.println(">>>>> Thông Tin Sinh Viên <<<<<");
        showStudent(student);
        student.sleep();
        student.relax();
        //...


        System.out.println("================================================");
        GraduatedStudent graduated = new GraduatedStudent("SV123", "Kiến Trúc Hà Nội",
                "Công Nghệ Thông Tin", "20CN2", 3.2f, dateFormat.parse("05/08/2025"),
                12, 5, 7000000,
                "Google LLC", "Backend Developer");
        System.out.println(">>>>> Thông Tin Sinh Viên Đã Tốt Nghiệp <<<<<");
        showGraduatedStudent(graduated, dateFormat);
    }

    /**
     * phương thức hiển thị thông tin sinh viên đã tốt nghiệp
     * @param graduated đối tượng được hiển thị
     * @param dateFormat đối tưởng của SimpleDateFormat
     */
    private static void showGraduatedStudent(GraduatedStudent graduated, SimpleDateFormat dateFormat) {
        System.out.println("Thời điểm tốt nghiệp: " + dateFormat.format(graduated.getGraduatedDate()));
        System.out.println("Số tín chỉ học lại: " + graduated.getCreditsFail());
        System.out.println("Số môn học lại: " + graduated.getSubjectsFail());
        System.out.println("Mức lương khởi điểm: " + graduated.getStartWage());
        System.out.println("Công ty đang làm: " + graduated.getCompany());
        System.out.println("Vị trí công việc: " + graduated.getPosition());
    }

    /**
     * phương thức hiển thị thông tin sinh viên
     * @param student đối tượng được hiển thị
     */
    private static void showStudent(Student student) {
        System.out.println("Mã sinh viên: " + student.getIdStudent());
        System.out.println("Đại học: " + student.getUniver());
        System.out.println("Chuyên ngành: " + student.getSpecialized());
        System.out.println("Đơn vị lớp: " + student.getClasss());
        System.out.println("Điểm trung bình: " + student.getAvgGrade());
    }

    /**
     * phương thức hiển thị thông tin giảng viên
     * @param teacher đối tượng được hiển thị
     */
    private static void showTeacher(Teacher teacher) {
        System.out.println("Mã giảng viên: " + teacher.getIdTeacher());
        System.out.println("Chuyên môn: " + teacher.getSpecialize());
        System.out.println("Mức lương: " + teacher.getWage());
        System.out.println("Kinh nghiệm: " + teacher.getExperience());
    }

    /**
     * phương thức hiển thị thông tin của người
     * @param person đối tương được hiển thị
     */
    private static void showPerson(Person person, SimpleDateFormat dateFormat) {
        System.out.println("Số thẻ căn cước: " + person.getIdCard());
        System.out.println("Họ và tên: " + person.getFullName());
        System.out.println("Địa chỉ: " +  person.getAddress());
        System.out.println("Ngày sinh: " + dateFormat.format(person.getDayOfBirth()));
        System.out.println("Email: " + person.getEmail());
        System.out.println("Số điện thoại: " + person.getPhoneNumber());
    }
}
