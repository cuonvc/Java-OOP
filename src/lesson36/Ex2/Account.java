package lesson36.Ex2;

public class Account {
    private String cardBankId;
    private String accountId;
    private String fullName;
    private long balance;


    public Account() {
    }

    public Account(String cardBankId, String accountId, String fullName, long balance) {
        this.cardBankId = cardBankId;
        this.accountId = accountId;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getCardBankId() {
        return cardBankId;
    }

    public void setCardBankId(String cardBankId) {
        this.cardBankId = cardBankId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


    /**
     * rút tiền
     * @param amount
     */
    public void withdraw(long amount) throws InvalidAmountException {
        if (amount >= 0 && amount < balance) {
            balance -= amount;
            System.out.println("Rút thành công " + amount + ".VNĐ");
        } else {
            String msg = "Giao dịch không thành công";
            throw new InvalidAmountException(msg, amount);
        }
    }

    /**
     * nạp tiền
     * @param amount
     * @throws InvalidAmountException
     */
    public void deposit(long amount) throws InvalidAmountException {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Nạp thành công " + amount + ".VNĐ");
        } else {
            String msg = "Giao dịch không thành công";
            throw new InvalidAmountException(msg, amount);
        }
    }

    /**
     * chuyển tiền
     * @param accDestination
     * @param amount
     */
    public void transfers(Account accDestination, long amount) throws
            InvalidAmountException {
        if (accDestination != null && amount >= 0 && amount < balance) {
            balance -= amount;
            System.out.println("Chuyển thành công " + amount
                    + ".VNĐ đến tài khoản " + accDestination.getAccountId());
        } else {
            String msg = "Giao dịch không thành công";
            throw new InvalidAmountException(msg, amount);
        }
    }

    /**
     * thanh toán hóa đơn
     * @param service tên dịch vụ
     * @param amount số tiền thanh toán
     * @throws InvalidAmountException
     */
    public void payBills(String service, long amount) throws
            InvalidAmountException {
        if (service != null && amount >= 0 && amount < balance) {
            balance -= amount;
            System.out.println("Thanh toán thành công "
                    + amount + " tiền " + service);
        } else {
            String msg = "Giao dịch không thành công";
            throw new InvalidAmountException(msg, amount);
        }
    }

}
