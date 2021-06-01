package lesson43.Ex5;

import lesson43.Ex5.Exception.InvalidEmailException;
import lesson43.Ex5.Exception.InvalidFullNameException;
import lesson43.Ex5.Exception.InvalidPhoneNumberException;
import lesson43.Ex5.comparator.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        String fileName = "EMP.txt";
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Thêm mới một nhân sự.");
            System.out.println("2. Hiển thị thông tin nhân sự.");
            System.out.println("3. Tìm nhân viên theo tên.");
            System.out.println("4. Tìm nhân viên có mức lương lớn hơn mức lương định mức");
            System.out.println("5. Tìm giám đốc theo nhiệm kỳ.");
            System.out.println("6. Xóa nhân viên.");
            System.out.println("7. Hiển thị bảng lương");  //hiển thị luôn
            System.out.println("8. Sắp xếp danh sách nhân viên...");
            System.out.println("9. Ghi danh sách nhân viên vào file txt");
            System.out.println("0. Thoát chương trình.");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.println("thêm một nhân viên (1)\nthêm một giám đốc (2)");
                    int slot = Integer.parseInt(input.nextLine());
                    if (slot == 1) {
                        Employee newEmp = null;
                        try {
                            newEmp = createEmp(input);
                            employees.add(newEmp);
                            showNoti("Thêm thành công một nhân viên");
                        } catch (InvalidPhoneNumberException |
                                InvalidFullNameException |
                                InvalidEmailException e) {
                            System.out.println(e.getMessage());
                            e.getStackTrace();
                        }
                    } else if (slot == 2){
                        Manager newMng = null;
                        try {
                            newMng = createMng(input);
                            employees.add(newMng);
                            showNoti("Thêm thành công một giám đốc");
                        } catch (InvalidPhoneNumberException |
                                InvalidFullNameException |
                                InvalidEmailException e) {
                            e.printStackTrace();
                        }
                    } else {
                        showNoti("sai cú pháp");
                    }
                    break;
                case 2:
                    if (employees.size() > 0) {
                        showNoti("Thông tin nhân sự");
                        showEmployees(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 3:
                    if (employees.size() > 0) {
                        System.out.println("Nhập tên càn tìm: ");
                        var name = input.nextLine();
                        var result = searchByName(employees, name);
                        if (result.size() > 0) {
                            System.out.println("Có " + result.size() + " kết quả cho \"" + name + "\"");
                            showEmployees(result);
                        } else {
                            System.out.println("Không có kết quả cho \"" + name + "\"");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mức lương định mức: ");
                        var bound = Float.parseFloat(input.nextLine());
                        var list = searchByWages(employees, bound);
                        if (list.size() > 0) {
                            System.out.println("Có " + list.size() + " kết quả");
                            showEmployees(list);
                        } else {
                            System.out.println("Không có kết quả");
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
                        var res = searchByTerm(startYear, endYear, employees);
                        if (res.size() > 0) {
                            System.out.println("Có " + res.size() + " kết quả");
                            showEmployees(res);
                        } else {
                            System.out.println("Không có kết quả");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mã nhân viên: ");
                        var idRemove = input.nextLine();
                        var isSuccess = removeById(employees, idRemove);
                        if (isSuccess) {
                            showNoti("Xóa thành công");
                        } else {
                            showNoti("Xóa không thành công");
                        }
                    } else {
                        showNoti("Danh sách rỗng");
                    }
                    break;
                case 7:
                    if (employees.size() > 0) {
                        calculatorMethod(employees);
                        showNoti("Bảng lương nhân viên");
                        showPayroll(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (employees.size() > 0) {
                        sortList(employees, input);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 9:  //IO
                    if (employees.size() > 0) {
                        var isSuccess = writeToFile(employees, fileName);
                        if (isSuccess) {
                            showNoti("Ghi file thành công");
                        } else {
                            showNoti("Ghi file không thành công");
                        }
                    } else {
                        showNoti("Không có dữ liệu");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * ghi dữ liệu vào file
     * @param employees
     * @return
     */
    private static boolean writeToFile(ArrayList<Employee> employees, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            for (var emp : employees) {
                if (emp instanceof Manager) {
                    printWriter.printf("%s - %s - %s - %s - %s - %s -" +
                                    " %s - %s - %s - %s - %s - %s - %s - %s - %s\n",
                            emp.getIdCard(), emp.getFullNameStr(), emp.getAddress(),
                            dateFormat.format(emp.getDayOfBirth()), emp.getEmail(),
                            emp.getPhoneNumber(), emp.getEmpId(), emp.getPosition(),
                            emp.getWages(), emp.getExperience(), emp.getDayWorkingInTheMonth(),
                            emp.getTotalWages(), emp.getBonus(),
                            dateFormat.format(((Manager) emp).getStartDay()),
                            ((Manager) emp).getEndDay());
                } else {
                    printWriter.printf("%s - %s - %s - %s - %s - %s -" +
                            " %s - %s - %s - %s - %s - %s - %s\n",
                            emp.getIdCard(), emp.getFullNameStr(), emp.getAddress(),
                            dateFormat.format(emp.getDayOfBirth()), emp.getEmail(),
                            emp.getPhoneNumber(), emp.getEmpId(), emp.getPosition(),
                            emp.getWages(), emp.getExperience(), emp.getDayWorkingInTheMonth(),
                            emp.getTotalWages(), emp.getBonus());
                }
            }
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * đọc dữ liệu từ file ra
     * @param
     * @return
     */
    private static ArrayList<Employee> readFromFile(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();  //tạo file mới
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] data = line.split(" - ");
                try {
                    Employee employee = createDataInFile(data);
                    employees.add(employee);
                } catch (InvalidPhoneNumberException |
                        InvalidFullNameException |
                        InvalidEmailException e) {
                    e.printStackTrace();
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    private static Employee createDataInFile(String[] data) throws
            InvalidPhoneNumberException, InvalidFullNameException,
            InvalidEmailException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        var id = data[0];
        var name = data[1];
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
        var wages = Float.parseFloat(data[8]);
        var exp = Float.parseFloat(data[9]);
        var dim = Integer.parseInt(data[12]);
        var totalWages = Float.parseFloat(data[11]);
        var bonus = Float.parseFloat(data[12]);
        Date stardDay = null;
        Date endDay = null;
        if (data.length > 13) {
            try {
                stardDay = dateFormat.parse(data[13]);
                endDay = dateFormat.parse(data[14]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
                Manager manager = new Manager(id, name, address, dob, email,
                        phone, idEmp, posi, wages, exp, dim,
                        totalWages, bonus, stardDay, endDay);
            return manager;

        } else {
            Employee employee = new Employee(id, name, address, dob, email,
                    phone, idEmp, posi, wages, exp, dim,
                    totalWages, bonus);
            return employee;
        }
    }

    /**
     * sắp xếp danh sách nhân viên theo từng yêu cầu
     * @param employees
     */
    private static void sortList(ArrayList<Employee> employees, Scanner input) {
        int choice = 0;
        do {
            System.out.println("1. Tên từ a-z");
            System.out.println("2. Tên từ z-a");
            System.out.println("3. Mức lương tăng dần");
            System.out.println("4. Mức lương giảm dần");
            System.out.println("5. Kinh nghiệm tăng dần");
            System.out.println("6. Kinh nghiệm giảm dần");
            System.out.println("7. Từ trẻ tuổi đến cao tuổi");
            System.out.println("8. Từ cao tuổi đến ít tuổi");
            System.out.println("9. Tổng lương từ cao tới thấp");
            System.out.println("0. Quay lại");
            showNoti("Nhập lựa chọn");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    break;
                case 1:
                    Collections.sort(employees, new SortByName());
                    showNoti("Danh sách nhân viên theo tên a-z");
                    showEmployees(employees);
                    break;
                case 2:
                    Collections.sort(employees, new SortByNameDown());
                    showNoti("Danh sách nhân viên theo tên z-a");
                    showEmployees(employees);
                    break;
                case 3:
                    Collections.sort(employees, new SortByWages());
                    showNoti("Danh sách nhân viên theo mức lương tăng dần");
                    showEmployees(employees);
                    break;
                case 4:
                    Collections.sort(employees, new SortByWagesDown());
                    showNoti("Danh sách nhân viên theo mức lương giảm dần");
                    showEmployees(employees);
                    break;
                case 5:
                    Collections.sort(employees, new SortByExp());
                    showNoti("Danh sách nhân viên theo kinh nghiệm tăng dần");
                    showEmployees(employees);
                    break;
                case 6:
                    Collections.sort(employees, new SortByExpDown());
                    showNoti("Danh sách nhân viên theo kinh nghiệm giảm dần");
                    showEmployees(employees);
                    break;
                case 7:
                    Collections.sort(employees, new SortByDateDown());
                    showNoti("Danh sách nhân viên từ trẻ tuổi đến cao tuổi");
                    showEmployees(employees);
                    break;
                case 8:
                    Collections.sort(employees, new SortByDate());
                    showNoti("Danh sách nhân viên từ cao tuổi đến trẻ tuổi");
                    showEmployees(employees);
                    break;
                case 9:
                    Collections.sort(employees, new SortByTotalWagesDown());
                    showNoti("Danh sách nhân viên có tổng lương từ cao đến thấp");
                    showEmployees(employees);
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng thử lại");
                    break;
            }
        } while (choice != 0);
    }

    private static void showPayroll(ArrayList<Employee> employees) {
            System.out.printf("%-17s %-18s %-14s %-21s %-15s %-18s\n",
                    "Mã nhân viên", "Tên nhân viên", "Mức lương",
                    "Số ngày làm việc", "Thưởng", "Tổng thực nhận");
        for (var emp : employees) {
            System.out.printf("%-17s %-18s %-14.1f %-21d %-15.1f %-18.1f\n",
                    emp.getEmpId(), emp.getFullNameStr(), emp.getWages(),
                    emp.getDayWorkingInTheMonth(), emp.getBonus(),
                    emp.getTotalWages());

        }
    }

    /**
     * Tính lương và thưởng
     * @param employees
     */
    private static void calculatorMethod(ArrayList<Employee> employees) {
        for (var emp : employees) {
            emp.calculatorBonus();
            emp.calculatorWages();
        }
    }

    /**
     * xóa nhân viên bằng id
     * @param employees
     * @param idRemove
     * @return
     */
    private static boolean removeById(ArrayList<Employee> employees, String idRemove) {
        for (var emp : employees) {
            if (emp.getEmpId().compareTo(idRemove) == 0) {
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
    private static ArrayList<Employee> searchByTerm(int startYear, int endYear, ArrayList<Employee> employees) {
        ArrayList<Employee> result = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var mng = (Manager) emp;
                calendar.setTime(mng.getStartDay());
                var start = calendar.get(Calendar.YEAR);
                calendar.setTime(mng.getEndDay());
                var end = calendar.get(Calendar.YEAR);
                if (startYear >= start && endYear <= end) {
                    result.add(mng);
                }
            }
        }
        return result;
    }

    /**
     * tìm nv có mức lương lớn hơn x
     * @param employees
     * @param bound
     * @return
     */
    private static ArrayList<Employee> searchByWages(ArrayList<Employee> employees, float bound) {
        ArrayList<Employee> list = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getWages() >= bound) {
                list.add(emp);
            }
        }
        return list;
    }

    /**
     * tìm kiếm bằng tên
     * @param employees
     * @param name
     * @return
     */
    private static ArrayList<Employee> searchByName(ArrayList<Employee> employees, String name) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getFullname().getFirstName().compareTo(name) == 0) {
                res.add(emp);
            }
        }
        return res;
    }

    /**
     * hiển thị thông tin nv
     * @param employees
     */
    private static void showEmployees(ArrayList<Employee> employees) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-21s %-20s %-15s %-14s %-16s %-18s " +
                "%-17s %-16s %-17s %-11s\n", "Số thẻ căn cước",
                "Họ và tên", "Địa chỉ", "Ngày sinh", "Email",
                "Số điện thoại", "Mã nhân viên", "Vị trí",
                "Lương cơ bản", "Kinh nghiệm");
        for (var emp : employees) {
            System.out.printf("%-21s %-20s %-15s %-14s %-16s " +
                    "%-18s %-17s %-16s %-17.1f %-11.1f\n",emp.getIdCard(),
                    emp.getFullNameStr(), emp.getAddress(),
                    dateFormat.format(emp.getDayOfBirth()),
                    emp.getEmail(), emp.getPhoneNumber(), emp.getEmpId(),
                    emp.getPosition(), emp.getWages(), emp.getExperience());
        }
    }

    /**
     * tạo đối tượng giám đốc
     * @param input
     * @return
     * @throws InvalidPhoneNumberException sai cú pháp sđt
     * @throws InvalidFullNameException  sai cú pháp tên
     * @throws InvalidEmailException sai cú pháp email
     */
    private static Manager createMng(Scanner input) throws
            InvalidPhoneNumberException, InvalidFullNameException,
            InvalidEmailException {
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
     * tạo đối tượng nv
     * @param input
     * @return
     * @throws InvalidPhoneNumberException
     * @throws InvalidFullNameException
     * @throws InvalidEmailException
     */
    private static Employee createEmp(Scanner input) throws
            InvalidPhoneNumberException, InvalidFullNameException,
            InvalidEmailException {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Số thẻ căn cước: ");
        var id = input.nextLine();
        System.out.println("Họ và tên: ");
        var name = input.nextLine().trim();
        System.out.println("Địa chỉ: ");
        var addres = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine().trim());
        } catch (ParseException e) {
            System.out.println("Sai định dạng ngày dd/MM/yyyy");
            dob = new Date();
        }
        System.out.println("Email: ");
        var mail = input.nextLine().trim();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine().trim();
        System.out.println("Vị trí: ");
        var posi = input.nextLine();
        System.out.println("Mức lương: ");
        var wages = Float.parseFloat(input.nextLine());
        System.out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        System.out.println("Số ngày làm việc trong tháng: ");
        var dim = Integer.parseInt(input.nextLine());
        Employee employee = new Employee(id, name, addres, dob, mail,
                phone, null, posi, wages, exp, dim, 0, 0);
        return employee;
    }

    /**
     * Thông báo mỗi khi kết thúc một hành độnh
     * @param str
     */
    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
