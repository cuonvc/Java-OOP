package lesson25.Ex5;

import java.util.Date;

public class Employee extends Person{
    private static int nextId = 1001;
    private String idEmp;  //mã nhân viên
    private String position;  //vị trí
    private float basicWages;  //mức lương
    private float experience;  //số năm kinh nghiệm
    private int dayInTheMonth;  //số ngày làm việc trong tháng
    private float bonus;
    private float receiveWages;  //lương thực nhận


    public Employee(String idEmp, String position, float basicWages,
                    float experience, int dayInTheMonth, float bonus, float receiveWages) {
        setIdEmp(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayInTheMonth = dayInTheMonth;
        this.bonus = bonus;
        this.receiveWages = receiveWages;
    }

    public Employee(String idCard, String fullName, String address, Date dayOfBirth, String email,
                    String phoneNumber, String idEmp, String position, float basicWages, float experience,
                    int dayInTheMonth, float bonus, float receiveWages) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        setIdEmp(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayInTheMonth = dayInTheMonth;
        this.bonus = bonus;
        this.receiveWages = receiveWages;
    }

    public Employee () {

    }


    public final String getIdEmp() {
        return idEmp;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public final void setIdEmp(String idEmp) {
        if (idEmp == null) {
            this.idEmp = "EMP" + nextId;
            nextId++;
        } else {
            this.idEmp = idEmp;
        }
    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(String position) {
        this.position = position;
    }

    public final float getBasicWages() {
        return basicWages;
    }

    public final void setBasicWages(float basicWages) {
        this.basicWages = basicWages;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }

    public final int getDayInTheMonth() {
        return dayInTheMonth;
    }

    public final void setDayInTheMonth(int dayInTheMonth) {
        this.dayInTheMonth = dayInTheMonth;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public final float getReceiveWages() {
        return receiveWages;
    }

    public final void setReceiveWages(float receiveWages) {
        this.receiveWages = receiveWages;
    }



    @Override
    public void work(String job) {  //đây là phương thức được implement từ abstract class (Person)
        System.out.println(getFullName() + " đang làm " + job);
    }

    @Override
    public void eat(String food) {
        System.out.println("Nhân viên " + getFullName() + " đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Nhân viên " + getFullName() + " đang ngủ");
    }

    @Override
    public void talk() {
        System.out.println("Nhân viên " + getFullName() + " đang nói chuyện");
    }

    @Override
    public void relax() {
        System.out.println("Nhân viên " + getFullName() + " đag chơi game");
    }





//hành động của nhân viên

    public void calcularReceiveWage() {   //tính lương thực nhận
        //giả sử một tháng đủ chỉ tiêu làm 22 ngày
        receiveWages = (basicWages / 22) * dayInTheMonth + bonus;
    }

//    public void receiveWage() {    //nhận lương
//        System.out.println(getFullName() + " đã nhận " + receiveWages + ".VNĐ l ương tháng này");
//    }

    public void calcularBonus() {   //tính thưởng
        //nếu trong tháng làm trên 20 ngày thì từ ngày 21 bắt đầu đc tính bonus
        if (dayInTheMonth > 20) {
            bonus = (dayInTheMonth - 20) * (0.5f * basicWages /22);  //số ngày dư nhân với 50%lương của một ngày
        } else {
            bonus = 0;
        }
    }

    public void receiveBonus() {   //nhận thưởng
        System.out.println(getFullName() + " đã nhận " + bonus + ".VNĐ thưởng tháng này");
    }

    public void travel(String where) {
        System.out.println("Nhân viên " + getFullName() + " đang đi du lịch ở " + where);
    }
}
