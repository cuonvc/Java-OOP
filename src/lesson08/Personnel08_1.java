package lesson08;

import java.util.ArrayList;
import java.util.Scanner;

public class Personnel08_1 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<PersonnelSP08_1> personnels = new ArrayList<>();
        var input = new Scanner(System.in);
        do {
            System.out.println("------------------------------");
            System.out.println("1. Thêm một nhân viên");
            System.out.println("2. Hiển thị thông tin toàn bộ nhân viên");
            System.out.println("3. Tìm kiếm tên nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("0. Exit");
            System.out.println("===============================");
            System.out.println("Chọn chức năng: ");
            choice = input.nextInt();
            input.nextLine(); //đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    var addPer = addPerson(input);
                    personnels.add(addPer);  //Thêm thông tin nhân viên vừa nhập vào ArrayList
                    break;
                case 2:
                    showPerson(personnels);
                    break;
                case 3:
                    if (personnels.size() > 0) {
                        System.out.println("Nhập tên nhân viên cần tìm: ");
                        var name = input.next();
                        var result = searchPerson(personnels, name);
                        if (result.size() > 0) {
                            System.out.println("---> Có " + result.size() + " người tên \"" + name + "\"");
                        } else {
                            System.out.println("Không có người nào tên \"" + name + "\"");
                        }
                    }
                    break;
                case 4:
                    if (personnels.size() > 0) {
                        System.out.println("Nhập mã nhân viên cần xóa: ");
                        var idMove = input.nextLine();
                        var isDelete = removePer(personnels, idMove);
                        if (isDelete) {
                            System.out.println("---> Xóa thành công <---");
                        } else {
                            System.out.println("---> Mã không hợp lệ <---");
                        }
                    } else {
                        System.out.println("---> Danh sách rỗng <---");
                    }
                    break;
                default:
                    System.out.println("Sai chức năng, vui lòng nhập lại...");

            }
        } while (choice != 0);
    }

    /**
     * phương thức xóa bỏ nhân viên khỏi danh sách
     * @param personnels danh sách nhân viên
     * @param idMove mã nhân viên cần xóa
     * @return true nếu xóa thành công, ngược lại là false
     */
    private static boolean removePer(ArrayList<PersonnelSP08_1> personnels, String idMove) {
        for (int i = 0; i <= personnels.size() - 1; i++) {
            if (personnels.get(i).getId().compareTo(idMove) == 0) {
                personnels.remove(i);  //xóa bỏ nhân viên khỏi danh sách
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm nhân viên theo tên nhập vào
     * @param personnels ArrayList chứa tất cả cá sinh viên
     * @param name tên nhân viên cần tìm
     * @return trả về danh sách kết quả tìm kiếm
     */
    private static ArrayList<PersonnelSP08_1> searchPerson(ArrayList<PersonnelSP08_1> personnels, String name) {
        ArrayList<PersonnelSP08_1> res = new ArrayList<>();
        for (var person : personnels) {
            var firstName = getFirstName(person.getFullName());
            //so sánh nếu tên trùng nhau thì
            if (firstName.compareToIgnoreCase(name) == 0) {
                res.add(person);
            }
        }
        return res;
    }

    /**
     * phương thức trích xuất tên từ họ và tên
     * @param fullName họ và tên
     * @return trả về tên (ko có họ)
     */
    private static String getFirstName(String fullName) {
        int index = fullName.lastIndexOf(" ");  //tìm vị trí dấu tab cuối cùng
        return fullName.substring(index + 1);  //trích xuất tên
    }

    /**
     * phương thức hiển thị danh sách nhân viên
     * @param personnels
     */
    private static void showPerson(ArrayList<PersonnelSP08_1> personnels) {
        if (personnels.size() > 0) {
            System.out.println("Bảng thông tin nhân viên: ");
            System.out.printf("%-18s %-20s %-14s %-10s %-20s %-16s %-18s\n",
                    "Mã nhân viên", "Họ và tên", "Địa chỉ", "Tuổi",
                    "Số điện thoại", "Mức lương", "Số năm kinh nghiệm");
            for (var per : personnels) {
                showInfo(per);
            }
        } else {
            System.out.println("Danh sách rỗng...");
        }

    }

    /**
     * phương thức hiển thị thông tin của từng nhân viên
     * phương thức này là tập con được sinh ra bởi showPerson
     * @param per nhân viên đã đc hiển thị
     */
    private static void showInfo(PersonnelSP08_1 per) {
        System.out.printf("%-18s %-20s %-14s %-10d %-20s %-16d %-18d\n",
                per.getId(), per.getFullName(), per.getAddress(), per.getAge(), per.getPhoneNumber(),
                per.getWages(), per.getExpYear());
    }


    /**
     * phương thức thêm một nhân viên với các thông tin cụ thể
     * @param input đối tượng của Scanner
     * @return trả về thông tin của một nhân viên
     */
    private static PersonnelSP08_1 addPerson(Scanner input) {
        System.out.print("Mã nhân viên: ");
        var id = input.nextLine();
        System.out.print("Họ và Tên: ");
        var name = input.nextLine();
        System.out.print("Địa chỉ: ");
        var address = input.nextLine();
        System.out.print("Số điện thoại: ");
        var number = input.nextLine();
        System.out.print("Tuổi: ");
        var age = input.nextInt();
        System.out.print("Mức lương: ");
        var wage = input.nextLong();
        System.out.print("Số năm kinh nghiệm: ");
        var exp = input.nextInt();

        PersonnelSP08_1 pers = new PersonnelSP08_1(id, name, address, number, age, wage, exp);
        return pers;
    }
}
