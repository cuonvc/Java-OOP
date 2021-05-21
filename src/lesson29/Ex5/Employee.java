package lesson29.Ex5;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String idEmp;
    private String position;
    private float basicWages;
    private float experience;
    private int dayOntheMonth;
    private float wages;
    private float bonus;

    public Employee() {
    }

    public Employee(String idCard, String fullName, String address,
                    Date dayOfBirth, String email, String phoneNumber,
                    String idEmp, String position, float basicWages,
                    float experience, int dayOntheMonth) {
        super(idCard, fullName, address, dayOfBirth,
                email, phoneNumber);
        this.setNextIdEMP(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayOntheMonth = dayOntheMonth;
    }

    /**
     * thiết lập mã nhân viên
     * @param idEmp
     */
    private void setNextIdEMP(String idEmp) {
        if (idEmp == null) {
            this.idEmp = "EMP" + nextId;
            nextId++;
        } else {
            this.idEmp = idEmp;
        }
    }

    public Employee(String idCard, String fullName, String address,
                    Date dayOfBirth, String email, String phoneNumber,
                    String idEmp, String position, float basicWages,
                    float experience, int dayOntheMonth, float receiveWages,
                    float bonus) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.setNextIdEMP(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayOntheMonth = dayOntheMonth;
        this.wages = receiveWages;
        this.bonus = bonus;
    }

    public final static int getNextId() {
        return nextId;
    }

    public final static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public final String getIdEmp() {
        return idEmp;
    }

    public final void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
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

    public final int getDayOntheMonth() {
        return dayOntheMonth;
    }

    public final void setDayOntheMonth(int dayOntheMonth) {
        this.dayOntheMonth = dayOntheMonth;
    }

    public final float getWages() {
        return wages;
    }

    public final void setWages(float receiveWages) {
        this.wages = receiveWages;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("Nhân viên " + getFullName() + " đang làm việc");
    }

    public void calcularWages() {  //tính lương
        //giả sử 1 tháng làm 22 ngày là tiêu chuẩn
        wages = (basicWages / 22) * dayOntheMonth + bonus;
    }

    public void receiveWages() {  //nhận lương
        System.out.println("Nhân viên " + getFullName() + " đã nhận " + wages + " tiền lương");
    }

    public void calcularBonus() {  //tính thưởng
        if (dayOntheMonth >= 20) {
            bonus = (dayOntheMonth - 20) * (basicWages / 22) * 0.5f;
        } else {
            bonus = 0;
        }
    }

    public void receiveBonus() {   //nhận thưởng
        System.out.println("Nhân viên " + getFullName() + " đã nhận " + bonus + " tiền thưởng");
    }
}
