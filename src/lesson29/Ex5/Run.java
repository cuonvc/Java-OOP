package lesson29.Ex5;

import lesson25.Ex5.Comparator.SortById;
import lesson25.Ex5.Comparator.SortByIdDown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String fileName = "EMP.txt";
        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>(readFromFile(fileName));
        updateEmpId(employees);
        do {
            System.out.println("1. Thêm mới một nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tìm nhân viên theo tên");
            System.out.println("4. Tìm nhân viên có mức lương lớn hơn mức lương định mức");
            System.out.println("5. Tìm giám đốc theo nhiệm kỳ");
            System.out.println("6. Xóa nhân viên theo mã cho trước");
            System.out.println("7. Tính lương cho nhân viên");
            System.out.println("8. Tính thưởng cho nhân viên");
            System.out.println("9. Hiển thị bảng lương nhân viên");
            System.out.println("10. Sắp xếp danh sách nhân viên");
            System.out.println("11. Hiển thị danh sách nhân viên ra file");
            System.out.println("============= Vui lòng chọn =============");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.println("(1) Thêm một nhân viên, (2) Thêm một giám đốc");
                    var option = Integer.parseInt(input.nextLine());
                    if (option == 1) {
                        var newEmp = createEmployee(input);
                        employees.add(newEmp);
                        showNoti("Thêm thành công một nhân viên");
                    } else if (option == 2) {
                        var newManager = createManager(input);
                        employees.add(newManager);
                        showNoti("Thêm thành công một giám đốc");
                    }
                    break;
                case 2:
                    if (employees.size() > 0) {
                        showNoti("Danh sách nhân viên");
                        showEmployee(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 3:
                    if (employees.size() > 0) {
                        System.out.println("Nhập tên cần tìm: ");
                        var first = input.nextLine();
                        var result = searchByName(employees, first);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Không tìm thấy kết quả");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mức lương: ");
                        var amount = Float.parseFloat(input.nextLine());
                        var result = searchByWages(employees, amount);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Không tìm thấy kết quả");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 5:
                    if (employees.size() > 0) {
                        System.out.println("Năm bắt đầu: ");
                        var startYear = Integer.parseInt(input.nextLine());
                        System.out.println("Năm kết thúc: ");
                        var endYear = Integer.parseInt(input.nextLine());
                        var result = searchByYear(employees, startYear, endYear);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Không tìm thấy kết quả");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.nextLine();
                        var delete = searchById(employees, id);
                        if (delete) {
                            showNoti("Xóa thành công");
                        } else {
                            showNoti("Xóa không thành công");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 7:
                    if (employees.size() > 0) {
                        calculatorWagesMethod(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (employees.size() > 0) {
                        calculatorBonusMethod(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 9:
                    if (employees.size() > 0) {
                        showPayrolls(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 10:
                    if (employees.size() > 0) {
                        showNoti("(1) sắp xếp từ a-z\n(2) sắp xếp từ z-a");
                        var pick = Integer.parseInt(input.nextLine());
                        if (pick == 1) {
                            Collections.sort(employees, new SortById());
                            showEmployee(employees);
                        } else if (pick == 2) {
                            Collections.sort(employees, new SortByIdDown());
                            showEmployee(employees);
                        } else {
                            showNoti("Sai cú pháp, vui lòng chọn lại");
                        }
                    }
                    break;
                case 11:
                    if (employees.size() > 0) {
                        var isSuccess = writeToFile(employees, fileName);
                        if (isSuccess) {
                            showNoti("Ghi file thành công");
                        } else {
                            showNoti("Ghi file thất bại");
                        }
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng nhập lại");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * ghi thông tin danh sách nhân viên vào file
     * @param employees
     * @return  true nếu ghi thành công và false nếu ngược lại
     */
    private static boolean writeToFile(ArrayList<Employee> employees, String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (var emp : employees) {
                if (emp instanceof Manager) {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s " +
                            "- %s - %s - %s - %s - %s - %s - %s - %s\n",
                            emp.getIdCard(), emp.getFullName(), emp.getAddress(),
                            emp.getDayOfBirth(), emp.getEmail(), emp.getPhoneNumber(),
                            emp.getIdEmp(), emp.getPosition(), emp.getBasicWages(),
                            emp.getExperience(), emp.getDayOntheMonth(),
                            emp.getWages(), emp.getBonus(),
                            ((Manager) emp).getStartDay(), ((Manager) emp).getEndDay());
                } else {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s " +
                    "- %s - %s - %s - %s - %s - %s\n", emp.getIdCard(),
                            emp.getFullName(), emp.getAddress(),
                            emp.getDayOfBirth(), emp.getEmail(), emp.getPhoneNumber(),
                            emp.getIdEmp(), emp.getPosition(), emp.getBasicWages(),
                            emp.getExperience(), emp.getDayOntheMonth(),
                            emp.getWages(), emp.getBonus());
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Cập nhật mã nhân viên mới để không bị đè lên nv cũ
     * @param employees
     */
    private static void updateEmpId(ArrayList<Employee> employees) {
        var maxId = 1000;  //giả sử ban đầu danh sách rỗng
        for (var emp : employees) {
            var currentId = Integer.parseInt(emp.getIdEmp().substring(3));
            if (currentId > maxId) {
                maxId = currentId;
            }
        }
        Employee.setNextId(maxId + 1);
    }

    /**
     * đọc dữ liệu từ file ra màn hình
     * @param fileName
     * @return
     */
    private static ArrayList<Employee> readFromFile(String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Employee> employees = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();  //tạo file
            var input = new Scanner(file);  //đọc file
            while (input.hasNextLine()) {
                var line = input.nextLine();
                String[] data = line.split(" - ");
                Employee employee = createEmpFromData(data, dateFormat);
                if (employee != null) {
                    employees.add(employee);
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    private static Employee createEmpFromData(String[] data,
                                              SimpleDateFormat dateFormat) {
        var idCard = data[0];
        var fullName = data[1];
        var address = data[2];
        Date dob = null;
        try {
            dob = dateFormat.parse(data[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var email = data[4];
        var phone = data[5];
        var idEmp = data[6];
        var posi = data[7];
        var basicWage = Float.parseFloat(data[8]);
        var exp = Float.parseFloat(data[9]);
        var dom = Integer.parseInt(data[10]);
        var wages = Float.parseFloat(data[11]);
        var bonus = Float.parseFloat(data[12]);
        Date start = null;
        Date end = null;
        if (data.length > 13) {
            try {
                start = dateFormat.parse(data[13]);
                end = dateFormat.parse(data[14]);

                Manager manager = new Manager(idCard, fullName, address,
                        dob, email, phone, idEmp, posi, basicWage,
                        exp, dom, wages, bonus, start, end);
                return manager;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            Employee employee = new Employee(idCard, fullName, address,
                    dob, email, phone, idEmp, posi, basicWage,
                    exp, dom, wages, bonus);
            return employee;
        }
        return null;
    }

    /**
     * hiển thị bảng lương
     * @param employees
     */
    private static void showPayrolls(ArrayList<Employee> employees) {
        System.out.printf("%-17s %-14s %-21s %-17s %-11s %-15s\n", "Mã nhân viên",
                "Họ và tên", "Số ngày làm việc", "Lương cứng", "Thưởng", "Tổng lương");
        for (var emp : employees) {
            System.out.printf("%-17s %-14s %-21d %-17.1f %-11.1f %-15.1f\n",
                    emp.getIdEmp(), emp.getFullName(), emp.getDayOntheMonth(),
                    emp.getBasicWages(), emp.getBonus(), emp.getWages());
        }
    }

    /**
     * tính thưởng nhân viên
     * @param employees
     */
    private static void calculatorBonusMethod(ArrayList<Employee> employees) {
        for (var emp : employees) {
            emp.calcularBonus();
        }
    }

    /**
     * tính lương cho nhân viên
     * @param employees
     */
    private static void calculatorWagesMethod(ArrayList<Employee> employees) {
        for (var emp : employees) {
            emp.calcularWages();
        }
    }

    /**
     * xóa nhân viên theo mã
     */
    private static boolean searchById(ArrayList<Employee> employees, String id) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareToIgnoreCase(id) == 0) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    /**
     * Tìm giám đốc có nhiệm kỳ thuộc khoảng xđ
     * @param employees
     * @param startYear
     * @param endYear
     * @return
     */
    private static ArrayList<Employee> searchByYear(ArrayList<Employee> employees, int startYear, int endYear) {
        ArrayList<Employee> res = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();  //khởi tạo của lớp Calendar
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var manager = (Manager) emp;
                calendar.setTime(manager.getStartDay());
                var start = calendar.get(Calendar.YEAR);
                calendar.setTime(manager.getEndDay());
                var end = calendar.get(Calendar.YEAR);
                if (startYear >= start && endYear <= end) {
                    res.add(emp);
                }
            }
        }
        return res;
    }

    /**
     * tìm kiếm nv theo mức lương
     * @param employees
     * @param amount
     * @return
     */
    private static ArrayList<Employee> searchByWages(ArrayList<Employee> employees, float amount) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getBasicWages() >= amount) {
                res.add(emp);
            }
        }
        return res;
    }

    private static ArrayList<Employee> searchByName(ArrayList<Employee> employees, String first) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getFullNameStr().getFirstName().compareToIgnoreCase(first) == 0) {
                res.add(emp);
            }
        }
        return res;
    }

    /**
     * hiển thị danh sách nhân viên
     * @param employees
     */
    private static void showEmployee(ArrayList<Employee> employees) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-20s %-18s %-15s %-16s %-16s %-18s %-17s %-11s %-11s\n",
                "Số thẻ căn cước", "Họ và Tên", "Địa chỉ", "Ngày sinh",
                "Email", "Số điện thoại", "Mã nhân viên", "Vị trí", "Kinh nghiệm");
        for (var emp : employees) {
            System.out.printf("%-20s %-18s %-15s %-16s %-16s %-18s %-17s %-11s %-11.1f\n",
                    emp.getIdCard(), emp.getFullName(), emp.getAddress(),
                    dateFormat.format(emp.getDayOfBirth()), emp.getEmail(),
                    emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(),
                    emp.getExperience());
        }
    }

    /**
     * tạo mới một giám đốc
     * @param input
     * @return
     */
    private static Manager createManager(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Employee employee = createEmployee(input);
        System.out.println("Ngày bắt đầu nhiệm kỳ: ");
        Date start = null;
        try {
            start = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            start = new Date();
        }
        System.out.println("Ngày kết thúc nhiệm kỳ: ");
        Date end = null;
        try {
            end = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            end = new Date();
        }

        Manager manager = new Manager(employee, start, end);
        return manager;
    }

    /**
     * tạo mới một nhân viên
     * @param input
     * @return
     */
    private static Employee createEmployee(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Số thẻ căn cước: ");
        var idCard = input.nextLine();
        System.out.println("Họ và Tên: ");
        var name = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dob = new Date();
        }
        System.out.println("Email: ");
        var mail = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine();
        System.out.println("Vị trí: ");
        var posi = input.nextLine();
        System.out.println("Mức lương: ");
        var basicWages = Float.parseFloat(input.nextLine());
        System.out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        System.out.println("Số ngày làm trong tháng: ");
        var day = Integer.parseInt(input.nextLine());

        Employee employee = new Employee(idCard, name, address, dob,
                mail, phone, null, posi, basicWages, exp, day);
        return employee;
    }

    /**
     * hiển thị nội dung thông báo
     * @param str
     */
    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
