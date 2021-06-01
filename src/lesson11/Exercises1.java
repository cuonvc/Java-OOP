package lesson11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
public class Exercises1 {
    public static void main(String[] args) {
        String fileName = "per11.txt";  //thực chất đây vãn chỉ là String chứ chưa có tác động đến file
        int choice = 0;
        ArrayList<Personnel> Personnels = new ArrayList<>();
        Personnels.addAll(readFromFile(fileName));
        //nếu trước đó đã có một số nhân viên rồi thì set id cho họ trước rồi mới thực hiện nhập nhân viên mới
        if (Personnels.size() > 0) {
            setNextId(Personnels.get(Personnels.size() - 1).getPersonId());
        }
        var input = new Scanner(System.in);
        do {
            out.println("===============MENU==================");
            out.println("1. Thêm mới một nhân viên.");
            out.println("2. Hiển thị thông tin nhân viên.");
            out.println("3. Tìm nhân viên theo tên.");
            out.println("4. Xóa nhân viên theo mã cho trước.");
            out.println("5. Ghi danh sách nhân viên vào file.");
            out.println("0. Thoát chương trình");
            out.println("=========> Nhập lựa chọn <==========");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:  //kết thúc chương trình
                    out.println("-----------Đã thoát chương trình------------");
                    break;
                case 1:  //nhập thông tin cho nhân viên
                    var per = createNewPersonnel(input);
                    Personnels.add(per);
                    break;
                case 2:  //hiển thị thông tin theo dạng bảng
                    showResult(Personnels);
                    break;
                case 3:  //tìm nhân viên theo tên (tên ko họ)
                    if (Personnels.size() > 0) {
                        out.println("Nhập tên nhân viên cần tìm: ");
                        var name = input.next();
                        var result = searchByName(name, Personnels);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " nhân viên tên " + name);
                        } else {
                            out.println("Không có nhân viên nào tên " + name);
                        }
                    } else {
                        out.println("Danh sách nhân viên trống...");
                    }
                    break;
                case 4: //xóa nhân viên bằng mã
                    if (Personnels.size() > 0) {
                        out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.next();
                        var removeId = DeleteById(id, Personnels);
                        if (removeId) {
                            out.println("Xóa thành công ");
                        } else {
                            out.println("Mã nhân viên không tồn tại...");
                        }
                    } else {
                        out.println("Danh sách nhân viên trống...");
                    }
                    break;
                case 5: //Ghi danh sách nhân viên vào file personnel.txt và bào toàn dữ liệu cũ
                    if (Personnels.size() > 0) {
                        var isSuccess = writeToFile(fileName, Personnels);
                        if (isSuccess) {
                            out.println("Ghi thành công, hãy check lại file.");
                        } else {
                            out.println("Đã xảy ra lỗi...Ghi không thành công.");
                        }
                    } else {
                        out.println("Danh sách nhân viên rỗng...");
                    }
                    break;
                default:
                    out.println("Vui lòng chọn giá trị từ 0-5...");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * Phương thức ghi dữ liệu vào file. không ghi những dữ liệu bị trùng
     * @param fileName tên file
     * @param personnels danh sách nhân viên cần ghi vào file
     * @return trả về true nếu ghi thành công và ngược lại là false
     */
    private static boolean writeToFile(String fileName, ArrayList<Personnel> personnels) {
            var currentFile = readFromFile(fileName);
        try {
            FileWriter ghiFile = new FileWriter(fileName, true);  //ghi dữ liệu vào file
            PrintWriter inFile = new PrintWriter(ghiFile);   //hiển thị ra cho người dùng
            for (int i = 0; i < personnels.size(); i++) {
                var per = personnels.get(i);
                if (!isExist(currentFile, per)) { //nếu dữ liệu từng nhân viên ko bị trùng với dữ liệu cũ
                    //thì in ra
                    inFile.println(per.getPersonId());
                    inFile.println(per.getFullName());
                    inFile.println(per.getAddress());
                    inFile.println(per.getNumberPhone());
                    inFile.println(per.getAge());
                    inFile.println(per.getExperience());
                    inFile.println(per.getWage());
                }
            }
            ghiFile.close();
            inFile.close();

        } catch (IOException e) {
            e.printStackTrace();

            return false;
        }
        return true;
    }

    /**
     * phương thức kiểm tra xem dữ liệu trong file đã tồn tại trước đó hay chưa
     * @param personnels dữ liệu có sẵn trong file (chính là danh sách Personnels)
     * @param per đối tượng cần kiểm tra xem đã tồn tại hay chưa
     * @return trả về true hoặc false nếu đã hoặc chưa tồn tại
     */
    private static boolean isExist(ArrayList<Personnel> personnels, Personnel per) {
        for (var item : personnels) {
            if (per.getPersonId().compareTo(item.getPersonId()) == 0) {
                return true;
            }
        }
        return false;
    }


    /**
     * phương thức tìm kiếm id trùng với id cần xóa
     * @param id mã cần xóa
     * @param personnels danh sách tất cả nhân viên
     * @return trả về true nếu tồn tại và false nếu ko tồn tại id
     */
    private static boolean DeleteById(String id, ArrayList<Personnel> personnels) {
        for (var per : personnels) {
            if (id.compareTo(per.getPersonId()) == 0) {
                personnels.remove(per);
                return true;
            }
        }
        return false;
    }


    /**
     * phương thức tìm nhân viên bằng tên
     * @param name tên cần tìm
     * @param personnels danh sách chứa tất cả nhân viên
     * @return trả về danh sách những nhân viên có tên trùng với tên cần tìm
     */
    private static ArrayList<Personnel> searchByName(String name, ArrayList<Personnel> personnels) {
        ArrayList<Personnel> res = new ArrayList<>();
        for (var per : personnels) {
            var firstName = getFirstName(per.getFullName());
            if (firstName.compareToIgnoreCase(name) == 0) {
                res.add(per);
            }
        }
        return res;
    }

    /**
     * phương thức tách lấy tên trong họ và tên
     * @param fullName cả họ và tên gốc
     * @return trả về tên ko có họ và đệm
     */
    private static String getFirstName(String fullName) {
        int index = fullName.lastIndexOf(" ");
        return fullName.substring(index + 1);
    }

    /**
     * phương thức hiển thị từng nhân viên
     * @param personnels danh sách các nhân viên
     */
    private static void showResult(ArrayList<Personnel> personnels) {
        if (personnels.size() > 0) {
            out.printf("%-17s %-18s %-9s %-12s %-18s %-14s %-11s\n", "Mã nhân viên", "Họ và tên", "Tuổi", "Địa chỉ",
                    "Số điện thoại", "Mức lương", "Kinh nghiệm");
            for (var per : personnels) {
                showPerson(per);
            }
        } else {
            out.println("-------Danh sách nhân viên rỗng--------");
        }
    }

    /**
     * phương thức hiển thị thông tin của từng nhân viên
     * @param per nhân viên cần hiển thị
     */
    private static void showPerson(Personnel per) {
        out.printf("%-17s %-18s %-9d %-12s %-18s %-14d %-11f\n", per.getPersonId(), per.getFullName(),
                per.getAge(), per.getAddress(), per.getNumberPhone(), per.getWage(), per.getExperience());
    }

    private static Personnel createNewPersonnel(Scanner input) {
//        out.println("Nhập mã nhân viên: ");
//        var id = input.nextLine();
        out.println("Nhập tên nhân viên: ");
        var name = input.nextLine();
        out.println("Nhập địa chỉ: ");
        var address = input.nextLine();
        out.println("Nhập số điện thoại: ");
        var number = input.nextLine();
        out.println("Tuổi: ");
        var age = input.nextInt();
        out.println("Kinh nghiệm: ");
        var exp = input.nextFloat();
        out.println("Mức lương: ");
        var wage = input.nextLong();
        Personnel personnel = new Personnel(null, name, address, age, number, wage, exp);
        return personnel;
    }

    /**
     * phương thức dùng để thiết lập id cho nhân viên kế tiếp và đảm bảo các mã liên tục tăng
     * @param personId mã dùng để set cho nhân viên cuối danh sách (size -1)
     */
    private static void setNextId(String personId) {
        var nextIdStr = personId.substring(3);  //vì id có dạng EMP1001 nên tách phần số từ vị trí 3 đến cuối chuỗi
        var nextId = Integer.parseInt(nextIdStr);
        Personnel.setNextId(nextId + 1); //tiếp tục xoay vòng đến nhân viên tiếp theo
    }

    /**
     * phương thức đọc dữ liệu từ file
     * @param fileName tên file
     * @return trả về danh sách sinh viên hoặc rỗng
     */
    private static ArrayList<Personnel> readFromFile(String fileName) {
        ArrayList<Personnel> personnel = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();  //tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var id = input.nextLine();
                var name = input.nextLine();
                var address = input.nextLine();
                var phone = input.nextLine();
                var age = Integer.parseInt(input.nextLine());
                var exp = Float.parseFloat(input.nextLine());
                var wage = Long.parseLong(input.nextLine());

                Personnel persons = new Personnel(id, name, address, age, phone, wage, exp);
                personnel.add(persons);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personnel;
    }
}
