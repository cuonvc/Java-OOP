package lesson43.Ex5;

import lesson43.Ex5.Exception.InvalidEmailException;
import lesson43.Ex5.Exception.InvalidFullNameException;
import lesson43.Ex5.Exception.InvalidPhoneNumberException;

import java.util.Date;

public class Manager extends Employee {
    private Date startDay;
    private Date endDay;

    public Manager(String idCard, String fullname,
                   String address, Date dayOfBirth, String email,
                   String phoneNumber, String empId, String position,
                   float wages, float experience, int dayWorkingInTheMonth,
                   float totalWages, float bonus, Date startDay, Date endDay) throws
            InvalidPhoneNumberException,
            InvalidFullNameException, InvalidEmailException {
        super(idCard, fullname, address, dayOfBirth, email,
                phoneNumber, empId, position, wages, experience,
                dayWorkingInTheMonth, totalWages, bonus);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(Date startDay, Date endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(Employee employee, Date start, Date end) throws
            InvalidPhoneNumberException, InvalidFullNameException,
            InvalidEmailException {
        super(employee.getIdCard(), employee.getFullNameStr(),
                employee.getAddress(), employee.getDayOfBirth(),
                employee.getEmail(), employee.getPhoneNumber(),
                employee.getEmpId(), employee.getPosition(),
                employee.getWages(), employee.getExperience(),
                employee.getDayWorkingInTheMonth(),
                employee.getTotalWages(), employee.getBonus());
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

    @Override
    public void calculatorWages() {
        setTotalWages((getWages() / 22) * getDayWorkingInTheMonth() + getBonus());
    }

    @Override
    public void receiveWages() {
        System.out.println("Giám đốc " + getFullNameStr() + " đã nhận " + getTotalWages() + " tiền lương");
    }

    @Override
    public void calculatorBonus() {
        //nếu làm trên 22 ngày thì được thưởng 25% lương cả tháng
        if (getDayWorkingInTheMonth() >=22) {
            setBonus((getWages() / 22) * getDayWorkingInTheMonth() * 0.25f);
        } else {
            setBonus(0);
        }
    }

    @Override
    public void receiveBonus() {
        System.out.println("Giám đốc " + getFullNameStr() + " đã nhận " + getBonus() + " tiền thưởng");
    }
}
