package lesson18.ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) throws ParseException {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        //tạo mới các đối tượng
        Person person = new Person("033201000687", "Nguyễn Văn Cường", "Hưng Yên",
                dateFormat.parse("05/08/2002"), "Cuongnvc5802@gmail.com", "0865235802");

        Teacher myTeacher = new Teacher("012345678910", "Tran Duc Bo", "Hà Nội",
                dateFormat.parse("04/02/1990"), "Bo123@gmail.com", "04898948144",
                "HAU123", "CTDL&GT", 15000000, 5.5f);

        Student myStudent = new Student("758782787415", "Nguyen Van An", "Hà Nội",
                dateFormat.parse("04/12/2002"), "An123@gmail.com", "12345678901",
                "ITHAU123", "Kiến Trúc Hà Nội", "20CN2", "CNTT", 3.4f);

        Graduated myBrother = new Graduated("0487323723411", "Tran Van B", "Hà Nội",
                dateFormat.parse("02/11/2000"), "ABC123@gmail.com", "09876543232",
                "ITHAU456", "Kiến Trúc Hà Nội", "18CN3", "CNTT", 3.5f,
                "2019", 12, 5, 8000000, "ABCxyz",
                "IT Engineer");


        //hiển thị thông tin của các đối tượng
        System.out.println(">>> THÔNG TIN CỦA MỘT NGƯỜI <<<");
        showPerson(person);
        System.out.println("========================================================");
        System.out.println(">>> THÔNG TIN CỦA MỘT GIẢNG VIÊN <<<");
        showTeacher(myTeacher);
        System.out.println("========================================================");
        System.out.println(">>> THÔNG TIN CỦA MỘT SINH VIÊN <<<");
        showStudent(myStudent);
        System.out.println("========================================================");
        System.out.println(">>> THÔNG TIN CỦA MỘT SINH VIÊN RA TRƯỜNG <<<");
        showGraduated(myBrother);
    }

    private static void showGraduated(Graduated myBrother) {
        System.out.println("Số thẻ căn cước: " + myBrother.getIdCard());
        System.out.println("Họ và tên: " + myBrother.getFullName());
        System.out.println("Địa chỉ: " + myBrother.getAddress());
        System.out.println("Ngày sinh: " + myBrother.getBirthDay());
        System.out.println("Email: " + myBrother.getEmail());
        System.out.println("Số điện thoại: " + myBrother.getPhoneNumber());
        System.out.println("Mã sinh viên: " + myBrother.getIdStudent());
        System.out.println("Tên trường: " + myBrother.getUniverName());
        System.out.println("Tên lớp: " + myBrother.getClassName());
        System.out.println("Chuyên ngành: " + myBrother.getSpecialized());
        System.out.println("Điểm trung bình: " + myBrother.getAvgGrade());
        System.out.println("Năm tốt nghiệp: " + myBrother.getGraduateTime());
        System.out.println("Số tín chỉ học lại: " + myBrother.getCreditRetake());
        System.out.println("Số môn học lại: " + myBrother.getSubjectFail());
        System.out.println("Mức lương khởi điểm: " + myBrother.getFirstWage());
        System.out.println("Công ty: " + myBrother.getCompany());
        System.out.println("Vị trí: " + myBrother.getPosition());
    }

    private static void showStudent(Student myStudent) {
        System.out.println("Số thẻ căn cước: " + myStudent.getIdCard());
        System.out.println("Họ và tên: " + myStudent.getFullName());
        System.out.println("Địa chỉ: " + myStudent.getAddress());
        System.out.println("Ngày sinh: " + myStudent.getBirthDay());
        System.out.println("Địa chỉ Email: " + myStudent.getEmail());
        System.out.println("Số điện thoại: " + myStudent.getPhoneNumber());
        System.out.println("Mã sinh viên: " + myStudent.getIdStudent());
        System.out.println("Tên trường đại học: " + myStudent.getUniverName());
        System.out.println("Tên lớp: " + myStudent.getClassName());
        System.out.println("Chuyên ngành: " + myStudent.getSpecialized());
        System.out.println("Điểm trung bình: " + myStudent.getAvgGrade());
    }

    private static void showTeacher(Teacher myTeacher) {
        System.out.println("Số thẻ căn Cước: " + myTeacher.getIdCard());
        System.out.println("Họ và Tên: " + myTeacher.getFullName());
        System.out.println("Địa chỉ: " + myTeacher.getAddress());
        System.out.println("Ngày sinh: " + myTeacher.getBirthDay());
        System.out.println("Địa chỉ Email: " + myTeacher.getEmail());
        System.out.println("Số điện thoại: " + myTeacher.getPhoneNumber());
        System.out.println("Mã giảng viên: " + myTeacher.getIdTeacher());
        System.out.println("Chuyên ngành: " + myTeacher.getExpertise());
        System.out.println("Lương: " + myTeacher.getWage());
        System.out.println("Kinh nghiệm: " + myTeacher.getExp());
    }

    private static void showPerson(Person person) {
        System.out.println("Số thẻ căn cước: " + person.getIdCard());
        System.out.println("Họ và tên: " + person.getFullName());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Ngày sinh: " + person.getBirthDay());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Số điện thoại: " + person.getPhoneNumber());
    }


}
