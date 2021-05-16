package lesson21.Ex4;

import java.util.Date;

public class Manager extends Employee {
    private Date startDay;   //ngày bắt đầu nhiệm kì
    private Date endDay;   //ngày kết thúc nhiệm kì



    public Manager(String idEmp, String position, double basicWage, float experience,
                   int dayOnMonth, double bonus, double wage, Date startDay, Date endDay) {
        super(idEmp, position, basicWage, experience, dayOnMonth, bonus, wage);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(String idCard, String fullName, String address, Date dayOfBirth, String email, String phoneNumber,
                   String idEmp, String position, double basicWage, float experience, int dayOnMonth,
                   double bonus, double wage, Date startDay, Date endDay) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber, idEmp, position, basicWage,
                experience, dayOnMonth, bonus, wage);
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Manager(Employee employee, Date start, Date end) {
        super(employee.getIdCard(), employee.getFullNameStr(), employee.getAddress(), employee.getDayOfBirth(),
                employee.getEmail(), employee.getPhoneNumber(), employee.getIdEmp(), employee.getPosition(),
                employee.getBasicWage(), employee.getExperience(), employee.getDayOnMonth(),
                employee.getBonus(), employee.getWage());
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
        System.out.println(getFullName() + " đang họp");
    }

    public void signDocument() {
        System.out.println(getFullName() + " đang ký hợp đồng");
    }

    public void meetPartner() {
        System.out.println(getFullName() + " đang gặp đối tác");
    }


    @Override
    public final void calculateJob() {  //tính công
        //giả sử một tháng làm 26 ngày
        //nếu nhiều hơn 26 ngày thì từ ngày 27 đc thưởng 50% mỗi ngày
    }

    @Override
    public final void receiveBonus() {  //tính thưởng
        //với giám đốc không cần tìm tính theo ngày, chỉ cần số ngày > 26 là được thêm 25% của tháng đó
        if (getDayOnMonth() > 26) {
            setBonus(getBasicWage() * 0.25);
        } else {
            setBonus(0);
        }
    }

    @Override
    public final void receiveSalary() {   //nhận lương
        setWage(getDayOnMonth() * (getBasicWage() / 26) + getBonus());
        System.out.println("Mức lương được nhận của giám đốc: " + getFullName() + " là: " + getWage());
    }



    @Override
    public void eat() {
        System.out.println("Giám đốc đang ăn");
    }

    @Override
    public void sleep() {
        System.out.println("Giám đốc dang ngủ trưa");
    }

    @Override
    public void work(String job) {
        System.out.println("Giám đốc đang làm việc tại phòng riêng");
    }

    @Override
    public void talk() {
        System.out.println("Giám đốc đang nói chuyện với một số nhân viên");
    }

    @Override
    public void relax(String something) {
        System.out.println("Giám đốc đang chơi game với nhân viên");
    }


}
