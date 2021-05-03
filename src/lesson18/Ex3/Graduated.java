package lesson18.ex3;

import java.util.Date;

public class Graduated extends Student {
    private String graduateTime;  //thời điểm tốt nghiệp
    private int CreditRetake;  //số tín chỉ học lại
    private int SubjectFail;  //số môn bị trượt
    private long firstWage;  //mức lương khởi điểm
    private String company;  //tên công ty
    private String position;  //vị trí công việc

    public Graduated(String idCard, String fullName, String address, Date birthDay, String email,
                     String phoneNumber, String idStudent, String univerName, String className,
                     String specialized, float avgGrade, String graduateTime, int creditRetake, int subjectFail,
                     long firstWage, String company, String position) {
        super(idCard, fullName, address, birthDay, email, phoneNumber, idStudent, univerName,
                className, specialized, avgGrade);
        this.graduateTime = graduateTime;
        CreditRetake = creditRetake;
        SubjectFail = subjectFail;
        this.firstWage = firstWage;
        this.company = company;
        this.position = position;
    }


    public String getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(String graduateTime) {
        this.graduateTime = graduateTime;
    }

    public int getCreditRetake() {
        return CreditRetake;
    }

    public void setCreditRetake(int creditRetake) {
        CreditRetake = creditRetake;
    }

    public int getSubjectFail() {
        return SubjectFail;
    }

    public void setSubjectFail(int subjectFail) {
        SubjectFail = subjectFail;
    }

    public long getFirstWage() {
        return firstWage;
    }

    public void setFirstWage(long firstWage) {
        this.firstWage = firstWage;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
