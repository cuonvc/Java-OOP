package lesson25.Ex5;

import java.util.Date;

public class Manager extends Employee{
    private Date startTerm;  //băt đầu nhiệm kỳ
    private Date endTerm;  //kết thúc nhiệm kỳ


    public Manager(String idEmp, String position, float basicWages, float experience,
                   int dayInTheMonth, float bonus, float receiveWages, Date startTerm, Date endTerm) {
        super(idEmp, position, basicWages, experience, dayInTheMonth, bonus, receiveWages);
        this.startTerm = startTerm;
        this.endTerm = endTerm;
    }

    public Manager(String idCard, String fullName, String address, Date dayOfBirth,
                   String email, String phoneNumber, String idEmp, String position,
                   float basicWages, float experience, int dayInTheMonth, float bonus,
                   float receiveWages, Date startTerm, Date endTerm) {
        super(idCard, fullName, address, dayOfBirth, email, phoneNumber, idEmp, position,
                basicWages, experience, dayInTheMonth, bonus, receiveWages);
        this.startTerm = startTerm;
        this.endTerm = endTerm;
    }

    /**
     * phương thức support cho CreateMng
     * @param employee
     * @param start
     * @param end
     */
    public Manager(Employee employee, Date start, Date end) {
        super(employee.getIdCard(), employee.getFullName(), employee.getAddress(), employee.getDayOfBirth(),
                employee.getEmail(), employee.getPhoneNumber(), employee.getIdEmp(), employee.getPosition(),
                employee.getBasicWages(), employee.getExperience(), employee.getDayInTheMonth(), employee.getBonus(),
                employee.getReceiveWages());
        startTerm = start;
        endTerm = end;
    }


    public final Date getStartTerm() {
        return startTerm;
    }

    public final void setStartTerm(Date startTerm) {
        this.startTerm = startTerm;
    }

    public final Date getEndTerm() {
        return endTerm;
    }

    public final void setEndTerm(Date endTerm) {
        this.endTerm = endTerm;
    }



//các hành động
    @Override
    public void work(String job) {
        System.out.println("Giám đốc " + getFullName() + " đang làm " + job);
    }

    @Override
    public void eat(String food) {
        System.out.println("Giám đốc " + getFullName() + " đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Giám đốc " + getFullName() + " đang ngủ");
    }

    @Override
    public void talk() {
        System.out.println("Giám đốc " + getFullName() + " đang nói chuyện điện thoại");
    }

    @Override
    public void relax() {
        System.out.println("Giám đốc " + getFullName() + " đang đi đánh gold");
    }

    @Override
    public void calcularReceiveWage() {  //tính tổng lương thực nhận
        super.calcularReceiveWage();  //vì cách tính tương thực nhận của giám đốc và nv là như nhau nên chỉ cần override lại là xong
    }

    //    @Override
//    public void receiveWage() {    //nhận lương
//        System.out.println("Giám đốc " + getFullName() + " được nhận " + getReceiveWages() + ".VNĐ lương tháng này");
//    }

    @Override
    public void calcularBonus() {   //tính thưởng
        if (getDayInTheMonth() >= 22) {
            setBonus(getReceiveWages() * 0.25f);
        } else {
            setBonus(0);
        }
    }

    @Override
    public void receiveBonus() {   //nhận lương
        System.out.println("Giám đốc " + getFullName() + " đã nhận " + getReceiveWages() + ".VNĐ thưởng tháng này");
    }

    @Override
    public void travel(String where) {
        System.out.println("Giám đốc " + getFullName() + " đang đi chơi với đối tác ở " + where);
    }

    public void meeting() {
        System.out.println("Giám đốc đang họp HĐQT");
    }

    public void signDocument() {
        System.out.println("Giám đốc đang ký văn bản");
    }

    public void meetPartner() {
        System.out.println("Giám đốc đang đi gặp gỡ đối tác");
    }
}
