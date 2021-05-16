package lesson25.Ex3;

import java.util.Date;

public class Student extends Person {
    private String idStudent;  //mã sinh viên
    private String university;  //tên trường
    private String classs; //tên lớp
    private String specialized;  //chuyên ngành
    private float avgGrade;  //điểm trung bình

    public Student(String idCard, String fullName, String address, Date dayOfBirth,
                   String email, String phoneNumber, String idStudent, String university,
                   String classs, String specialized, float avgGrade) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.idStudent = idStudent;
        this.university = university;
        this.classs = classs;
        this.specialized = specialized;
        this.avgGrade = avgGrade;
    }

    public final String getIdStudent() {
        return idStudent;
    }

    public final void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public final String getUniversity() {
        return university;
    }

    public final void setUniversity(String university) {
        this.university = university;
    }

    public final String getClasss() {
        return classs;
    }

    public final void setClasss(String classs) {
        this.classs = classs;
    }

    public final String getSpecialized() {
        return specialized;
    }

    public final void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public final float getAvgGrade() {
        return avgGrade;
    }

    public final void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }


    @Override
    protected void work() {   //phương thức được implement từ lớp abstract
        System.out.println("Sinh viên " + getFullName() + " đang làm việc của mình");
    }


    public void doExercises() {
        System.out.println(getFullName() + " đang làm bài tập");
    }

    public void takeATest() {
        System.out.println(getFullName() + " đang làm bài kiểm tra");
    }

    public void payTheSchool() {
        System.out.println(getFullName() + " đang nộp tiền học");
    }

    public void registerCredit() {
        System.out.println(getFullName() + " đang đăng ký tín chỉ");
    }
}
