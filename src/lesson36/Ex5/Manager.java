package lesson36.Ex5;

import java.util.Date;

public class Manager extends Employee {
    private Date startDay;
    private Date endDay;

    public Manager() {
    }

    public Manager(Date startDay, Date endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(String idEmp, String position, float basicWages,
                   float experience, int dayInTheMonth, float wages,
                   float bonus, Date startDay, Date endDay) {
        super(idEmp, position, basicWages, experience,
                dayInTheMonth, wages, bonus);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber,
                   String idEmp, String position, float basicWages,
                   float experience, int dayInTheMonth, float wages,
                   float bonus, Date startDay, Date endDay) throws
            InvalidPersonException {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber,
                idEmp, position, basicWages, experience,
                dayInTheMonth, wages, bonus);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(Employee employee, Date start, Date end) throws
            InvalidPersonException {
        super(employee.getIdCard(), employee.getFullNameStr(),
                employee.getAddress(), employee.getDayOfBirth(),
                employee.getEmail(), employee.getPhoneNumber(),
                employee.getIdEmp(), employee.getPosition(),
                employee.getBasicWages(), employee.getExperience(),
                employee.getDayInTheMonth());
        startDay = start;
        endDay = end;
    }


    public final Date getStartDay() {
        return startDay;
    }

    public final void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public final Date getEndDay() {
        return endDay;
    }

    public final void setEndDay(Date endDay) {
        this.endDay = endDay;
    }


    public void meeting() {
        System.out.println("Giám đốc " + getFullName() + " đang họp");
    }

    @Override
    public void calculatorWages() {
        setWages(getBasicWages() / 22 * getDayInTheMonth() + getBonus());
    }

    @Override
    public void receiveWages() {
        System.out.println("Giám đốc " + getFullName() +
                " đã nhận " + getWages() + ".VNĐ tiền lương");
    }

    @Override
    public void calculatorBonus() {
        if (getDayInTheMonth() >= 22) {
            setBonus(getWages() * 0.25f);
        } else {
            setBonus(0);
        }
    }

    @Override
    public void receiveBonus() {
        System.out.println("Giám đốc " + getFullName()
                + " đã nhận " + getBonus() + ".VNĐ tiền thưởng");
    }
}
