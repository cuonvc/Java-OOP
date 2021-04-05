package lesson11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class Exercises2 {

    private static String fileName = "acc2.txt";
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Account> Accounts = new ArrayList<>();
        Accounts.addAll(readFromFile());
        if (Accounts.size() > 0) {
            setNextId(Accounts.get(Accounts.size() - 1).getId());
        }
        var input = new Scanner(System.in);
        do {
            out.println("====================MENU=====================");
            out.println("1. Thêm một tài khoản mới.");
            out.println("2. Hiển thị thông tin tài khoản.");
            out.println("3. Nạp tiền vào tài khoản.");
            out.println("4. Rút tiền khỏi tài khoản.");
            out.println("5. Chuyển từ tài khoản A đến B.");
            out.println("6. Tìm tài khoản theo tên.");
            out.println("7. Tìm tài khoản theo mã.");
            out.println("8. Tìm tài khoản có số dư lớn hơn X.");
            out.println("9. Xóa một tài khoản.");
            out.println("10. Ghi danh sách vào file.");
            out.println("0. Thoát chương trình.");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    out.println("Kết thúc chương trình.");
                    break;
                case 1:
                    var acc = createNewAcc(input);
                    Accounts.add(acc);
                    out.println("-----Thêm tài khoản thành công-----");
                    break;
                case 2:
                    showAcc(Accounts);
                    break;
                case 3:
                    if (Accounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần nạp: ");
                        var id = input.nextLine();
                        out.println("Nhập số tiền cần nạp: ");
                        var amount = input.nextLong();
                        var isSuccess = deposit(id, amount, Accounts);
                        if (isSuccess) {
                            out.println("Nạp thành công " + amount + ".VNĐ vào tài khoản " + id);
                        } else {
                            out.println("Nạp thất bại...");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 4:
                    if (Accounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần rút: ");
                        var id = input.nextLine();
                        out.println("Nhập số tiền cần rút: ");
                        var amount = input.nextLong();
                        var isSuccess = withdraw(id, amount, Accounts);
                        if (isSuccess) {
                            out.println("Rút thành công " + amount + " từ tài khoản " + id);
                        } else {
                            out.println("số tiền không đủ hoặc mã tài khoản không tồn tại...");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 5:
                    out.println("Nhập số tài khoản nguồn: ");
                    var sourceId = input.nextLine();
                    out.println("Nhập tài khoản đích: ");
                    var desId = input.nextLine();
                    out.println("Nhập số tiền: ");
                    var amount = input.nextLong();
                    var isSuccess = transfer(Accounts, sourceId, desId, amount);
                    if (isSuccess) {
                        out.println("Chuyển thành công " + amount + ".VNĐ từ " + sourceId + " đến " + desId);
                    } else {
                        out.println("Tài khoản không tồn tại hoặc số tiền không hợp lệ...");
                    }
                    break;
                case 6:
                    if (Accounts.size() > 0) {
                        out.println("Nhập tên tài khoản cần tìm: ");
                        var name = input.nextLine();
                        var result = searchByName(name, Accounts);
                        if (result.size() > 0) {
                            out.println("Tìm thấy " + result.size() + " kết quả");
                            showAcc(result);
                        } else {
                            out.println("Tài khoản không tồn tại...");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 7:
                    if (Accounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần tìm: ");
                        var id = input.nextLine();
                        var result = searchById(Accounts, id);
                        if (result != null) {
                            out.println("Thông tin tài khoản " + id + ": ");
                            out.printf("%-17s %-17s %-18s %-19s %-10s %-18s %-19s %-12s\n", "Mã tài khoản", "Số tài khoản",
                                    "Tên tài khoản", "Loại tài khoản", "Số dư", "Tên ngân hàng", "Ngày phát hành", "Ngày hết hạn");
                            showInfo(result);
                        }
                    } else {
                        out.println("Danh sách tài khoản trống: ");
                    }
                    break;
                case 8:
                    if (Accounts.size() > 0) {
                        out.println("Nhập số dư định mức: ");
                        var balance = input.nextLong();
                        var result = searchByBalance(balance, Accounts);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + "tài khoản có số dư lớn hơn " + balance);
                            showAcc(result);
                        } else {
                            out.println("Không cótài khoản nào có số dư lớn hơn " + balance);
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 9:
                    if (Accounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần xóa: ");
                        var id = input.nextLine();
                        var isDelete = removeById(id, Accounts);
                        if (isDelete) {
                            out.println("Xóa thành công tài khoản "+ id);
                        } else {
                            out.println("Tài khoản không tồn tại...");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 10:  //ghi dữ liệu vào file
                    if (Accounts.size() > 0) {
                        var successWrite = writeToFile(Accounts);
                        if (successWrite) {
                            out.println("Ghi file thành công...hãy check lại file");
                        } else {
                            out.println("Ghi file không thành công.");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                default:
                    out.println("Vui lòng nhập lựa chọn từ 0-10...");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean writeToFile(ArrayList<Account> accounts) {
        var currentFile = readFromFile();
        try {
            FileWriter write = new FileWriter(fileName, true);
            PrintWriter print = new PrintWriter(write);
            for (int i = 0; i < accounts.size(); i++) {
                var acc = accounts.get(i);
                if (!isExist(currentFile, acc)) {  //nếu dữ liệu (account) cần in ra chưa xuất hiện trong file
                    //thì in ra
                    print.printf("%s - %s - %s - %s - %d - %s - %s - %s\n", acc.getId(), acc.getNumber(), acc.getFullName(),
                            acc.getType(), acc.getBalance(), acc.getBankName(), acc.getFirstDay(), acc.getLastDay());
                }
                print.close();
                write.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức kiểm tra xem những dữ liệu cũ trong file có trùng với dữ liệu mới hay ko
     * @param currentFile danh sách những dữ liệu cũ
     * @param acc một tài khoản là dữ liệu cũ
     * @return trả về true nếu dữ liệu trùng lặp, false nếu dữ liệu ko trùng
     */
    private static boolean isExist(ArrayList<Account> currentFile, Account acc) {
        for (var item : currentFile) {
            if (item.getId().compareTo(acc.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean removeById(String id, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    private static ArrayList<Account> searchByBalance(long balance, ArrayList<Account> accounts) {
        ArrayList<Account> res = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() >= balance) {
                res.add(accounts.get(i));
            }
        }
        return res;
    }

    private static ArrayList<Account> searchByName(String name, ArrayList<Account> accounts) {
        ArrayList<Account> res = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getFullName().toLowerCase().matches(".*" + name + ".*")) {
                res.add(acc);
            }
        }
        return res;
    }

    private static boolean transfer(ArrayList<Account> accounts, String sourceId, String desId, long amount) {
        var srcAcc = searchByNumber(accounts, sourceId);
        var desAcc = searchByNumber(accounts, desId);
        if (srcAcc != null && desAcc != null) {
            return srcAcc.transfers(desAcc, amount);   //line 175 / Account.java
        }
        return false;
    }

    private static Account searchByNumber(ArrayList<Account> accounts, String accNum) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getNumber().compareTo(accNum) == 0) {
                return accounts.get(i);
            }
        }
        return null;
    }


    private static boolean withdraw(String id, long amount, ArrayList<Account> accounts) {
        var acc = searchById(accounts, id);
        if (acc != null) {
            return acc.withdraw(amount);
        }
        return false;
    }

    private static boolean deposit(String id, long amount, ArrayList<Account> accounts) {
        var acc =searchById(accounts, id);
        if (acc != null) {
            return acc.deposit(amount);
        }
        return false;
    }

    private static Account searchById(ArrayList<Account> accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                return accounts.get(i);
            }
        }
        return null;
    }

    private static void showAcc(ArrayList<Account> accounts) {
        if (accounts.size() > 0) {
            out.println("---> Danh sách tài khoản <---");
            out.printf("%-17s %-17s %-18s %-19s %-10s %-18s %-19s %-12s\n", "Mã tài khoản", "Số tài khoản",
                    "Tên tài khoản", "Loại tài khoản", "Số dư", "Tên ngân hàng", "Ngày phát hành", "Ngày hết hạn");
            for (var acc : accounts) {
                showInfo(acc);
            }
        } else {
            out.println("danh sách trống...");
        }
    }

    private static void showInfo(Account acc) {
        out.printf("%-17s %-17s %-18s %-19s %-10d %-18s %-19s %-12s\n",
                acc.getId(), acc.getNumber(), acc.getFullName(), acc.getType(), acc.getBalance(),
                acc.getBankName(), acc.getFirstDay(), acc.getLastDay());
    }

    private static Account createNewAcc(Scanner input) {
        out.println("Số tài khoản: ");
        var number = input.nextLine();
        out.println("Tên tài khoản: ");
        var name = input.nextLine();
        out.println("Loại tài khoản: ");
        var type = input.nextLine();
        out.println("Số dư: ");
        var balance = input.nextLong();
        out.println("Tên ngân hàng: ");
        var bank = input.next();
        out.println("Ngày phát hành: ");
        var first = input.next();
        out.println("Ngày hết hạn: ");
        var last = input.next();
        Account account = new Account(null, number, name, type, balance, bank, first, last);
        return account;
    }

    /**
     * phương thức tự xét id cho từng tài khoản khi thêm mới (id có dạng WAB100001,...)
     * @param id mã tài khoản cuối danh sách
     */
    private static void setNextId(String id) {
        var idStr = id.substring(3);
        var idInt = Integer.parseInt(idStr);
        Account.setNextId(idInt + 1);
    }

    private static ArrayList<Account> readFromFile() {
        ArrayList<Account> Accs = new ArrayList<>();
        File file = new File(fileName);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var info = line.split(" - ");
                var id = info[0];
                var number = info[1];
                var name = info[2];
                var type = info[3];
                var balance = Long.parseLong(info[4]);
                var bankName = info[5];
                var firstDay = info[6];
                var lastDay = info[7];
                var acc = new Account(id, number, name, type, balance, bankName, firstDay, lastDay);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Accs;
    }
}
