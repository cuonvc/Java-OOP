import java.util.Scanner;

public class AccBank03_3 {
    public static void main(String[] args) {
        AccBankSP03_3 account = new AccBankSP03_3();
        var input = new Scanner(System.in);

        //nhập thông tin tài khoản
        System.out.println("Nhập số tài khoản của bạn: ");
        var accNumber = input.nextLine();
        account.setNumber(accNumber);

        System.out.println("Nhập tên tài khoản: ");
        var accName = input.nextLine();
        account.setName(accName);

        System.out.println("Nhập số tiền muốn gửi: ");
        account.add(input.nextLong());

        System.out.println("Nhập số tiền muốn rút: ");
        var amount = input.nextLong();
        if (account.withdraw(amount)) {
            System.out.println("Rút thành công: " + amount);
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch");
        }

        //lấy thông tin tài khoản
        System.out.println("Số tài khoản: " + account.getNumber());
        System.out.println("Tên tài khoản: " + account.getName());
        System.out.println("Số dư của bạn là: " + account.getBalance());


    }
}
