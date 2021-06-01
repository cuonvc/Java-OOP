package lesson43.Ex4;

import lesson43.Ex4.Comparator.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        int choice = 0;
        String fileName = "smp.txt";
        var smartphones = new ArrayList<Smartphone>(readFromFile(fileName));
        var input = new Scanner(System.in);
        do {
            System.out.println("1. Thêm mới một thiết bị.");
            System.out.println("2. Hiển thị danh sách thiết bị");
            System.out.println("3. Sắp xếp theo tên hãng từ a-z.");
            System.out.println("4. Sắp xếp theo giá bán giảm dần.");
            System.out.println("5. Sắp xếp theo giá tăng dần.");
            System.out.println("6. Sắp xếp từ cũ đến mới.");
            System.out.println("7. Sắp xếp từ mới đến cũ.");
            System.out.println("8. Ghi dữ liệu vào file smp.txt");
            System.out.println("0. Thoát chương trình.");
            System.out.println("==================================================");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showNoti("Đã thoát chương trình");
                    break;
                case 1:
                    Smartphone newDevice = null;
                    try {
                        newDevice = createDevice(input);
                        smartphones.add(newDevice);
                        showNoti("thêm thành công một thiết bị");
                    } catch (InvalidBrandException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Đã xảy ra ngoại lệ InvalidBrandException");
                    }
                    break;
                case 2:
                    if (smartphones.size() > 0) {
                        showNoti("danh sách thiết bị");
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 3:
                    if (smartphones.size() > 0) {
                        showNoti("Danh sách thiết bị từ a-z");
                        Collections.sort(smartphones, new SortByBrand());
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 4:
                    if (smartphones.size() > 0) {
                        showNoti("danh sách thiết có giá từ cao tới thấp");
                        Collections.sort(smartphones, new SortByPriceDown());
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 5:
                    if (smartphones.size() > 0) {
                        showNoti("danh sách thiết bị có giá từ thấp tới cao");
                        Collections.sort(smartphones, new SortByPrice());
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 6:
                    if (smartphones.size() > 0) {
                        showNoti("danh sách thiết bị từ cũ đến mới");
                        Collections.sort(smartphones, new SortByYear());
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 7:
                    if (smartphones.size() > 0) {
                        showNoti("danh sách thiết bị từ mới đến cũ");
                        Collections.sort(smartphones, new SortByYearDown());
                        showSmartphone(smartphones);
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                case 8:
                    if (smartphones.size() > 0) {
                        var isSuccess = writeToFile(smartphones, fileName);
                        if (isSuccess) {
                            showNoti("ghi file thành công");
                        } else {
                            showNoti("ghi file không thành công");
                        }
                    } else {
                        System.out.println("Danh sách trống");
                    }
                    break;
                default:
                    showNoti("Lỗi có pháp, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static boolean writeToFile(ArrayList<Smartphone> smartphones, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (var smp : smartphones) {
                printWriter.printf("%s - %s - %s - %s - %s - %s\n",
                        smp.getDeviceId(), smp.getBrand(),
                        smp.getDeviceName(), smp.getPrice(),
                        smp.getManufactureYear(), smp.getScreenSize());
            }
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static List<Smartphone> readFromFile(String fileName) {
        List<Smartphone> smartphones = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile();  //tạo mới file
            var input = new Scanner(file);  //lấy dữ liệu từ file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                var data = line.split(" - ");
                    Smartphone smartphone = createDataInFile(data);
                    if (smartphone != null) {
                        smartphones.add(smartphone);
                    }
                    input.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return smartphones;
    }

    private static Smartphone createDataInFile(String[] data) {
        var id = data[0];
        var brand = data[1];
        var name = data[2];
        var price = Double.parseDouble(data[3]);
        var year = Integer.parseInt(data[4]);
        var size = Float.parseFloat(data[5]);
        Smartphone smartphone = null;
        try {
            smartphone = new Smartphone(id, brand, name, price, year, size);
        } catch (InvalidBrandException e) {
            e.printStackTrace();
            smartphone = null;
        }
        return smartphone;
    }

    private static void showSmartphone(ArrayList<Smartphone> smartphones) {
        System.out.printf("%-16s %-16s %-17s %-12s %-17s %-19s\n",
                "Mã thiết bị", "Thương hiệu", "Tên thiết bị",
                "Giá bán", "Năm sản xuất", "Kích thước màn hình");
        for (var smp : smartphones) {
            System.out.printf("%-16s %-16s %-17s %-12.2f %-17d %-19.1f\n",
                    smp.getDeviceId(), smp.getBrand(), smp.getDeviceName(),
                    smp.getPrice(), smp.getManufactureYear(),
                    smp.getScreenSize());
        }
    }

    private static Smartphone createDevice(Scanner input) throws InvalidBrandException {
        System.out.println("Thương hiệu: ");
        var brand = input.nextLine();
        System.out.println("Tên thiết bị: ");
        var name = input.nextLine();
        System.out.println("Giá bán: ");
        var price = Double.parseDouble(input.nextLine());
        System.out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        System.out.println("Kích thức màn hình: ");
        var size = Float.parseFloat(input.nextLine());
        Smartphone smartphone = new Smartphone(null, brand, name, price, year, size);
            return smartphone;
    }

    private static void showNoti(String str) {
        System.out.println(">>>>>>>>>> " + str + " <<<<<<<<<<");
    }
}
