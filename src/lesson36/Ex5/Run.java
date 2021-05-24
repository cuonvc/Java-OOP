package lesson36.Ex5;

import lesson36.Ex5.Comparator.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int choice = 0;
        String fileName = "EMP.txt";
        ArrayList<Employee> employees = new ArrayList<>(readFromFile(fileName));
        do {
            System.out.println("1. Thêm một nhân viên");
            System.out.println("2. Hiển thị thông tin danh sách nhân viên");
            System.out.println("3. Tìm nhân viên theo tên");
            System.out.println("4. Tìm nhân viên có mức lương lớn hơn mức lương định mức");
            System.out.println("5. Tìm giám đốc theo nhiệm kỳ");
            System.out.println("6. Xóa nhân viên");
            System.out.println("7. Tính lương và tính thưởng cho nhân viên");  //hiển thị luôn
            System.out.println("8. Sắp xếp danh sách nhân viên");
            System.out.println("9. Ghi danh sách nhân viên vào file");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    showNoti("Nhập lựa chọn");
                    System.out.println("1. Thêm một nhân viên\n2. Thêm một giám đốc");
                    int slot = Integer.parseInt(input.nextLine());
                    if (slot == 1) {
                        try {
                            var newEmp = createEmployee(input);
                            employees.add(newEmp);
                            showNoti("Thêm thành công một nhân viên");
                        } catch (InvalidPersonException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Đã xảy ra ngoại lệ InvalidPersonException");
                        }
                    } else if (slot == 2){
                        try {
                            var newMng = creatManager(input);
                            employees.add(newMng);
                            showNoti("Thêm thành công một giám đốc");
                        } catch (InvalidPersonException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Đã xảy ra ngoại lệ InvalidPersonException");
                        }
                    } else {
                        showNoti("Sai cú pháp, vui lòng nhập lại");
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
                        var name = input.nextLine();
                        var result = searchByName(employees, name);
                        if (result.size() > 0) {
                            showNoti("Tìm thấy " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Không tìm thấy kết quả cho \"" + name + "\"");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 4:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mức lương định mức: ");
                        var amount = Float.parseFloat(input.nextLine());
                        var result = searchByWages(employees, amount);
                        if (result.size() > 0) {
                            showNoti("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Không có kết quả");
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
                        var result = searchByTerm(employees, startYear, endYear);
                        if (result.size() > 0) {
                            showNoti("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNoti("Danh sách trống");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mã nhân viên cần xóa: ");
                        var idRemove = input.nextLine();
                        var isDelete = removeById(idRemove, employees);
                        if (isDelete) {
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
                        calculatorBonusMethod(employees);
                        showNoti("Bảng lương của nhân viên");
                        showPayroll(employees);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 8:
                    if (employees.size() > 0) {
                        sortEmployee(employees, input);
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                case 9:
                    if (employees.size() > 0) {
                        var isSuccess = writeToFile(employees, fileName);
                        if (isSuccess) {
                            showNoti("Ghi file thành công");
                        } else {
                            showNoti("Ghi file thất bại");
                        }
                    } else {
                        showNoti("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean writeToFile(ArrayList<Employee> employees, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            for (var emp : employees) {
                if (emp instanceof Manager) {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s " +
                            "- %s - %s - %s - %s - %s - %s - %s - %s\n",
                            emp.getIdCard(), emp.getFullNameStr(),emp.getAddress(),
                            dateFormat.format(emp.getDayOfBirth()), emp.getEmail(),
                            emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(),
                            emp.getBasicWages(), emp.getExperience(),
                            emp.getDayInTheMonth(), emp.getWages(), emp.getBonus(),
                            ((Manager) emp).getStartDay(), ((Manager) emp).getEndDay());
                } else {
                    printWriter.printf("%s - %s - %s - %s - %s - %s - %s " +
                    "- %s - %s - %s - %s - %s - %s\n", emp.getIdCard(),
                            emp.getFullNameStr(),emp.getAddress(),
                            dateFormat.format(emp.getDayOfBirth()), emp.getEmail(),
                            emp.getPhoneNumber(), emp.getIdEmp(), emp.getPosition(),
                            emp.getBasicWages(), emp.getExperience(),
                            emp.getDayInTheMonth(), emp.getWages(), emp.getBonus());
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
     * Đọc dữ liệu từ file ra
     * @param fileName
     * @return
     */
    private static ArrayList<Employee> readFromFile(String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Employee> employees = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var data = line.split(" - ");
                Employee emp = createNewFile(data, dateFormat);
                if (emp != null) {
                    employees.add(emp);
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    private static Employee createNewFile(String[] data, SimpleDateFormat dateFormat) {
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
        var dim = Integer.parseInt(data[10]);
        var wages = Float.parseFloat(data[11]);
        var bonus = Float.parseFloat(data[12]);
        Date start = null;
        Date end = null;
        if (data.length > 13) {
            try {
                start = dateFormat.parse(data[13]);
                end = dateFormat.parse(data[14]);
                return new Manager(idCard, fullName, address,
                        dob, email, phone, idEmp, posi,
                        basicWage, exp, dim, wages,
                        bonus, start, end);
            } catch (ParseException | InvalidPersonException e) {
                e.printStackTrace();
            }
        } else {
            try {
                return new Employee(idCard, fullName, address,
                        dob, email, phone, idEmp, posi,
                        basicWage, exp, dim, wages, bonus);
            } catch (InvalidPersonException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * sắp xếp nhân viên
     * @param employees
     */
    private static void sortEmployee(ArrayList<Employee> employees, Scanner input) {
        int slot = 0;
        do {
            showNoti("Chọn cách sắp xếp");
            System.out.println("1. Tên tăng dần từ a-z");
            System.out.println("2. Tên giảm dần từ z-a");
            System.out.println("3. Mức lương tăng dần");
            System.out.println("4. Mức lương giảm dần");
            System.out.println("5. Số năm kinh nghiệm tăng dần");
            System.out.println("6. Số năm kinh nghiệm giảm dần");
            System.out.println("7. Từ trẻ đến già");
            System.out.println("8. Từ già đến trẻ");
            System.out.println("9. Tổng lương giảm dần");
            System.out.println("0. Quay lại");
            slot = Integer.parseInt(input.nextLine());
            switch (slot) {
                case 0:
                    showNoti("Đã thoát");
                    System.out.println("vui lòng chọn lại hành động");
                    break;
                case 1:
                    showNoti("Tên tăng dần từ a-z");
                    Collections.sort(employees, new SortByName());
                    showEmployee(employees);
                    break;
                case 2:
                    showNoti("Tên giảm dần từ z-a");
                    Collections.sort(employees, new SortByNameDown());
                    showEmployee(employees);
                    break;
                case 3:
                    showNoti("Lương từ thấp đến cao");
                    Collections.sort(employees, new SortByWages());
                    showEmployee(employees);
                    break;
                case 4:
                    showNoti("Lương từ cao đến thấp");
                    Collections.sort(employees, new SortByWagesDown());
                    showEmployee(employees);
                    break;
                case 5:
                    showNoti("Kinh nghiệm từ thấp đến cao");
                    Collections.sort(employees, new SortByExperience());
                    showEmployee(employees);
                    break;
                case 6:
                    showNoti("Kinh nghiệm từ cao đến thấp");
                    Collections.sort(employees, new SortByExperienceDown());
                    showEmployee(employees);
                    break;
                case 7:
                    showNoti("Từ trẻ đến già");
                    Collections.sort(employees, new SortByBirthDown());
                    showEmployee(employees);
                    break;
                case 8:
                    showNoti("Từ già đến trẻ");
                    Collections.sort(employees, new SortByBirth());
                    showEmployee(employees);
                    break;
                default:
                    showNoti("Sai cú pháp, vui lòng nhập lại");
                    break;
            }
        } while (slot != 0);
    }

    private static void showPayroll(ArrayList<Employee> employees) {
        System.out.printf("%-17s %-14s %-14s %-21s %-11s %-14s\n",
                "Mã nhân viên", "Họ và tên", "Mức lương",
                "Số ngày làm việc", "Thưởng", "Tổng lĩnh");
        for (var emp : employees) {
            System.out.printf("%-17s %-14s %-14.1f %-21d %-11.1f %-14.1f\n",
                    emp.getIdEmp(), emp.getFullNameStr(), emp.getBasicWages(),
                    emp.getDayInTheMonth(), emp.getBonus(), emp.getWages());
        }
    }

    private static void calculatorBonusMethod(ArrayList<Employee> employees) {
        for (var emp : employees) {
            emp.calculatorBonus();
        }
    }

    private static void calculatorWagesMethod(ArrayList<Employee> employees) {
        for (var emp : employees) {
            emp.calculatorWages();
        }
    }


    private static boolean removeById(String idRemove, ArrayList<Employee> employees) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(idRemove) == 0) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }


    private static ArrayList<Employee> searchByTerm(ArrayList<Employee> employees, int startYear, int endYear) {
        ArrayList<Employee> res = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var mng = (Manager) emp;
                calendar.setTime(mng.getStartDay());
                var start = calendar.get(Calendar.YEAR);
                calendar.setTime(mng.getEndDay());
                var end = calendar.get(Calendar.YEAR);
                if (startYear >= start && endYear <= end) {
                    res.add(mng);
                }
            }
        }
        return res;
    }

    private static ArrayList<Employee> searchByWages(ArrayList<Employee> employees, float amount) {
        ArrayList<Employee> emps = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getBasicWages() > amount) {
                emps.add(emp);
            }
        }
        return emps;
    }

    private static ArrayList<Employee> searchByName(ArrayList<Employee> employees, String name) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getFullName().getFirstName().compareToIgnoreCase(name) == 0) {
                res.add(emp);
            }
        }
        return res;
    }

    private static void showEmployee(ArrayList<Employee> employees) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-20s %-19s %-15s %-14s %-15s %-18s" +
                " %-17s %-16s %-15s %-11s\n", "Số thẻ căn cước",
                "Họ và tên", "Địa chỉ", "Ngày sinh", "Email",
                "Số điện thoại", "Mã nhân viên", "Vị trí",
                "Lương Cứng", "Kinh nghiệm");
        for (var emp : employees) {
            System.out.printf("%-20s %-19s %-15s %-14s %-15s %-18s" +
                    "%-17s %-16s %-15.1f %-11.1f\n", emp.getIdCard(),
                    emp.getFullNameStr(), emp.getAddress(),
                    dateFormat.format(emp.getDayOfBirth()),
                    emp.getEmail(), emp.getPhoneNumber(),
                    emp.getIdEmp(), emp.getPosition(),
                    emp.getBasicWages(), emp.getExperience());
        }
    }


    private static Manager creatManager(Scanner input) throws InvalidPersonException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Employee employee = createEmployee(input);
        System.out.println("Ngày bắt đầu nhiệm kỳ: ");
        Date start = null;
        try {
            start = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println("Đã xảy ra ngoại lệ ParseException");
            start = new Date();
        }
        System.out.println("Ngày kết thúc nhiệm kỳ: ");
        Date end = null;
        try {
            end = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println("Đã xảy ra ngoại lệ ParseException");
            end = new Date();
        }
        Manager manager = new Manager(employee, start, end);
        return manager;
    }

    private static Employee createEmployee(Scanner input) throws InvalidPersonException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Số thẻ căn cước: ");
        var idCard = input.nextLine();
        System.out.println("Họ và tên: ");
        var fullName = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Ngày sinh: ");
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Đã xảy ra ngoại lệ ParseException");
            dob = new Date();
        }
        System.out.println("Email: ");
        var mail = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phone = input.nextLine();
        System.out.println("Vị trí: ");
        var position = input.nextLine();
        System.out.println("Lương cứng: ");
        var basicWage = Float.parseFloat(input.nextLine());
        System.out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        System.out.println("Số ngày làm việc: ");
        var dim = Integer.parseInt(input.nextLine());

        Employee employee = new Employee(idCard, fullName, address,
                dob, mail, phone, null,
                position, basicWage, exp, dim);
        return employee;
    }

    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
