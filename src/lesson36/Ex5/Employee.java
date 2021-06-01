package lesson36.Ex5;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String idEmp;
    private String position;
    private float basicWages;
    private float experience;
    private int dayInTheMonth;
    private float wages;
    private float bonus;

    public Employee() {
    }

    public Employee(String idCard, String fullName, String address,
                    Date dayOfBirth, String email, String phoneNumber,
                    String idEmp, String position, float basicWages,
                    float experience, int dayInTheMonth) throws InvalidPersonException {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.setNextIdEmp(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayInTheMonth = dayInTheMonth;
    }

    public Employee(String idEmp, String position, float basicWages,
                    float experience, int dayInTheMonth, float wages, float bonus) {
        this.setNextIdEmp(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        this.dayInTheMonth = dayInTheMonth;
        this.wages = wages;
        this.bonus = bonus;
    }

    /**
     * thiết lập mã nhân viên
     * @param idEmp
     */
    private void setNextIdEmp(String idEmp) {
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
                    float experience, int dayInTheMonth,
                    float wages, float bonus) throws InvalidPersonException {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber);
        this.setNextIdEmp(idEmp);
        this.position = position;
        this.basicWages = basicWages;
        this.experience = experience;
        setDayInTheMonth(dayInTheMonth);
        this.wages = wages;
        this.bonus = bonus;
    }

    public static final int getNextId() {
        return nextId;
    }

    public static final void setNextId(int nextId) {
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

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public int getDayInTheMonth() {
        return dayInTheMonth;
    }

    public final void setDayInTheMonth(int dayInTheMonth) throws
            InvalidPersonException {
        //coi 1 tháng có 30 ngày
        if (dayInTheMonth >= 0 && dayInTheMonth <= 30) {

        } else {
            var msg = "Số ngày không hợp lệ";
            throw new InvalidPersonException(msg, dayInTheMonth);
        }
    }

    public final float getWages() {
        return wages;
    }

    public final void setWages(float wages) {
        this.wages = wages;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    protected void work(String job) {
        System.out.println("Nhân viên" + getFullNameStr() + " đang làm " + job);
    }

    /**
     * Tính lương
     */
    public void calculatorWages() {
        //giả sử 1 tháng làm 22 ngày là tiêu chuẩn
        wages = (basicWages/22) * dayInTheMonth + bonus;
    }

    /**
     * Nhận lương
     */
    public void receiveWages() {
        System.out.println("Nhân viên " + getFullNameStr()
                + " đã nhận " + wages + ".VNĐ tiền lương");
    }

    /**
     * Tính thưởng
     */
    public void calculatorBonus() {
        if (dayInTheMonth >= 22) {
            bonus = (dayInTheMonth - 20) * 0.5f * (basicWages / 22);
        } else {
            bonus = 0;
        }
    }

    public void receiveBonus() {
        System.out.println("Nhân viên " + getFullNameStr() + " đã nhận " + bonus + ".VNĐ tiền thưởng");
    }
}
