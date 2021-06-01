package lesson21.Ex3;

import java.util.Date;

public class Student extends Person{
    private String idStudent;  //mã sinh viên
    private String univer;   //tên trường
    private String specialized;   //chuyên ngành
    private String classs;  //đơn vị lớp
    private float avgGrade;  //điểm trung bình


    public Student(String idStudent, String univer, String specialized, String classs, float avgGrade) {
        this.idStudent = idStudent;
        this.univer = univer;
        this.specialized = specialized;
        this.classs = classs;
        this.avgGrade = avgGrade;
    }

    public Student(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber, String idStudent,
                   String univer, String specialized, String classs, float avgGrade) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.idStudent = idStudent;
        this.univer = univer;
        this.specialized = specialized;
        this.classs = classs;
        this.avgGrade = avgGrade;
    }

    public Student() {

    }

//getter and setter dạng final
    public final String getIdStudent() {
        return idStudent;
    }

    public final void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public final String getUniver() {
        return univer;
    }

    public final void setUniver(String univer) {
        this.univer = univer;
    }

    public final String getSpecialized() {
        return specialized;
    }

    public final void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public final String getClasss() {
        return classs;
    }

    public final void setClasss(String classs) {
        this.classs = classs;
    }

    public final float getAvgGrade() {
        return avgGrade;
    }

    public final void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }



//các hành động riêng của sinh viên
    public void doHomework(String subject) {
        System.out.println(getFullName() + " đang làm bài tập môn " + subject);
    }

    public void test() {
        System.out.println(getFullName() + " đang làm bài kiểm tra");
    }

    public void creditRegistration() {
        System.out.println(getFullName() + " đang đăng ký tín chỉ");
    }

//các hành động được override lại từ Person

    @Override
    public void eat(String something) {
        super.eat(something);
        System.out.println("Các sinh viên đang đi ăn ở căn tin");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(getFullName() + " đang ngủ nướng");
    }

    @Override
    public void work(String job) {
        super.work(job);
        System.out.println(getFullName() + " đang tham gia thực tập");
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Sinh viên đang chơi game với giảng viên !");
    }
}
