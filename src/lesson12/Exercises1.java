package lesson12;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

public class Exercises1 {
    public static void main(String[] args) {
        String fileName = "per12.txt";
        int choice = 0;
        ArrayList<Personnel1> Personnels = new ArrayList<>(readFromFile(fileName));
        var previousPer = Personnels.size();
        if (previousPer > 0) {
            setNextId(Personnels.get(previousPer - 1).getId());  //tìm id của nhân viên cuối cùng trong danh sách cho trước
        }
        var input = new Scanner(System.in);
        do {
            out.println("1. Thêm một nhân viên.");
            out.println("2. Thông tin nhân viên.");
            out.println("3. Tìm nhân viên theo tên.");
            out.println("4. Xóa nhân viên.");
            out.println("5. ghi danh sách thông tin nhân viên ra file.");
            out.println("0. Thoát chương trình.");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    out.println("Đã thoát chương trình.");
                    break;
                case 1:
                    var newPerson = createPerson(input);
                    Personnels.add(newPerson);
                    break;
                case 2:
                    showPerson(Personnels);
                    break;
                case 3:
                    if (Personnels.size() > 0) {
                        out.println("Nhập tên cần tìm: ");
                        var name = input.nextLine();
                        var result = searchByName(Personnels, name);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " kết quả cho " + "\"" + name + "\"");
                        } else {
                            out.println("Không có kết quả cho " + "\"" + name + "\"");
                        }
                    } else {
                        out.println("Danh sách nhân viên trống...");
                    }
                    break;
                case 4:
                    if (Personnels.size() > 0) {
                        out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.nextLine();
                        var isSuccess = removeById(id, Personnels);
                        if (isSuccess) {
                            out.println("Xóa thành công " + id);
                        } else {
                            out.println("Xóa không thành công...");
                        }
                    } else {
                        out.println("Danh sách nhân viên rỗng...");
                    }
                    break;
                case 5:
                    if (Personnels.size() > 0) {
                        var isSuccess = writeToFile(fileName, Personnels);
                        if (isSuccess) {
                            out.println("Ghi file thành công.");
                        } else {
                            out.println("Ghi file thất bại...");
                        }
                    } else {
                        out.println("Danh sách nhan viên rỗng...ghi không thành công.");
                    }
                    break;
            }
        } while (choice != 0);
    }

    private static boolean writeToFile(String fileName, ArrayList<Personnel1> personnels) {
        var currentFile = readFromFile(fileName);
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (Personnel1 per : personnels) {
                if (!isExist(currentFile, per)) {  //nếu dữ liệu hiện tại đang trống
                    printWriter.println(per.getId());
                    printWriter.println(per.getFullName());
                    printWriter.println(per.getAddress());
                    printWriter.println(dateFormat.format(per.getDateOfBirth()));
                    printWriter.println(per.getNumberPhone());
                    printWriter.println(per.getWage());
                    printWriter.println(per.getExperience());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean isExist(ArrayList<Personnel1> personnels, Personnel1 per) {
        for (var emp : personnels) {
            if (emp.getId().compareTo(per.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean removeById(String id, ArrayList<Personnel1> personnels) {
        for (int i = 0; i < personnels.size(); i++) {
            if (personnels.get(i).getId().compareTo(id) == 0) {
                personnels.remove(personnels.get(i));
                return true;
            }
        }
        return false;
    }

    private static ArrayList<Personnel1> searchByName(ArrayList<Personnel1> personnels, String name) {
        ArrayList<Personnel1> personName = new ArrayList<>();
        for (var per : personnels) {
            var firstName = getFirstName(per.getFullName());
            if (firstName.compareToIgnoreCase(name) == 0) {
                personName.add(per);
            }
        }
        return personName;
    }


    /**
     * phương thức tách tên ra từ họ và tên
     * @param
     */
    private static String getFirstName(String fullName) {
        int index = fullName.lastIndexOf(" ");
        return fullName.substring(index + 1);
    }

    private static void showPerson(ArrayList<Personnel1> personnels) {
        if (personnels.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            out.printf("%-17s %-20s %-18s %-14s %-18s %-14s %-11s\n",
                    "Mã nhân viên", "Họ và tên", "Địa chỉ", "Ngày sinh", "Số điện thoại", "Mức lương", "Kinh nghiệm\n");
            for (var per : personnels) {
                showInfo(per, dateFormat);
            }
        } else {
            out.println("Danh sách nhân viên rỗng...");
        }

    }

    private static void showInfo(Personnel1 per, SimpleDateFormat dateFormat) {
        out.printf("%-17s %-20s %-18s %-14s %-18s %-14d %-11.1f\n", per.getId(), per.getFullName(), per.getAddress(),
                dateFormat.format(per.getDateOfBirth()), per.getNumberPhone(), per.getWage(), per.getExperience());
    }

    private static Personnel1 createPerson(Scanner input) {
        out.println("Họ và tên: ");
        var fullName = input.nextLine();
        out.println("Địa chỉ: ");
        var address = input.nextLine();
        out.println("Ngày sinh, ví dụ 05/08/2002 : ");
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dayOfBirth = null;
        try {
            dayOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dayOfBirth = new Date();  //nếu nhập sai thì ngày sinh là ngày hiện tại
        }
        out.println("Số điện thoại: ");
        var number = input.nextLine();
        out.println("Mức lương: ");
        var wage = input.nextLong();
        out.println("Kinh nghiệm: ");
        var exp = input.nextFloat();
        Personnel1 personnel1 = new Personnel1(null, fullName, address, dayOfBirth, number, wage, exp);
        return personnel1;
    }

    private static void setNextId(String id) {
        var nextIdStr = id.substring(3);  //tách lấy phần số
        var nextIdInt = Integer.parseInt(nextIdStr);  //chuyển chuỗi số (string) thành một số (int)
        Personnel1.setNextId(nextIdInt + 1);  //tiếp tục số tiếp theo
    }


    private static ArrayList<Personnel1> readFromFile(String fileName) {
        ArrayList<Personnel1> persons = new ArrayList<>();
        var file = new File(fileName);
        var format = "dd//MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var id = input.nextLine();
                var name = input.nextLine();
                var address = input.nextLine();
                var birth = dateFormat.parse(input.nextLine());
                var phoneNumber = input.nextLine();
                var wage = input.nextLong();
                var exp = input.nextFloat();
                Personnel1 personnel1 = new Personnel1(id, name, address, birth, phoneNumber, wage, exp);
                persons.add(personnel1);
            }
            input.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
