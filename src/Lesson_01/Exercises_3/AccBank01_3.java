import java.util.Scanner;
public class AccBank27_3 {
    public static void main(String[] args) {
        AccBankSP27_3 acc = new AccBankSP27_3();
        var input = new Scanner(System.in);

        System.out.println("Nhập số tài khoản của bạn: ");
        acc.numberAcc = input.nextLine();

        System.out.println("Nhập tên tài khoản: ");
        acc.nameAcc = input.nextLine();

        System.out.println("Nhập số tiền muốn nạp: ");
        acc.deposit(input.nextLong());

        System.out.println("Nhập số tiền muốn rút: ");
        var amount = input.nextLong();
        if (acc.withdraw(amount)) {
            System.out.println("Đã rút: " + amount);
            acc.pay("điện", 300000);
            acc.checkBalance();
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch...");
        }


    }
}
