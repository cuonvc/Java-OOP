package lesson21.Ex4;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String idEmp;  //mã nhân viên
    private String position;  //vị trí đảm nhiệm
    private double basicWage;  //mức lương cứng
    private float experience;  //số năm kinh nghiệm
    private int dayOnMonth;  //số ngày làm việc trong tháng
    private double bonus;  //mức thưởng
    private double wage;  //lương thực nhận


    public Employee(String idEmp, String position, double basicWage,
                    float experience, int dayOnMonth, double bonus, double wage) {
        setNextIdEmp(idEmp);
        this.position = position;
        this.basicWage = basicWage;
        this.experience = experience;
        this.dayOnMonth = dayOnMonth;
        this.bonus = bonus;
        this.wage = wage;
    }



    public Employee() {

    }


    public Employee(String idCard, String fullName, String address, Date dayOfBirth,
                    String email, String phoneNumber, String idEmp, String position,
                    double basicWage, float experience, int dayOnMonth, double bonus, double wage) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        setNextIdEmp(idEmp);
        this.position = position;
        this.basicWage = basicWage;
        this.experience = experience;
        this.dayOnMonth = dayOnMonth;
        this.bonus = bonus;
        this.wage = wage;
    }


    /**
     * phương thức thiết lập một mã nhân viên hoàn chỉnh
     * @param idEmp mã nhân viên sau khi thiết lập
     * @return trả về mã nhân viên hoàn chỉnh
     */
    public final void setNextIdEmp(String idEmp) {
        if (idEmp == null) {   //nếu mã chưa tồn tại
            this.idEmp = "EMP" + nextId;  //thì thiết lập mới
            nextId++;  //tăng dần phần số
        } else {
            this.idEmp = idEmp;
        }
    }

    public final static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public final String getIdEmp() {
        return idEmp;
    }

//    public final void setIdEmp(String idEmp) {
//        this.idEmp = idEmp;
//    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(String position) {
        this.position = position;
    }

    public final double getBasicWage() {
        return basicWage;
    }

    public final void setBasicWage(double basicWage) {
        this.basicWage = basicWage;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }

    public final int getDayOnMonth() {
        return dayOnMonth;
    }

    public final void setDayOnMonth(int dayOnMonth) {
        this.dayOnMonth = dayOnMonth;
    }

    public final double getBonus() {
        return bonus;
    }

    public final void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public final double getWage() {
        return wage;
    }

    public final void setWage(double wage) {
        this.wage = wage;
    }



//các hành động của nhân viên
    public void calculateJob() {  //tính công
        //giả sử một tháng làm 26 ngày
        //nếu nhiều hơn 26 ngày thì từ ngày 27 đc thưởng 50% mỗi ngày
    }

    public void receiveBonus() {  //tính thưởng
        if (dayOnMonth > 26) {
            var bonusDay = dayOnMonth - 26;
            bonus = bonusDay * 0.5d * (basicWage / 26);
        } else {
            bonus = 0;
        }
    }

    public void receiveSalary() {   //nhận lương
        wage = dayOnMonth * (basicWage / 26) + bonus;
    }



    public final void travel(String somewhere) {
        System.out.println(getFullName() + " đang du lịch ở " + somewhere);
    }

    @Override
    public void eat() {
        System.out.println("Nhân viên " + getFullName() + " đang ăn");
    }

    @Override
    public void sleep() {
        System.out.println("Nhân viên " + getFullName() + " đang ngủ");
    }

    @Override
    public void work(String job) {
        System.out.println("Nhân viên " + getFullName() + " đang " + job);
    }

    @Override
    public void talk() {
        System.out.println("Nhân viên " + getFullName() + " đang nói chuyện với mọi người");
    }

    @Override
    public void relax(String something) {
        System.out.println("Nhân viên " + getFullName() + " đang chơi game " + something);
    }
}
