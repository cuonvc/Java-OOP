package lesson43.Ex5;

import lesson43.Ex5.Exception.InvalidEmailException;
import lesson43.Ex5.Exception.InvalidFullNameException;
import lesson43.Ex5.Exception.InvalidPhoneNumberException;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String empId;
    private String position;
    private float wages;
    private float experience;
    private int dayWorkingInTheMonth;
    private float totalWages;
    private float bonus;

    public Employee() {
    }

    public Employee(String empId, String position, float wages,
                    float experience, int dayWorkingInTheMonth,
                    float totalWages, float bonus) {
        setnextIdEmp(empId);
        this.position = position;
        this.wages = wages;
        this.experience = experience;
        this.dayWorkingInTheMonth = dayWorkingInTheMonth;
        this.totalWages = totalWages;
        this.bonus = bonus;
    }

    public Employee(String idCard, String fullname, String address,
                    Date dayOfBirth, String email, String phoneNumber,
                    String empId, String position, float wages,
                    float experience, int dayWorkingInTheMonth,
                    float totalWages, float bonus)
            throws InvalidPhoneNumberException, InvalidFullNameException,
            InvalidEmailException {
        super(idCard, fullname, address, dayOfBirth, email, phoneNumber);
        setnextIdEmp(empId);
        this.position = position;
        this.wages = wages;
        this.experience = experience;
        this.dayWorkingInTheMonth = dayWorkingInTheMonth;
        this.totalWages = totalWages;
        this.bonus = bonus;
    }

    private void setnextIdEmp(String empId) {
        if (empId == null) {
            this.empId = "EMP" + nextId;
            nextId++;
        } else {
            this.empId = empId;
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public final String getEmpId() {
        return empId;
    }

    public final void setEmpId(String empId) {
        this.empId = empId;
    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(String position) {
        this.position = position;
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

    public final int getDayWorkingInTheMonth() {
        return dayWorkingInTheMonth;
    }

    public final void setDayWorkingInTheMonth(int dayWorkingInTheMonth) {
        this.dayWorkingInTheMonth = dayWorkingInTheMonth;
    }

    public final float getTotalWages() {
        return totalWages;
    }

    public final void setTotalWages(float totalWages) {
        this.totalWages = totalWages;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }


    public void calculatorWages() {  //tính tổng lương
        //giả sử 1 tháng làm tiêu chuẩn 22 ngày
        totalWages = (wages / 22) * dayWorkingInTheMonth + bonus;
    }

    public void receiveWages() {
        System.out.println(getFullname() + " đã nhận " + totalWages + " tiền lương");
    }

    public void calculatorBonus() {
        //nếu làm 20d trở lên thì mỗi ngày thưởng 50%
        if (dayWorkingInTheMonth >= 20) {
            bonus = (dayWorkingInTheMonth - 19) * (0.5f * (wages / 22));
        } else {
            bonus = 0;
        }
    }

    public void receiveBonus() {
        System.out.println(getFullname() +  " đã nhận " + bonus + " tiền thưởng");
    }

    public void travel() {
        System.out.println(getFullname() + " đang đi du lịch");
    }

    @Override
    protected void work(String job) {
        System.out.println(getFullname() + " đang làm việc");
    }
}
