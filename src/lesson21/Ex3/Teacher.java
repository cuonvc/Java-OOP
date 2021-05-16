package lesson21.Ex3;

import java.util.Date;

public class Teacher extends Person{
    private String idTeacher;  //mã giảng viên
    private String specialize;  //chuyên môn
    private long wage;  //mức lương
    private float experience;  //số năm kinh nghiệm


    public Teacher(String idTeacher, String specialize, long wage, float experience) {
        this.idTeacher = idTeacher;
        this.specialize = specialize;
        this.wage = wage;
        this.experience = experience;
    }

    public Teacher(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber, String idTeacher,
                   String specialize, long wage, float experience) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.idTeacher = idTeacher;
        this.specialize = specialize;
        this.wage = wage;
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

    public final long getWage() {
        return wage;
    }

    public final void setWage(long wage) {
        this.wage = wage;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }



//các hành động riêng của giảng viên
    public void joinMeeting() {
        System.out.println(getFullName() + " đang họp hội đồng");
    }

    public void mark(String subject) {
        System.out.println(getFullName() + " đang chấm bài thi môn " + subject);
    }


//các hành động được override lại từ Person
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
        System.out.println("Giảng viên đang chơi game với học sinh");
    }
}
