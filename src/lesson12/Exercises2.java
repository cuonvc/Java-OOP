package lesson12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.*;

public class Exercises2 {
    private static String fileName = "acc12.txt";
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Account2> BankAccounts = new ArrayList<>();
        BankAccounts.addAll(readFromFile());
        if (BankAccounts.size() > 0) {
            nextId(BankAccounts.get(BankAccounts.size() - 1).getId());  //id thằng cuối
        }
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        var input = new Scanner(in);
        do {
            out.println("=========Nhập lựa chọn==========");
            out.println("1. Thêm một tài khoản.");
            out.println("2. Hiển thị thông tin tài khoản.");
            out.println("3. Nạp tiền vào tài khoản.");
            out.println("4. Rút tiền khỏi tài khoản.");
            out.println("5. Chuyển tiền.");
            out.println("6. Tìm tài khoản theo tên.");
            out.println("7. Tìm tài khoản theo mã tài khoản.");
            out.println("8. Tìm tài khoản có số dư lớn hơn số dư định mức.");
            out.println("9. Xóa tài khoản.");
            out.println("10. Ghi nội dung thông tin từng tài khoản vào file.");
            out.println("0, Thoát chương trình.");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    out.println("Đã thoát chương trình.");
                    break;
                case 1:
                    var newAcc = createAcc(input);
                    BankAccounts.add(newAcc);
                    out.println("Thêm thành công...");
                    break;
                case 2:
                    showAcc(BankAccounts);
                    break;
                case 3:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần nạp: ");
                        var id = input.nextLine();
                        out.println("Nhập số tiền cần nạp: ");
                        var amount = input.nextLong();
                        var isSuccess = deposit(id, amount, BankAccounts);
                        if (isSuccess) {
                            out.println("Nạp thành công " + amount + " vào tài khoản " + id);
                            out.println("Ngày giao dịch: " + dateFormat.format(new Date()));
                        } else {
                            out.println("Giao dịch thất bại, hãy thử lại...");
                        }
                    } else {
                        out.println("Danh sách trống...");
                    }
                    break;
                case 4:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập mã tài khoản: ");
                        var id = input.nextLine();
                        out.println("Số tiền cần rút: ");
                        var amount = input.nextLong();
                        var isSuccess = withdraw(id, amount, BankAccounts);
                        if (isSuccess) {
                            out.println("Rút thành công " + amount + " từ tài khoản " + id);
                            out.println("Ngày giao dịch: " + dateFormat.format(new Date()));
                        } else {
                            out.println("Giao dịch thất bại, hãy thử lại...");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 5:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập mã tài khoản nguồn: ");
                        var startAccId = input.nextLine();
                        out.println("Nhập mã tài khoản đích: ");
                        var desAccId = input.nextLine();
                        out.println("Nhập số tiền muốn chuyển: ");
                        var amount = input.nextLong();
                        var isSuccess = Banktranfer(startAccId, desAccId, amount, BankAccounts);
                        if (isSuccess) {
                            out.println("Chuyển thành công " + amount + " từ tài khoản " + startAccId
                                    + " đến tài khoản " + desAccId);
                            out.println("Ngày giao dich: " +dateFormat.format(new Date()));
                        } else {
                            out.println("Giao dịch thất bại...hãy thử lại.");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 6:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập tên cần tìm: ");
                        var fullName = input.nextLine();
                        var result = searchByName(fullName, BankAccounts);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " kết quả cho \"" + fullName + "\"");
                            showAcc(result);
                        } else {
                            out.println("Không có kết quả cho \"" + fullName + "\"");
                        }
                    } else {
                        out.println("Dah sách tài khoản trống...");
                    }
                    break;
                case 7:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần tìm: ");
                        var id = input.nextLine();
                        var result = searchById(id, BankAccounts);
                        if (result.size() > 0) {   //gọi là lớn hơn 0 nhưng thực ra chỉ có 0 hoặc 1
                            out.println("Tìm thấy tài khoản " + id);
                            showAcc(result);
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 8:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập số dư định mức: ");
                        var isBalance = input.nextLong();
                        var result = searchByBalance(isBalance, BankAccounts);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " tài khoản có số dư > " + isBalance);
                            showAcc(result);
                        } else {
                            out.println("Không có tài khoản nào có số dư > " + isBalance);
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                case 9:
                    if (BankAccounts.size() > 0) {
                        out.println("Nhập mã tài khoản cần xóa: ");
                        var id = input.nextLine();
                        var isDelete = removeById(id, BankAccounts);
                        if (isDelete) {
                            out.println("Xóa thành công tài khoản " + id);
                        } else {
                            out.println("Thao tác lỗi...hãy thử lại.");
                        }
                    } else {
                        out.println("Danh sách trống...");
                    }
                    break;
                case 10:  //ghi danh sách account vào file
                    if (BankAccounts.size() > 0) {
                        var isSuccess = writeToFile(BankAccounts);
                        if (isSuccess) {
                            out.println("Ghi file thành công.");
                        } else {
                            out.println("Ghi file thất bại...vui lòng thử lại");
                        }
                    } else {
                        out.println("Danh sách tài khoản trống...");
                    }
                    break;
                default:
                    out.println("Giá trị không hợp lệ, vui lòng chọn từ 0-10...");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * phương thức dùng để lưu thông tin của dữ liệu từ bộ nhớ đệm vào file
     * @param bankAccounts danh sách các tài khoản (thông tin dữ liệu)
     * @return trả về true nếu ghi file thành công và false ngược lại
     */
    private static boolean writeToFile(ArrayList<Account2> bankAccounts) {
        var currentFile = readFromFile();
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);  //ghi file
            PrintWriter printWriter = new PrintWriter(fileWriter);   //in ra cho người dùng thấy
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (int i = 0; i < bankAccounts.size(); i++) {
                var acc = bankAccounts.get(i);
                if (!isExist(currentFile, acc)) {  // <=> false
                    printWriter.printf("%s-%s-%s-%s-%d-%s-%s-%s\n", acc.getId(),
                            acc.getNumberAcc(), acc.getFullName(), acc.getType(), acc.getBalance(), acc.getBank(),
                            dateFormat.format(acc.getFirstDay()),
                            dateFormat.format(acc.getLastDay()));
                }
                printWriter.close();
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức kiểm tra xem những thứ cần ghi vào file đã tồn tại hay chưa
     * thực chất là kiểm tra xem id có bị trùng hay ko
     * @param currentFile những dữ liệu (đối tượng) đã có sẵn trong file
     * @param acc một tài khoản (đối tượng) cần kiểm tra
     * @return trả về true nếu đối tượng đã tồn tại, false nếu chưa tồn tại
     */
    private static boolean isExist(ArrayList<Account2> currentFile, Account2 acc) {
        for (int i = 0; i < currentFile.size(); i++) {
            if (currentFile.get(i).getId().compareTo(acc.getId()) == 0) {
                return true;  //đã tồn tại
            }
        }
        return false;  //chưua tồn tại, được phép in ra
    }

    /**
     * phương thức xóa một tài khoản bằng id
     * @param id mã tài khoản cần xóa
     * @param bankAccounts danh sách tài khoản
     * @return trả về true nếu xóa thành công và false nếu xóa thất bại
     */
    private static boolean removeById(String id, ArrayList<Account2> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getId().compareTo(id) == 0) {
                bankAccounts.remove(bankAccounts.get(i));
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm những tài khoản có số dư lớn hơn số dư định mức
     * @param isBalance số dư định mức
     * @param bankAccounts danh sách tài khoản có sẵn
     * @return trả về danh sách mới gồm những tài khoản có số dư  > số dư định mức
     */
    private static ArrayList<Account2> searchByBalance(long isBalance, ArrayList<Account2> bankAccounts) {
        ArrayList<Account2> res = new ArrayList<>();
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getBalance() > isBalance) {
                res.add(bankAccounts.get(i));
            }
        }
        return res;
    }

    /**
     * phương thức tìm tài khoản bằng id
     * @param id mã cần tìm
     * @param bankAccounts danh sách tài khoản
     * @return trả về danh sách tài khoản có mã cần tìm (ở đây list chỉ có 1 tài khoản vì mỗi acc có một mã riêng
     */
    private static ArrayList<Account2> searchById(String id, ArrayList<Account2> bankAccounts) {
        ArrayList<Account2> res = new ArrayList<>();
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getId().compareTo(id) == 0) {
                res.add(bankAccounts.get(i));
            }
        }
        return res;
    }


    /**
     * phương thức tìm tài khoản theo tên
     * @param fullName tên cần tìm
     * @param bankAccounts danh sách tài khoản hiện có
     * @return
     */
    private static ArrayList<Account2> searchByName(String fullName, ArrayList<Account2> bankAccounts) {
        ArrayList<Account2> accByName = new ArrayList<>();
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getFullName().compareToIgnoreCase(fullName) == 0) {
               accByName.add(bankAccounts.get(i));
            }
        }
        return accByName;
    }

    /**
     * phương thức chuyểntừ tài khoản nguồn tới tài khoản đích
     * @param startAccId tài khoản nguồn
     * @param desAccId tài khoản đích
     * @param amount số tiền
     * @param bankAccounts danh sách tài khoản hiện có
     * @return true hoặc false nếu thành công hoặc ko thành công
     */
    private static boolean Banktranfer(String startAccId, String desAccId, long amount, ArrayList<Account2> bankAccounts) {
        var startAcc = searchByAccId(startAccId, bankAccounts);
        var desAcc = searchByAccId(desAccId, bankAccounts);
        if (startAcc != null && desAcc != null) {   //nếu tài khoản đích và nguồn cùng tồn tại thì
            return startAcc.transfer(desAcc, amount);
        }
        return false;
    }

    /**
     * phương thức tìm kiếm tài khoản theo số tài khoản nhập vào
     * @param AccId mã tài khoản cần tìm ( cả start và des )
     * @param bankAccounts danh sách tài khoản
     * @return
     */
    private static Account2 searchByAccId(String AccId, ArrayList<Account2> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getId().compareTo(AccId) == 0) {
                return bankAccounts.get(i);
            }
        }
        return null;
    }


    /**
     * phương thức rút tiền khỏi tài khoản
     * @param id
     * @param amount
     * @param bankAccounts danh sách tất cả tài khoản
     * @return trả về true nếu rút thành công và false nếu thất bại
     */
    private static boolean withdraw(String id, long amount, ArrayList<Account2> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getId().compareTo(id) == 0) {
                bankAccounts.get(i).withdraw(amount);
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức nạp tiền vào tài khoản
     * @param id mã tài khoản cần nạp
     * @param amount só tiền cần nạp
     * @param bankAccounts danh sách các tài khoản
     * @return trả về true nếu nạp thành công và false nếu ko thnahf công
     */
    private static boolean deposit(String id, long amount, ArrayList<Account2> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getId().compareTo(id) == 0) {
                bankAccounts.get(i).deposit(amount);
                return true;
            }
        }
        return false;
    }


    /**
     * phương thức hiển thị danh sách các tài khoản
     * @param bankAccounts danh sách các ttài khoản
     */
    private static void showAcc(ArrayList<Account2> bankAccounts) {
        if (bankAccounts.size() > 0) {
            out.println("----------> Danh sách tài khoản <--------");
            out.printf("%-17s %-19s %-24s %-19s %-14s %-14s %-19s %-15s\n", "Mã tài khoản", "Số tài khoản",
                    "Tên tài khoản", "Loại tài khoản", "Số dư", "Ngân hàng", "Ngày phát hành", "Ngày hết hạn");
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (var acc : bankAccounts) {
                showInfo(acc, dateFormat);
            }
        } else {
            out.println("Danh sách tài khoản trống...");
        }

    }

    /**
     * phương thức hiển thị thông tin từng tài khoản
     * @param acc tài khoản cần hiển thị
     * @param dateFormat định dạng hiển thị thời gian
     */
    private static void showInfo(Account2 acc, SimpleDateFormat dateFormat) {
        out.printf("%-17s %-19s %-24s %-19s %-14d %-14s %-19s %-15s\n", acc.getId(), acc.getNumberAcc(),
                acc.getFullName(), acc.getType(), acc.getBalance(), acc.getBank(),
                dateFormat.format(acc.getFirstDay()), dateFormat.format(acc.getLastDay()));
    }


    /**
     * phương thức thêm mới một tài khoản
     * @param input đối tượng của Scanner
     * @return
     */
    private static Account2 createAcc(Scanner input) {
        out.println("Số tài khoản: ");
        var number = input.nextLine();
        out.println("Tên taà khoản: ");
        var name = input.nextLine();
        out.println("Loại tài khoản: ");
        var type = input.nextLine();
        out.println("Số dư: ");
        var balance = input.nextLong();
        input.nextLine();
        out.println("Ngân hàng: ");
        var bankName = input.nextLine();
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        out.println("Ngày phát hành: (ví dụ 05/08/2002) ");
        Date firstDay = null;
        try {
             firstDay = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        out.println("Ngày hết hạn: (ví dụ 05/08/2022) ");
        Date lastDay = null;
        try {
            lastDay = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Account2 account2 = new Account2(null, number, name, type, balance, bankName, firstDay, lastDay);
        return account2;
    }

    private static void nextId(String id) {
        var idStr = id.substring(3); //tách lấy phần số
        var idInt = Integer.parseInt(idStr);
        Account2.setNextId(idInt + 1);  //thiết lập mã tiếp theo
    }

    private static ArrayList<Account2> readFromFile() {
        ArrayList<Account2> Accounts = new ArrayList<>();
        var file = new File(fileName);  //chuẩn bị để tạo file
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();  //file được tạo ra
            var input = new Scanner(file);  //in dữ liệu ra file
            while (input.hasNextLine()) {
                var line = input.nextLine(); //chuẩn bị 1 dòng để hiển thị thông tin tài khoản
                var info = line.split(" - "); //các thông tin cách nhau bởi một dấu gạch
                var id = info[0];
                var numberAcc = info[1];
                var fullName = info[2];
                var type = info[3];
                var balance = Long.parseLong(info[4]);
                var bank = info[5];
                var fistDay = dateFormat.parse(info[6]);
                var lastDay = dateFormat.parse(info[7]);
                var acc = new Account2(id, numberAcc, fullName, type, balance, bank, fistDay, lastDay);
                Accounts.add(acc);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return Accounts;
    }
}
