package lesson18.Ex4;

import java.util.Date;

public class Manager extends Employee {
//properties
    private long reward;  //mức thưởng
    private Date startTerm;  //ngày bắt đầu lên chức
    private Date endTerm;  //ngày kết thúc nhiệm kì

//constructors

    public Manager(String idCard, String fullName, String address, Date birthday, String email,
                   String phoneNumber, String idEMP, String position, long wage, float experience,
                   long reward, Date startTerm, Date endTerm) {
        super(idCard, fullName, address, birthday, email, phoneNumber, idEMP, position, wage, experience);
        this.reward = reward;
        this.startTerm = startTerm;
        this.endTerm = endTerm;
    }

    /**
     * phương thức này dùng cho phương thức createManager(Run)
     * @param employee thêm mới nhân viên vì manager kế thừ từ employee
     * @param bonus số tiền được thưởng
     * @param start đầu nhiệm kì
     * @param end cuối nhiệm kì
     */
    public Manager(Employee employee, long bonus, Date start, Date end) {
        super(employee.getIdCard(), employee.getFullName(), employee.getAddress(), employee.getBirthday(),
                employee.getEmail(), employee.getPhoneNumber(), employee.getIdEMP(), employee.getPosition(),
                employee.getWage(), employee.getExperience());
        this.reward = bonus;
        this.startTerm = start;
        this.endTerm = end;
    }

//getter and setter

    public long getReward() {
        return reward;
    }

    public void setReward(long reward) {
        this.reward = reward;
    }

    public Date getStartTerm() {
        return startTerm;
    }

    public void setStartTerm(Date startTerm) {
        this.startTerm = startTerm;
    }

    public Date getEndTerm() {
        return endTerm;
    }

    public void setEndTerm(Date endTerm) {
        this.endTerm = endTerm;
    }


    public void meeting() {
        System.out.println(getFullName() + " đang họp ");
    }
    public void signDocument() {
        System.out.println(getFullName() + " đang ký");
    }
    public void meetPartner() {
        System.out.println(getFullName() + " đang gặp gỡ đối tác");
    }
}
