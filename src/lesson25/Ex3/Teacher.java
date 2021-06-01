package lesson25.Ex3;

import java.util.Date;

public class Teacher extends Person {
    private String idTeacher;  //mã giảng viên
    private String specialize;  //chuyên môn
    private float wages;  //mức lương
    private float experience;  //kinh nghiệm


    public Teacher(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber, String idTeacher,
                   String specialize, float wages, float experience) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.idTeacher = idTeacher;
        this.specialize = specialize;
        this.wages = wages;
        this.experience = experience;
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
    protected void work() {  //phương thức được implement từ lớp abstract
        System.out.println("Giảng viên đang làm việc");
    }


    public void composing() {
        System.out.println(getFullName() + " đang soạn bài");
    }

    public void marking() {
        System.out.println(getFullName() + " đang chấm bài");
    }

    public void doTopic() {
        System.out.println(getFullName() + " đang ra đề");
    }

    public void meetting() {
        System.out.println(getFullName() + " đang họp hội đồng");
    }
}
