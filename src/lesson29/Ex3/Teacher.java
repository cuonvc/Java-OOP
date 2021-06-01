package lesson29.Ex3;

import java.util.Date;

public class Teacher extends Person {
    private static int nextId = 1001;
    private String idTeacher;  //mã giảng viên
    private String specialize;  //chuyên môn
    private float wages;  //mức lương
    private float experience;  //số năm kinh nghiệm

    public Teacher(String idTeacher,
                   String specialize, float wages, float experience) {
        setNextIdTeach(idTeacher);
        this.specialize = specialize;
        this.wages = wages;
        this.experience = experience;
    }

    public Teacher(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber,
                   String idTeacher, String specialize,
                   float wages, float experience) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        setNextIdTeach(idTeacher);
        this.specialize = specialize;
        this.wages = wages;
        this.experience = experience;
    }

    /**
     * phương thức thiết lập mã giảng viên
     * @param idTeacher mã giảng viên hoàn chỉnh
     */
    private void setNextIdTeach(String idTeacher) {
        if (idTeacher == null) {  //nếu mã chưa tồn tại
            this.idTeacher = "TEACH" + nextId;
            nextId++;
        } else {
            this.idTeacher = idTeacher;
        }
    }


    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Teacher.nextId = nextId;
    }

    public final String getIdTeacher() {
        return idTeacher;
    }

    public final void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public final String getSpecialize() {
        return specialize;
    }

    public final void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public final float getWages() {
        return wages;
    }

    public final void setWages(float wages) {
        this.wages = wages;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    protected void work(String job) {
        System.out.println(getFullName() + " đang " + job);
    }

    public void composing() {
        System.out.println("Giảng viên " + getFullName() + " đang soạn bài");
    }

    public void mark() {
        System.out.println("Giảng viên " + getFullName() + " đang chấm bài ");
    }

    public void meeting() {
        System.out.println("Giảng viên " + getFullName() + " đang họp");
    }
}
