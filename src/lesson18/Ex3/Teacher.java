package lesson18.ex3;

import java.util.Date;

public class Teacher extends Person {
    private String idTeacher;  //mã giảng viên
    private String expertise;  //chuyên môn
    private long wage; //mức lương
    private float exp; //số năm kn

    public Teacher(String idCard, String fullName, String address, Date birthDay, String email,
                   String phoneNumber, String idTeacher, String expertise, long wage, float exp) {
        super(idCard, fullName, address, birthDay, email, phoneNumber);
        this.idTeacher = idTeacher;
        this.expertise = expertise;
        this.wage = wage;
        this.exp = exp;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }
}
