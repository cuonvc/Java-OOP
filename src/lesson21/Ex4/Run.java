package lesson21.Ex4;

import java.security.spec.ECParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.*;

public class Run {
    public static void main(String[] args) {
        var input = new Scanner(in);

        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>();
//        updateIdEmp(employees);  //phương thức này chỉ áp dụng cho đọc ghi file, còn lại thì ko có tác dụng
        do {
            out.println("1. Thêm mới một nhân viên.");
            out.println("2. Thông tin nhân viên.");
            out.println("3. Tìm nhân viên theo tên.");
            out.println("4. Tìm nhân viên có mức lương lớn hơn mức lương định mức.");
            out.println("5, Tìm giám đốc theo nhiệm kỳ.");
            out.println("6. Xóa nhân viên theo mã cho trước.");
            out.println("7. Tính và hiển thị bảng lương.");
            out.println("8. Ghi danh sách nhân viên vào file EMP.txt");
            out.println("0. Thoát chương trình.");
            out.println("=========> Chọn hành động <==========");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 0:
                    showNotify("Đã thoát chương trình");
                    break;
                case 1:
                    out.println("Chọn (1) thêm nhân viên, (2) thêm giám đốc");
                    int pick = Integer.parseInt(input.nextLine());
                    if (pick == 1) {
                        var newEmp = createEmp(input);
                        employees.add(newEmp);
                        showNotify("Thêm thành công một nhân viên");
                    } else if (pick == 2) {
                        var newMng = createMng(input);
                        employees.add(newMng);
                        showNotify("Tạo thành công một giám đốc");
                    } else {
                        showNotify("Sai cú pháp, vui lòng chọn lại");
                    }
                    break;
                case 2:
                    if (employees.size() > 0) {
                            showEmployee(employees);
                    } else {
                            showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 3:
                    if (employees.size() > 0) {
                        out.println("Nhập tên cần tìm: ");
                        var name = input.nextLine();
                        var result = searchByName(name, employees);
                        if (result.size() > 0) {
                            showNotify("Có " + result.size() + " kết quả cho " + name);
                        } else {
                            showNotify("Không có kết quả cho " + name);
                        }
                    } else {
                        showNotify("Danh sách nhân viên trống");
                    }
                    break;
                case 4:
                    if (employees.size() > 0) {
                        out.println("Nhập mức lương: ");
                        var wageLevel = Double.parseDouble(input.nextLine());
                        var result = searchByWage(wageLevel, employees);
                        if (result.size() > 0) {
                            showNotify("Có " + result.size() + " kết quả");
                            showEmployee(result);
                        } else {
                            showNotify("Không có kết quả");
                        }
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 5:  //chưa hoàn thành
                    if (employees.size() > 0) {
                        out.println("Năm bắt đầu nhiệm kỳ: ");
                        var start = Integer.parseInt(input.nextLine());
                        out.println("Năm kết thúc nhiệm kì: ");
                        var end = Integer.parseInt(input.nextLine());
                        var result = searchByTerm(start, end, employees);
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        out.println("Nhập mã nhân viên cần xóa: ");
                        var idRemove = input.nextLine();
                        var isDelete = removeById(idRemove, employees);
                        if (isDelete) {
                            showNotify("Xóa thành công nhân viên " + idRemove);
                        } else {
                            showNotify("Không thành công, thực hiện lại");
                        }
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                    break;
                case 7: //tính lương thành bảng (bao gồm lương cứng, thưởng, tổng lương)
                    if (employees.size() > 0) {
                        out.println("Nhập mã nhân viên cần tính: ");
                        var id = input.nextLine();
                        var existId = searchById(id, employees);
                        if (existId) {
                            calcularBasicWage(employees, id);
                            calcularBonus(employees, id);
                            calcularWage(employees, id);
                            //hiển thị bảng lương
                            showPayroll(employees, id);

                            //khoai quá!

                        } else {
                            showNotify("Nhân viên không tồn tại");
                        }
                    } else {
                        showNotify("Danh sách nhân viên rỗng");
                    }
                default:
                    showNotify("Sai cú pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }


    /**
     * phương thức hiển thị bảng lương
     * @param
     */
    private static void showPayroll(ArrayList<Employee> employees, String id) {
        out.printf("%-16s %-16s %-16s", "lương cứng", "Thưởng", "Thực nhận");

    }

    /**
     * phương thức tính lương cứng
     * @param employees
     * @param id
     * @return
     */
    private static void calcularBasicWage(ArrayList<Employee> employees, String id) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(id) == 0) {
                emp.getBasicWage();
            }
        }
    }

    /**
     * phương thức tính lương thực nhận
     * @param employees
     * @param id
     */
    private static void calcularWage(ArrayList<Employee> employees, String id) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(id) == 0) {
                emp.receiveSalary();
            }
        }

    }



    /**
     * phương thức tính thưởng
     * @param employees
     * @param id id của nv được tính
     */
    private static void calcularBonus(ArrayList<Employee> employees, String id) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(id) == 0) {
                emp.receiveBonus();
            }
        }

    }


    /**
     * phương thức kiểm tra xem mã nhân viên nhập vào có tồn tại ko
     * @param id mã nv nhập vào
     * @param employees
     * @return true hoặc false
     */
    private static boolean searchById(String id, ArrayList<Employee> employees) {
        for (var emp : employees) {
            if (emp.getIdEmp().compareTo(id) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức xóa nhân viên với mã cho trước
     * @param idRemove mã của nv cần xóa
     * @param employees
     * @return trả về true hoặc false
     */
    private static boolean removeById(String idRemove, ArrayList<Employee> employees) {
        for (var emp : employees) {
            if (idRemove.compareTo(emp.getIdEmp()) == 0) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm giám đốc theo nhiệm kỳ
     * @param start năm bắt đầu
     * @param end năm kết thúc
     * @param employees
     * @return trả về một ArrayList
     */
    private static ArrayList<Employee> searchByTerm(int start, int end, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        Calendar currentTime = Calendar.getInstance();   //trả về đối tượng calendar đại diện cho thời gian hiện tại
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var manager = (Manager) emp;
                currentTime.setTime(manager.getStartDay());
                var startTime = currentTime.get(Calendar.YEAR);
                currentTime.setTime(manager.getEndDay());
                var endTime = currentTime.get(Calendar.YEAR);
                if (startTime <= start && endTime >= end) {
                    res.add(manager);
                }
            }
        }
        return res;
    }


    /**
     * phương thức tìm nv theo mức lương
     * @param wageLevel mức lương định mức
     * @param employees
     * @return trả về một ArrayList
     */
    private static ArrayList<Employee> searchByWage(double wageLevel, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getWage() >= wageLevel) {
                res.add(emp);
            }
        }
        return res;
    }

    /**
     * phương thức tìm kiếm danh nhân viên theo tên
     * @param name tên cần tìm
     * @param employees
     * @return trả về danh sách chứa các đối tượng có tên giống nhau
     */
    private static ArrayList<Employee> searchByName(String name, ArrayList<Employee> employees) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getFullName().getLastName().compareToIgnoreCase(name) == 0) {
                res.add(emp);
            }
        }
        return res;
    }


    /**
     * phương thức hiển thị dnah sách giám đốc
     * @param managers
     */
    private static void showManager(ArrayList<Manager> managers) {
        out.printf("%-20s %-18s %-12s %-14s %-22s %-18s %-17s %-16s %-16s\n",
                "Số thẻ căn cước", "Họ và tên", "Địa chỉ", "Ngày sinh", "Email", "Số điện thoại",
                "Mã nhân viên", "Vị trí", "Kinh nghiệm");
        for (var mng : managers) {
            showInfoMng(mng);
        }
    }

    /**
     * phương thức cập nhật mãnhan viên mới
     * @param employees
     */
    private static void updateIdEmp(ArrayList<Employee> employees) {
        var max = 1000;
        for (var emp : employees) {
            var currentIdInt = Integer.parseInt(emp.getIdEmp());
            if (currentIdInt > max) {
                max = currentIdInt;
            }
        }
        Employee.setNextId(max + 1);
    }

    /**
     * phương thức hiển thị danh sách nhân viên
     * @param employees danh sách nhân viên
     */
    private static void showEmployee(ArrayList<Employee> employees) {
        out.printf("%-20s %-18s %-12s %-14s %-22s %-18s %-17s %-16s %-16s\n",
                "Số thẻ căn cước", "Họ và tên", "Địa chỉ", "Ngày sinh", "Email", "Số điện thoại",
                "Mã nhân viên", "Vị trí", "Kinh nghiệm");
        for (var emp : employees) {
            showInfoEmp(emp);
        }
    }

    /**
     * phương thức hiển thị thông tin của giám đốc
     * @param emp đối tượng (giám đốc) được hiển thị thông tin
     */
    private static void showInfoMng(Employee emp) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        out.printf("%-20s %-18s %-12s %-14s %-22s %-18s %-17s %-16s %-16.1f\n",
                emp.getIdCard(), emp.getFullNameStr(), emp.getAddress(),
                dateFormat.format(emp.getDayOfBirth()), emp.getEmail(), emp.getPhoneNumber(),
                emp.getIdEmp(), emp.getPosition(), emp.getExperience());
    }

    /**
     * phương thức hiển thị thông tin nhân viên
     * @param emp đối tượng (nhân viên) được hiển thị thông tin
     */
    private static void showInfoEmp(Employee emp) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        out.printf("%-20s %-18s %-12s %-14s %-22s %-18s %-17s %-16s %-16.1f\n",
                emp.getIdCard(), emp.getFullNameStr(), emp.getAddress(),
                dateFormat.format(emp.getDayOfBirth()), emp.getEmail(), emp.getPhoneNumber(),
                emp.getIdEmp(), emp.getPosition(), emp.getExperience());
    }

    /**
     * phương thức tạo mới một giám đốc
     * @param input đối tượng của Scanner
     * @return trả về đối tương vừa tạo
     */
    private static Manager createMng(Scanner input) {
        Employee employee = createEmp(input);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        out.println("Ngày bắt đầu nhiệm kỳ: ");
        Date start = null;
        try {
            start = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            start = new Date();  //nhập sai thì mặc định là hôm nay
        }
        out.println("Ngày kết thúc nhiệm kỳ: ");
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
     * phương thức tạo mới một đối tượng nhân viên
     * @param input đối tượng của Scanner
     * @return trả về đối tượng đó
     */
    private static Employee createEmp(Scanner input) {
        out.println("Số thẻ căn cước: ");
        var id = input.nextLine();
        out.println("HỌ và tên: ");
        var name = input.nextLine();
        out.println("Địa chỉ: ");
        var address = input.nextLine();
        out.println("Ngày sinh: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dayOfBirth = null;
        try {
            dayOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dayOfBirth = new Date();  //nếu nhập lại thì mặc định là ngày hôm nay
        }
        out.println("Email: ");
        var mail = input.nextLine();
        out.println("Số điện thoại: ");
        var phone = input.nextLine();
        out.println("vị trí: ");
        var position = input.nextLine();
        out.println("Lương cứng: ");
        var basicWage = Double.parseDouble(input.nextLine());
        out.println("Kinh nghiệm");
        var exp = Float.parseFloat(input.nextLine());
        out.println("Số ngày làm việc trong tháng: ");
        var dom = Integer.parseInt(input.nextLine());
        //vì basicWage, Wage và bonus không dùng đến nên cho = 0
        Employee employee = new Employee(id, name, address, dayOfBirth, mail, phone,
                null, position, basicWage,  exp, dom, 0, 0);
        return employee;
    }

    /**
     * phương thức hiển thị thông báo cho từng trạng thái của hành động
     * @param str nội dung thông báo
     */
    private static void showNotify(String str) {
        out.println(">>>>>>>> " + str + " <<<<<<<<<");
    }
}
