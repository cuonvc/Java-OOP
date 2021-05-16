package lesson25.Ex3;

import java.util.Date;

public class Graduate extends Student {
    private Date timeGraduate;  //thời điểm tốt nghiệp
    private int creditsFail;  //số tin chỉ học lại
    private int subjectFail;  //số môn đã trượt
    private float internWage;   //lương khởi điểm
    private String company;  //công ty đang làm
    private String position;  //vị trí công việc


    public Graduate(String idCard, String fullName, String address, Date dayOfBirth,
                    String email, String phoneNumber, String idStudent, String university,
                    String classs, String specialized, float avgGrade, Date timeGraduate,
                    int creditsFail, int subjectFail, float internWage, String company, String position) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber, idStudent, university, classs, specialized, avgGrade);
        this.timeGraduate = timeGraduate;
        this.creditsFail = creditsFail;
        this.subjectFail = subjectFail;
        this.internWage = internWage;
        this.company = company;
        this.position = position;
    }

    public final Date getTimeGraduate() {
        return timeGraduate;
    }

    public final void setTimeGraduate(Date timeGraduate) {
        this.timeGraduate = timeGraduate;
    }

    public final int getCreditsFail() {
        return creditsFail;
    }

    public final void setCreditsFail(int creditsFail) {
        this.creditsFail = creditsFail;
    }

    public final int getSubjectFail() {
        return subjectFail;
    }

    public final void setSubjectFail(int subjectFail) {
        this.subjectFail = subjectFail;
    }

    public final float getInternWage() {
        return internWage;
    }

    public final void setInternWage(float internWage) {
        this.internWage = internWage;
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





    public void visitOldSchool() {
        System.out.println(getFullName() + " về thăm trường cũ");
    }

    public void jobManager() {
        System.out.println("Quản lý công việc hiện thời");
    }
}
