package lesson29.Ex3;

import java.util.Date;

public class Graduated extends Student {
    private Date graduateYear;  //năm tốt nghiệp
    private int creditFail;  //số tín chỉ học lại
    private int subjectFail;  //số môn đã trượt
    private float internWages;  //lương thực tập
    private String company;  //tên công ty đang làm
    private String position;  //vị trí công việc

    public Graduated(Date graduateYear, int creditFail, int subjectFail,
                     float internWages, String company, String position) {
        this.graduateYear = graduateYear;
        this.creditFail = creditFail;
        this.subjectFail = subjectFail;
        this.internWages = internWages;
        this.company = company;
        this.position = position;
    }

    public Graduated(String idStudent, String university, String classs,
                     String specialize, float avgGrade, Date graduateYear,
                     int creditFail, int subjectFail, float internWages,
                     String company, String position) {
        super(idStudent, university, classs, specialize, avgGrade);
        this.graduateYear = graduateYear;
        this.creditFail = creditFail;
        this.subjectFail = subjectFail;
        this.internWages = internWages;
        this.company = company;
        this.position = position;
    }

    public Graduated(String idCard, String fullName, String address,
                     Date dayOfBirth, String email, String phoneNumber,
                     String idStudent, String university, String classs,
                     String specialize, float avgGrade, Date graduateYear,
                     int creditFail, int subjectFail, float internWages,
                     String company, String position) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber,
                idStudent, university, classs, specialize, avgGrade);
        this.graduateYear = graduateYear;
        this.creditFail = creditFail;
        this.subjectFail = subjectFail;
        this.internWages = internWages;
        this.company = company;
        this.position = position;
    }

    public final Date getGraduateYear() {
        return graduateYear;
    }

    public final void setGraduateYear(Date graduateYear) {
        this.graduateYear = graduateYear;
    }

    public final int getCreditFail() {
        return creditFail;
    }

    public final void setCreditFail(int creditFail) {
        this.creditFail = creditFail;
    }

    public final int getSubjectFail() {
        return subjectFail;
    }

    public final void setSubjectFail(int subjectFail) {
        this.subjectFail = subjectFail;
    }

    public final float getInternWages() {
        return internWages;
    }

    public final void setInternWages(float internWages) {
        this.internWages = internWages;
    }

    public final String getCompany() {
        return company;
    }

    public final void setCompany(String company) {
        this.company = company;
    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(String position) {
        this.position = position;
    }


    public void visitClass() {
        System.out.println("Về thăm trường cũ");
    }

    public void postgraduateRegister() {
        System.out.println("Đăng lý học cao học");
    }
}
