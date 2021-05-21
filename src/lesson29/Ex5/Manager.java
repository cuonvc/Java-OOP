package lesson29.Ex5;

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

    public Manager(Employee employee, Date start, Date end) {
        super(employee.getIdCard(), employee.getFullName(),
                employee.getAddress(), employee.getDayOfBirth(),
                employee.getEmail(), employee.getPhoneNumber(),
                employee.getIdEmp(), employee.getPosition(),
                employee.getBasicWages(), employee.getExperience(),
                employee.getDayOntheMonth());
        startDay = start;
        endDay = end;
    }

    public Manager(String idCard, String fullName, String address,
                   Date dayOfBirth, String email, String phoneNumber,
                   String idEmp, String position, float basicWages,
                   float experience, int dayOntheMonth, float receiveWages,
                   float bonus, Date startDay, Date endDay) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber,
                idEmp, position, basicWages, experience, dayOntheMonth,
                receiveWages, bonus);
        this.startDay = startDay;
        this.endDay = endDay;
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
    public void calcularWages() {
        setWages((getBasicWages() / 22) * getDayOntheMonth() + getBonus());
    }

    @Override
    public void receiveWages() {
        System.out.println("Giám đốc " + getFullName() + " đã nhận " + getWages() + " tiền lương");
    }

    @Override
    public void calcularBonus() {
        if (getDayOntheMonth() >= 22) {
            setBonus(getBasicWages() * 0.25f);
        } else {
            setBonus(0);
        }
    }

    @Override
    public void receiveBonus() {
        System.out.println("Giám đốc " + getFullName() + " đã nhận " + getBonus() + " tiền thưởng");
    }
}
