package lesson29.Ex3;

import java.util.Date;

public class Student extends Person {
    private static int nextId = 10001;
    private String idStudent;  //mã sinh viên
    private String university;  //tên trường
    private String classs;  //tên lớp
    private String specialize;  //chuyên ngành
    private float avgGrade;  //điểm trung bình

    public Student() {
    }

    public Student(String idStudent, String university,
                   String classs, String specialize, float avgGrade) {
        this.setNextIdStd(idStudent);
        this.university = university;
        this.classs = classs;
        this.specialize = specialize;
        this.avgGrade = avgGrade;
    }

    public Student(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber,
                   String idStudent, String university, String classs,
                   String specialize, float avgGrade) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.setNextIdStd(idStudent);
        this.university = university;
        this.classs = classs;
        this.specialize = specialize;
        this.avgGrade = avgGrade;
    }

    /**
     * thiết lập mã sinh viên
     * @param idStudent mã sinh viên hoàn chỉnh
     */
    private void setNextIdStd(String idStudent) {
        if (idStudent == null) {  //nếu mã sinh viên chưa tồn tại
            this.idStudent = "STD" + nextId;
            nextId++;
        } else {
            this.idStudent = idStudent;
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
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

    public final String getSpecialize() {
        return specialize;
    }

    public final void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public final float getAvgGrade() {
        return avgGrade;
    }

    public final void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    protected void work(String job) {
        System.out.println("Sinh viên đang làm việc nhóm vè chủ đề " + job);
    }

    public void dohomeword(String subject) {
        System.out.println("Sinh viên " + getFullName() +
                " đang làm bài tập vn môn " + subject);
    }

    public void test(String subject) {
        System.out.println("Sinh viên " + getFullName() +
                " đang làm bài kiểm tra môn " + subject);
    }

    public void payment(float amount) {
        System.out.println("Sinh viên " + getFullName() + "" +
                " đang đóng " + amount + " tiền học phí");
    }

    public void creditRegister() {
        System.out.println("Sinh viên " + getFullName() + " đang đăng ký tín chỉ");
    }
}
