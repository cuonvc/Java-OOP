package lesson01;

public class AccBankSP01_3 {
    //properties (các thuộc tính)
    public String numberAcc;
    public String nameAcc;
    public String typeAcc;
    public long balance;
    public String bank;
    public String firstDay;
    public String lastDay;



    //constructor (khởi tạo);
    public AccBankSP01_3() {
        numberAcc = "";
        nameAcc = "";
        typeAcc = "";
        balance = 0;
        bank = "";
        firstDay = "";
        lastDay = "";
    }



    //methods (các hành động)

    /**
     * phương thức nạp tiền vào tài khoản
     * @param amount số lượng tiền cần nạp
     * @return true nếu nạp tiền thành công, false nếu nạp ko thành công
     */
    public boolean deposit(long amount) {
        if (amount > 0) {
           balance += amount;
            return true;
        }
        return false;
    }

    /**
     * phương thức rút tiền khỏi tài khoản
     * @param amount số tiền muốn rút
     * @return true nếu rút thành công, false nếu ko rút thành công
     */
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * phương thức kiểm tra số dư
     */
    public void checkBalance() {
        System.out.println("Số dư của bạn: " + balance + " VNĐ");
    }

    /**
     * phương thức thanh toán các dịch vụ khác
     * @param amount số tiền thanh toán
     * @param service tên dịch vụ
     * @return true nếu thanh toán thành công, false nếu thanh toán thất bại
     */
    public boolean pay(String service, long amount) {
        if (amount > 0 && amount < balance && !service.isEmpty()) {
            balance -= amount;
            System.out.println("Tiền " + service + " cần phải trả: " + amount);
            return true;
        }
        return false;
    }

}
