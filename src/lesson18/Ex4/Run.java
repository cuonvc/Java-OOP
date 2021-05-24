package lesson18.Ex4;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
//ở ví dụ này, case 9 làm theo 2 cách tương ứng với file emp và mng
public class Run {
    public static void main(String[] args) {
        int choice = 0;
        var input = new Scanner(in);
        //emp (cách 1)
        var fileEmp = "EMP.test";
        ArrayList<Employee> employees = new ArrayList<>(readFromFilieEmp(fileEmp));
        var previousData = employees.size();
        if (previousData > 0) {
            setLastId(employees.get(employees.size() - 1).getIdEMP());  //lấy ra id cuối cùng trong file cũ
        }
        //mng (cách 2)
        var fileMng = "MNG.test";
        ArrayList<Manager> managers = new ArrayList<>();

        do {
            out.println("0. kết thúc chương trình.");
            out.println("1. Thêm mới một nhân viên vào danh sách nhân viên.");
            out.println("2. Thêm mới một quản lý vào danh sách quản lý.");
            out.println("3. Hiển thị thông tin nhân viên ra màn hình.");
            out.println("4. Hiển thị thông tin quản lý ra màn hình.");
            out.println("5. Tìm nhân viên theo tên.");
            out.println("6. Tìm nhân viên có mức lương >= x, nhập x từ bàn phím.");
            out.println("7. Tìm giám đốc theo nhiệm kì.");
            out.println("8. xóa nhân viên theo mã cho trước.");
            out.println("9. Ghi dánh sách nhân viên và giám đốc vào từng file");
            out.println("======>HÃY NHẬP LỰA CHỌN <======");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    showNotify("Kết thúc chương trình");
                    break;
                case 1:
                    var addEmp = createEmp(input);
                    employees.add(addEmp);
                    showNotify("Thêm thành công");
                    break;
                case 2:
                    var addMng = createManager(input);
                    managers.add(addMng);
                    showNotify("Thêm thành công");
                    break;
                case 3:
                    showEmployee(employees);
                    break;
                case 4:
                    showManager(managers);
                    break;
                case 5:
                    if (employees.size() > 0) {
                        out.println("Nhập tên cần tìm: ");
                        var name = input.nextLine();
                        var isExist = searchByName(name, employees);
                        if (isExist.size() > 0) {
                            out.println("Có " + isExist.size() + " kết quả: ");
                            showEmployee(isExist);
                        } else {
                            out.println("Không có kết quả...");
                        }
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        out.println("Nhập mức lương định mức: ");
                        var amount = input.nextLong();
                        var result = searchByWage(amount, employees);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            out.println("Không có kết quả...");
                        }
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 7:
                    if (managers.size() > 0) {
                        var format = "dd/MM/yyyy";
                        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
                        out.println("Ngày bắt đầu nhiệm kỳ: (ví dụ 01/01/2021) ");
                        var start = input.nextLine();
                        out.println("Ngày kết thúc nhiệm kỳ: ");
                        var end = input.nextLine();
                        var result = searchByDay(dateFormat, start, end, managers);
                        if (result.size() > 0) {
                            out.println("Có " + result.size() + " kết quả");
                            showManager(result);
                        } else {
                            out.println("Không có kết quả...");
                        }
                    } else {
                        showNotify("Danh sách quản lý trống");
                    }
                    break;
                case 8:  //removeEmp
                    if (employees.size() > 0) {
                        out.println("Nhập ID cần xóa: ");
                        var id = input.nextLine();
                        var isDelete = removeFromId(id, employees);
                        if (isDelete) {
                            showNotify("Xóa thành công");
                        } else {
                            showNotify("Nhân viên không tồn tại...");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 9:
                    if (employees.size() > 0) {
                        var isSuccess = writeToFileEmp(fileEmp, employees);
                        if (isSuccess) {
                            showNotify("Ghi thành công file nhân viên");
                        } else {
                            showNotify("Ghi file nhân viên thất bại");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                default:
                    showNotify("Vui lòng lập giá trị từ 0-9");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * phương thức ghi những thông tin chưa tồn tại vào file emp
     * @param fileEmp
     * @param employees
     * @return
     */
    private static boolean writeToFileEmp(String fileEmp, ArrayList<Employee> employees) {
        var currentFile = readFromFilieEmp(fileEmp);
        try {
            PrintWriter printWriter = new PrintWriter(fileEmp);
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (var emp : employees) {
                if (!isExist(emp, currentFile)) {  //nếu dữ liệu đang trống
                    printWriter.printf("%s-%s-%s-%s-%s-%s-%s-%s-%d-%f", emp.getIdCard(), emp.getFullName(),
                            emp.getAddress(), dateFormat.format(emp.getBirthday()), emp.getEmail(),
                            emp.getPhoneNumber(), emp.getIdEMP(), emp.getPosition(), emp.getWage(),
                            emp.getExperience());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * kiểm tra xem file cần in ra đã tồn tại hay chưa
     * @param emp đối tượng cần kiểm tra
     * @param currentFile danh sách đối tượng
     * @return
     */
    private static boolean isExist(Employee emp, ArrayList<Employee> currentFile) {
        for (var item : currentFile) {
            if (item.getIdEMP().compareTo(emp.getIdEMP()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tách lấy số thứ tự của id cuối trong danh sách cũ
     * và sét id cho các đối tượng mới
     * @param idEMP id cần tách
     */
    private static void setLastId(String idEMP) {
        var lastIdStr = idEMP.substring(3);  //trích xuất từ vị trí index thứ 3 đến hết
        var lastIdInt = Integer.parseInt(lastIdStr);  //chuyển phần số của id ở dạng str về dạng int
        Employee.setNextId(lastIdInt + 1);  //bắt đầu xét id cho dữ liệu mới
    }

    /**
     * phương thức đọc dữ liệu có sẵn trước đó từ file
     * @param fileEmp file nhân viên
     * @return danh sách các đối tượng đã có sẵn trong file trước đó
     */
    private static ArrayList<Employee> readFromFilieEmp(String fileEmp) {
        ArrayList<Employee> emps = new ArrayList<>();
        var file = new File(fileEmp);
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var idCard = input.nextLine();
                var fullName = input.nextLine();
                var address = input.nextLine();
                var birthDay = dateFormat.parse(input.nextLine());
                var email = input.nextLine();
                var phone = input.nextLine();
                var position = input.nextLine();
                var wage = input.nextLong();
                var exp = input.nextFloat();
                Employee employee = new Employee(idCard, fullName, address, birthDay, email,
                        phone, null, position, wage, exp);
                emps.add(employee);
            }
            input.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return emps;
    }

    /**
     * phương thức xóa một nhân viên khỏi danh sách
     * @param id mã nhân viên cần xóa
     * @param employees danh sách nhân viên ban đầu
     * @return true nếu xóa thành công và ngược lại
     */
    private static boolean removeFromId(String id, ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getIdEMP().compareTo(id) == 0) {
                employees.remove(employees.get(i));
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm kiếm quản lý bằng nhiệm kì
     * @param dateFormat đối tượng của SimpleDateFormat
     * @param start ngày bắt đầu nhiệm kì
     * @param end ngày kết thúc nhiệm kì
     * @param managers danh sách các quản lý gốc
     * @return trả về danh sách mới có các quản lý trùng nhiệm kì với nhiệm kì input
     */
    private static ArrayList<Manager> searchByDay(SimpleDateFormat dateFormat, String start,
                                                   String end, ArrayList<Manager> managers) {
        ArrayList<Manager> manager = new ArrayList<>();
        for (var emp : managers) {
            if (dateFormat.format(emp.getStartTerm()).compareTo(start) == 0
            && dateFormat.format(emp.getEndTerm()).compareTo(end) == 0) {
                manager.add(emp);
            }
        }
        return manager;
    }


    /**
     * phương thức tìm kiếm nhan viên theo mức lương
     * @param amount số tiền điện mức
     * @param employees danh sách nhân viên gốc
     * @return trả về danh sách các nhân viên theo yêu cầu
     */
    private static ArrayList<Employee> searchByWage(long amount, ArrayList<Employee> employees) {
        ArrayList<Employee> employee = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getWage() >= amount) {
                employee.add(emp);
            }
        }
        return employee;
    }

    /**
     * phương thức tìm kiếm nhân viên theo tên
     * @param name tên cần tìm
     * @param employees danh sách nhân viên gốc
     * @return trả về danh sách nhân viên theo yêu cầu
     */
    private static ArrayList<Employee> searchByName(String name, ArrayList<Employee> employees) {
        ArrayList<Employee> employee = new ArrayList<>();
        for (var emp : employees) {
            var lastName = emp.getName().getLastName();  //tên ko họ, ko đệm
            if (lastName.compareToIgnoreCase(name) == 0) {
                employee.add(emp);
            }
        }
        return employee;
    }

    /**
     * phương thức hiển thị từng quản lý
     * @param managers
     */
    private static void showManager(ArrayList<Manager> managers) {
        if (managers.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            showNotify("Danh sách nhân viên");
            out.printf("%-20s %-22s %-12s %-14s %-25s %-18s %-17s %-12s %-14s %-11s %-11s %-18s %-14s\n",
                    "Số thẻ căn cước", "Họ và tên", "Địa chỉ", "Ngày sinh", "Email", "Số điện thoại",
                    "Mã nhân viên", "Chức vụ", "Mức lương", "Kinh nghiệm",
                    "Mức thưởng","Bắt đầu nhiệm kì", "Kết thúc nhiệm kì");
            for (var mng : managers) {
                showInfoMng(mng, dateFormat);
            }
        } else {
            showNotify("Danh sách trống...");
        }
    }

    private static void showInfoMng(Manager mng, SimpleDateFormat dateFormat) {
        out.printf("%-20s %-22s %-12s %-14s %-25s %-18s %-17s %-12s %-14d %-11.1f %-11d %-18s %-14s\n",
                mng.getIdCard(), mng.getFullName(), mng.getAddress(), dateFormat.format(mng.getBirthday()),
                mng.getEmail(), mng.getPhoneNumber(), mng.getIdEMP(), mng.getPosition(),
                mng.getWage(), mng.getExperience(), mng.getReward(), dateFormat.format(mng.getStartTerm()),
                dateFormat.format(mng.getEndTerm()));
    }

    /**
     * phương thức hiển thị từng nhân viên
     * @param employees
     */
    private static void showEmployee(ArrayList<Employee> employees) {
        if (employees.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            showNotify("Danh sách nhân viên");
            out.printf("%-20s %-22s %-12s %-14s %-25s %-18s %-17s %-12s %-14s %-11s\n",
                    "Số thẻ căn cước", "Họ và tên", "Địa chỉ", "Ngày sinh", "Email", "Số điện thoại",
                    "Mã nhân viên", "Chức vụ", "Mức lương", "Kinh nghiệm");
            for (var emp : employees) {
                showInfoEmp(emp, dateFormat);
            }
        } else {
            showNotify("Danh sách trống...");
        }
    }

    /**
     * phương thức hiển thịthông tin của từng nhân viên
     * @param emp nhân viên cần hiển thị
     */
    private static void showInfoEmp(Employee emp, SimpleDateFormat dateFormat) {
        out.printf("%-20s %-22s %-12s %-14s %-25s %-18s %-17s %-12s %-14d %-11.1f\n",
                emp.getIdCard(), emp.getFullName(), emp.getAddress(), dateFormat.format(emp.getBirthday()),
                emp.getEmail(), emp.getPhoneNumber(), emp.getIdEMP(), emp.getPosition(),
                emp.getWage(), emp.getExperience());
    }

    /**
     * phương thức thêm mới một quản lý
     * @param input đối tượng của Scanner
     * @return
     */
    private static Manager createManager(Scanner input) {
        Employee employee = createEmp(input);  //bê những thứ đã nhập từ bên dưới (createEmp) lên

        out.println("Mức thưởng: ");
        var bonus = Long.parseLong(input.nextLine());
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        out.println("Ngày bắt đầu nhiệm kì: ");
        Date start = null;  //khởi tạo
        try {
            start = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            //nếu nhập sai thì mặc định là ngày hiện tại
            start = new Date();
        }
        out.println("Ngày kết thúc nhiệm kì: ");
        Date end = null;
        try {
            end = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            end = new Date();
        }
        Manager manager = new Manager(employee, bonus, start, end);
        return manager;
    }

    /**
     * phương thức thêm mới một nhân viên
     * @param input đối tượng của Scanner
     * @return trả về đối tượng với thông tin vừa nhập
     */
    private static Employee createEmp(Scanner input) {
        out.println("Nhập số thẻ căn cước: ");
        var idcard = input.nextLine();
        out.println("Họ và tên: ");
        var name = input.nextLine();
        out.println("Địa chỉ: ");
        var addss = input.nextLine();
        out.println("Ngày sinh: (ví dụ 05/08/2002) ");
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dateOfBirth = null;  //khởi tạo
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        out.println("Email: ");
        var mail = input.nextLine();
        out.println("Số điện thoại: ");
        var number = input.nextLine();
        out.println("Vị trí công việc: ");
        var position = input.nextLine();
        out.println("Mức lương: ");
        var wage = Long.parseLong(input.nextLine());
        out.println("Số năm kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        Employee employee = new Employee(idcard, name, addss, dateOfBirth, mail,
                number, null, position, wage, exp);
        return employee;
    }

    /**
     * phương thức hiển thị thông báo
     * @param notify thông báo
     */
    private static void showNotify(String notify) {
        out.println("========> " + notify + " <=========");
    }
}
