package lesson21.Ex3;

import java.util.Date;

public class GraduatedStudent extends Student {
    private Date graduatedDate;  //thời điểm tốt nghiệp
    private int creditsFail;  //số tín chỉ học lại
    private int subjectsFail;  //số môn đã trượt
    private long startWage;  //mức lương khởi điểm
    private String company;  //công ty đang làm
    private String position;  //vị trí công việc


    public GraduatedStudent(Date graduatedDate, int creditsFail, int subjectsFail,
                            long startWage, String company, String position) {
        this.graduatedDate = graduatedDate;
        this.creditsFail = creditsFail;
        this.subjectsFail = subjectsFail;
        this.startWage = startWage;
        this.company = company;
        this.position = position;
    }

    public GraduatedStudent(String idStudent, String univer, String specialized,
                            String classs, float avgGrade, Date graduatedDate, int creditsFail,
                            int subjectsFail, long startWage, String company, String position) {
        super(idStudent, univer, specialized, classs, avgGrade);
        this.graduatedDate = graduatedDate;
        this.creditsFail = creditsFail;
        this.subjectsFail = subjectsFail;
        this.startWage = startWage;
        this.company = company;
        this.position = position;
    }

    public final Date getGraduatedDate() {
        return graduatedDate;
    }

    public final void setGraduatedDate(Date graduatedDate) {
        this.graduatedDate = graduatedDate;
    }

    public final int getCreditsFail() {
        return creditsFail;
    }

    public final void setCreditsFail(int creditsFail) {
        this.creditsFail = creditsFail;
    }

    public final int getSubjectsFail() {
        return subjectsFail;
    }

    public final void setSubjectsFail(int subjectsFail) {
        this.subjectsFail = subjectsFail;
    }

    public final long getStartWage() {
        return startWage;
    }

    public final void setStartWage(long startWage) {
        this.startWage = startWage;
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



    public void travel() {
        System.out.println(getFullName() + " về thăm trường cũ");
    }

    public void manageJob() {
        System.out.println(getFullName() + " quản lý công việc của mình");
    }


    @Override
    public void doHomework(String subject) {
        super.doHomework(subject);
    }

    @Override
    public void test() {
        super.test();
    }

    @Override
    public void creditRegistration() {
        super.creditRegistration();
    }

    @Override
    public void eat(String something) {
        super.eat(something);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void work(String job) {
        super.work(job);
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void relax() {
        super.relax();
    }
}
