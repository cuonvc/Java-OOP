package lesson18.Ex3;

import java.util.Date;

public class Student extends Person {
    private String idStudent;  //mã sinh viên
    private String univerName;  //tên trường
    private String className;   //tên lớp
    private String specialized; //chuyên ngành
    private float avgGrade;  //điểm trung bình


    public Student(String idCard, String fullName, String address, Date birthDay, String email, String phoneNumber,
                   String idStudent, String univerName, String className, String specialized, float avgGrade) {
        super(idCard, fullName, address, birthDay, email, phoneNumber);
        this.idStudent = idStudent;
        this.univerName = univerName;
        this.className = className;
        this.specialized = specialized;
        this.avgGrade = avgGrade;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }
}
