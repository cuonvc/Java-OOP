package lesson25.Ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int choice = 0;
        String fileName = "EMP.TXT";
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(readFromFile(fileName));
        var previousData = employees.size();
        if (previousData > 0) {
            setLastId(employees.get(employees.size() - 1).getIdEmp());  //lấy ra id của thằng cuối cùng
        }
        do {
            System.out.println("===============================");
            System.out.println("1. Thêm một nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tìm nhân viên theo tên");
            System.out.println("4. Tìm nhân viên có mức lương lớn hơn mức lương định mức");
            System.out.println("5. Tìm giám đốc theo nhiệm kỳ");
            System.out.println("6. Xóa nhân viên theo mã cho trước");
            System.out.println("7. Tính lương và thưởng cho nhân viên");
            System.out.println("8. Hiển thị bảng lương");
            System.out.println("9. Ghi danh sách nhân viên vào file EMP.txt");
            System.out.println("0. Thoát chương trình");
            System.out.println("=========>>> Nhập lựa chọn <<<=========");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNotify("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.println("Chọn (1) thêm nhân viên, (2) thêm giám đốc.");
                    int pick = Integer.parseInt(input.nextLine());
                    if (pick == 1) {
                        var newEmployee = createEmp(input);
                        employees.add(newEmployee);
                        showNotify("Thêm thành công một nhân viên");
                    } else if (pick == 2) {
                        var newManager = createMng(input);
                        employees.add(newManager);
                        showNotify("Thêm thành công một giám đốc");
                    } else {
                        showNotify("Sai cú pháp, vui lòng chọn lại ...");
                    }
                    break;
                case 2:
                    if (employees.size() > 0) {
                        System.out.println("Danh sách nhân viên và giám đốc");
                        showEmp(employees);
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 3:
                    if (employees.size() > 0) {
                        System.out.println("Nhập tên nhân viên: ");
                        var name = input.nextLine();
                        var result = searchByName(name, employees);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả cho " + name);
                            showEmp(result);
                        } else {
                            showNotify("Không có kết quả cho " + name);
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 4:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mức lương định mức");
                        var amount = Float.parseFloat(input.nextLine());
                        var result = searchByWages(amount, employees);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " nhân viên có mức lương lớn hơn " + amount);
                            showEmp(result);
                        } else {
                            showNotify("Không có kết quả");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống...");
                    }
                    break;
                case 5:
                    if (employees.size() > 0) {
                        System.out.println("Năm bắt đầu nhiệm kỳ: ");
                        var startYear = Integer.parseInt(input.nextLine());
                        System.out.println("Năm kết thúc nhiệm kỳ: ");
                        var endYear = Integer.parseInt(input.nextLine());
                        var result = findManagerByTerm(startYear, endYear, employees);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả");
                            showEmp(result);
                        } else {
                            showNotify("Không có kết quả...");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống...");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        System.out.println("Mã nhân viên cần xóa: ");
                        var idremove = input.nextLine();
                        var isDelete = removeById(idremove, employees);
                        if (isDelete) {
                            System.out.println("Xóa thành công nhân viên " + idremove);
                        } else {
                            showNotify("Thao tác không thành công, vui lòng thực hiện lại");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống...");
                    }
                    break;
                case 7:  //tính lương và thưởng
                    if (employees.size() > 0) {
                        calcularWagesMethod(employees);
                        calcularBonusMethod(employees);
                        showNotify("Tính toán thành công");
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 8:  //hiển thị bảng lương
                    if (employees.size() > 0) {
                        showNotify("Bảng lương tháng này");
                        showPayroll(employees);
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 9:
                    if (employees.size() > 0) {
                        var isSuccess = writeToFile(employees, fileName);
                        if (isSuccess) {
                            showNotify("Ghi file thành công");
                        } else {
                            showNotify("ghi file thất bại");
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống...");
                    }
                    break;
                default:
                    showNotify("Sai cú pháp, vui lòng nhập lại trong khoảng [0,9]");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * đọc ra bộ nhớ đệm rồi thì giờ ghi vào file trong ổ chứa
     * @param employees
     * @return
     */
    private static boolean writeToFile(ArrayList<Employee> employees, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            for (var emp : employees) {
                if (emp instanceof  Manager) {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s - %s - %f - %f - %d - %f - %f - %s - %s\n",
                            emp.getIdCard(), emp.getFullName(), emp.getAddress(), dateFormat.format(emp.getDayOfBirth()),
                            emp.getEmail(), emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(), emp.getBasicWages(),
                            emp.getExperience(), emp.getDayInTheMonth(), emp.getBonus(), emp.getReceiveWages(),
                            dateFormat.format(((Manager) emp).getStartTerm()),
                            dateFormat.format(((Manager) emp).getEndTerm()));
                } else {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s - %s - %f - %f - %d - %f - %f\n",
                            emp.getIdCard(), emp.getFullName(), emp.getAddress(), dateFormat.format(emp.getDayOfBirth()),
                            emp.getEmail(), emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(), emp.getBasicWages(),
                            emp.getExperience(), emp.getDayInTheMonth(), emp.getBonus(), emp.getReceiveWages());
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
     * phương thức tách lấy phần số của mã nhân viên cuối cùng trong danh sách có sẵn
     * rồi sét tiếp cho nhân viên mới tiếp theo
     * @param idEmp mã nhân viên cuối cùng của danh sách cũ có sẵn
     */
    private static void setLastId(String idEmp) {
        var lastIdStr = idEmp.substring(3);  //lấy ra phần số
        var lastIdInt = Integer.parseInt(lastIdStr);  //chuyển chuỗi số (dạng String) vừa tách thành dạng chữ số
        Employee.setNextId(lastIdInt + 1);
    }

    /**
     * phương thức đọc ra dữ liệu trước đó trong file (nếu có)
     * @param fileName tên file
     * @return trả về danh sách dữ liệu trong file
     */
    private static ArrayList<Employee> readFromFile(String fileName) {
        ArrayList<Employee> emps = new ArrayList<>();
        var file = new File(fileName);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                String[] data = line.split(" - ");   //phân tách chuỗi thành các phần tử trong mảng và cách nhau bởi dấu -
                Employee employee = createEmpFromData(data);
                if (employee != null) {
                    emps.add(employee);
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emps;
    }

    /**
     * tạo mới mới thông tin của nhân viên
     * @param data dữ liệu truyền vào sau khi đọc file
     * @return trả về đối tượng được tham chiếu đến bởi Employee
     */
    private static Employee createEmpFromData(String[] data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        var idCard = data[0];
        var fullName = data[1];
        var address = data[2];
        Date dayOfBirth = null;
        try {
            dayOfBirth = dateFormat.parse(data[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var email = data[4];
        var phone = data[5];
        var idEMP = data[6];
        var posi = data[7];
        var basicW = Float.parseFloat(data[8]);
        var exp = Float.parseFloat(data[9]);
        var dayInMonth = Integer.parseInt(data[10]);
        var bonus = Float.parseFloat(data[11]);
        var receiveW = Float.parseFloat(data[12]);
        Date startDay = null;
        Date endDay = null;
        if (data.length > 13) {  //hiểu là nếu vào trường hợp giám đốc thì chuỗi sẽ có 15 phần tử, còn emp chỉ có 13 thôi
            try {
                startDay = dateFormat.parse(data[13]);
                endDay = dateFormat.parse(data[14]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Manager manager = new Manager(idCard, fullName, address, dayOfBirth, email, phone,
                    idEMP, posi, basicW, exp, dayInMonth, bonus, receiveW, startDay, endDay);
            return manager;
        }
        Employee employee = new Employee(idCard, fullName, address, dayOfBirth, email, phone,
                idEMP, posi, basicW, exp, dayInMonth, bonus, receiveW);
        return employee;
    }

    /**
     * hiển thị bảng lương
     * @param employees
     */
    private static void showPayroll(ArrayList<Employee> employees) {
        System.out.printf("%-17s %-18s %-21s %-10s %-15s\n",
                "Mã nhân viên", "Họ và tên", "Số ngày làm việc", "Thưởng", "Tổng lương");
        for (var emp : employees) {
            System.out.printf("%-17s %-18s %-21d %-10.2f %-15.2f\n",
                    emp.getIdEmp(), emp.getFullName(), emp.getDayInTheMonth(),
                    emp.getBonus(), emp.getReceiveWages());
        }
    }



    /**
     * phương thức tính thưởng cho nhân viên
     * @param employees
     */
    private static void calcularBonusMethod(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).calcularBonus();
        }
    }

    /**
     * phương thức tính lương cho nhân viên
     * @param employees
     */
    private static void calcularWagesMethod(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
                employees.get(i).calcularReceiveWage();  //lương thực nhận
        }
    }

    /**
     * xóa nhân viên bằng mã id
     */
    private static boolean removeById(String idremove, ArrayList<Employee> employees) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(idremove) == 0) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    /**
     * tìm giám đốc theo nhiệm kỳ
     * @param startYear
     * @param endYear
     * @param employees
     * @return
     */
    private static ArrayList<Employee> findManagerByTerm(int startYear, int endYear, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();//trả về đối tượng Calendar cho thời
        // gian hiện thời(tóm lại dòng này là khai báo mặc định để dử dụng lớp Calender)
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var mng = (Manager) emp;
                calendar.setTime(mng.getStartTerm());
                var start = calendar.get(Calendar.YEAR);
                calendar.setTime(mng.getEndTerm());
                var end = calendar.get(Calendar.YEAR);
                //nếu nhiệm kỳ cần tìm
                if (start <= startYear && end >= endYear) {
                    res.add(emp);
                }
            }
        }
        return res;
    }

    /**
     * tìm kiếm nhân viên theo mức lương
     * @param amount
     * @param employees
     * @return
     */
    private static ArrayList<Employee> searchByWages(float amount, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getBasicWages() >= amount) {
                res.add(emp);
            }
        }
        return res;
    }

    /**
     * tìm nhân viên theo tên (không chứa họ và đệm)
     * @param name
     * @param employees
     * @return
     */
    private static ArrayList<Employee> searchByName(String name, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getFullNameStr().getLastName().compareToIgnoreCase(name) == 0) {
                res.add(emp);
            }
        }
        return res;
    }


    /**
     * hiển thị nhân viên theo bảng
     * @param employees
     */
    private static void showEmp(ArrayList<Employee> employees) {
        System.out.printf("%-20s %-26s %-15s %-14s %-24s %-18s %-17s %-13s %-14s %-16s %-16s\n",
                "Số thẻ căn cước", "Họ và tên", "Địa chỉ", "Ngày sinh", "Email",
                "Số điện thoại", "Mã nhân viên", "Vị trí", "Mức lương", "Kinh nghiệm", "Số ngày làm việc");
        for (var emp : employees) {
            showInfoEmp(emp);
        }
    }

    /**
     * hiển thị thông tin của từng nhân viên
     * @param emp
     */
    private static void showInfoEmp(Employee emp) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-20s %-26s %-15s %-14s %-24s %-18s %-17s %-13s %-14.1f %-16.1f %-16d\n",
                emp.getIdCard(), emp.getFullName(), emp.getAddress(), dateFormat.format(emp.getDayOfBirth()),
                emp.getEmail(), emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(), emp.getBasicWages(),
                emp.getExperience(), emp.getDayInTheMonth());
    }

    /**
     * thêm mới một giám đốc
     * @param input
     * @return
     */
    private static Manager createMng(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Employee employee = createEmp(input);
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
     * thêm mới một nhân viên
     * @param input
     * @return
     */
    private static Employee createEmp(Scanner input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("-----Nhập thông tin nhân viên mới-----");
        System.out.println("Số thẻ căn cước: ");
        var idCard = input.nextLine();
        System.out.println("Họ và tên: ");
        var name = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dob = new Date();  //nếu nhập sai thì mặc định là ngày hôm nay
        }
        System.out.println("Email: ");
        var mail = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine();
        System.out.println("Vị trí: ");
        var posi = input.nextLine();
        System.out.println("Mức lương: ");
        var wage = Float.parseFloat(input.nextLine());
        System.out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        System.out.println("Số ngày làm việc trong tháng: ");
        var dim = Integer.parseInt(input.nextLine());
        //vì không cần nhập bonus và receive nên để là 0
        Employee employee = new Employee(idCard, name, address, dob, mail, phone,
                null, posi, wage, exp, dim, 0, 0);
        return employee;
    }

    /**
     * hiển thị thông báo khi kết thúc một hành động
     * @param str thông báo được hiển thị
     */
    private static void showNotify(String str) {
        System.out.println(">>>>> " + str + " <<<<<");
    }
}
